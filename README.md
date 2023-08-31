CREATE OR REPLACE FUNCTION create_slots_for_doctor(doctor_id integer, today_date date) RETURNS void AS $$
DECLARE
    slot_record RECORD;
BEGIN
    -- Iterate through doctor's available time slots
    FOR slot_record IN
        SELECT
            "doctorid",
            "doctorslotindex",
            "doctoravailablefrom"::time,
            "doctoravailableto"::time,
            "doctoravailableslot",
            "doctorschedule"
        FROM
            doctorschedule_bhaskar
        WHERE
            "doctorid" = doctor_id
    LOOP
        -- Check if today's date is included in the doctor's schedule
        IF position(EXTRACT(ISODOW FROM today_date)::text in slot_record.doctorschedule) > 0 THEN
            -- Calculate the slot intervals
            FOR i IN 0..((EXTRACT(EPOCH FROM (slot_record.doctoravailableto - slot_record.doctoravailablefrom)) / 60) / slot_record.doctoravailableslot - 1)::integer
            LOOP
                -- Calculate the slot's start and end times
                INSERT INTO AppointmentsSlotCalendar ("slotdoctorid", "slotdate", "slotfrom", "slotto", "slotstatus")
                VALUES (
                    slot_record.doctorid,
                    today_date,
                    slot_record.doctoravailablefrom + (i * slot_record.doctoravailableslot || ' minutes')::interval,
                    slot_record.doctoravailablefrom + ((i + 1) * slot_record.doctoravailableslot || ' minutes')::interval,
                    'available'
                );
            END LOOP;
        END IF;
    END LOOP;
END;
$$ LANGUAGE plpgsql;


SELECT create_slots_for_doctor(1, '2023-08-31');


DO $$ 
DECLARE
    doctor_id INT;
    start_date DATE := CURRENT_DATE;
    end_date DATE := CURRENT_DATE + INTERVAL '30 days';
BEGIN
    -- Loop through each doctor
    FOR doctor_id IN 1..10 LOOP
        -- Loop through each date in the range
        WHILE start_date <= end_date LOOP
            -- Call the function for each doctor and date
            EXECUTE 'SELECT create_slots_for_doctor(' || doctor_id || ', ''' || start_date || ''')';

            -- Move to the next day
            start_date := start_date + INTERVAL '1 day';
        END LOOP;
        
        -- Reset start_date for the next doctor
        start_date := CURRENT_DATE;
    END LOOP;
END $$;
select * from AppointmentsSlotCalendar
