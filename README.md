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






-- Create a function to update available days and regenerate slots
CREATE OR REPLACE FUNCTION update_available_days_and_slots(doctor_id INT, new_available_days INT) RETURNS VOID AS $$
DECLARE
    start_date DATE := CURRENT_DATE;
    end_date DATE := CURRENT_DATE + new_available_days; -- Calculate end date based on available days
BEGIN
    -- Update the available_days in doctoravailable_range table
    UPDATE doctoravailable_range
    SET available_days = new_available_days
    WHERE doctor_id = doctor_id;
    
    -- Delete existing calendar entries for the doctor
    DELETE FROM AppointmentsSlotCalendar
    WHERE "slotdoctorid" = doctor_id
    AND "slotdate" >= start_date
    AND "slotdate" <= end_date;
    
    -- Iterate through doctor's available time slots
    FOR slot_record IN (
        SELECT "doctoravailablefrom"::time, "doctoravailableto"::time, "doctoravailableslot", "doctorschedule"
        FROM doctorschedule_bhaskar
        WHERE "doctorid" = doctor_id
    ) 
    LOOP
        -- Iterate through each day and recreate the slots
        FOR i IN 0..new_available_days - 1 LOOP
            -- Calculate the date based on the current day offset
            DECLARE today_date DATE := CURRENT_DATE + i * INTERVAL '1 day';

            -- Check if today's date is included in the doctor's schedule
            IF position(EXTRACT(ISODOW FROM today_date)::text in slot_record.doctorschedule) > 0 THEN
                -- Calculate the slot intervals
                FOR j IN 0..((EXTRACT(EPOCH FROM (slot_record.doctoravailableto - slot_record.doctoravailablefrom)) / 60) / slot_record.doctoravailableslot - 1)::integer LOOP
                    -- Calculate the slot's start and end times
                    INSERT INTO AppointmentsSlotCalendar ("slotdoctorid", "slotdate", "slotfrom", "slotto", "slotstatus")
                    VALUES (
                        doctor_id,
                        today_date,
                        slot_record.doctoravailablefrom + (j * slot_record.doctoravailableslot || ' minutes')::interval,
                        slot_record.doctoravailablefrom + ((j + 1) * slot_record.doctoravailableslot || ' minutes')::interval,
                        'available'
                    );
                END LOOP;
            END IF;
        END LOOP;
    END LOOP;
END;
$$ LANGUAGE plpgsql;

-- Create the trigger
CREATE OR REPLACE FUNCTION update_available_days_trigger()
RETURNS TRIGGER AS $$
BEGIN
    PERFORM update_available_days_and_slots(NEW.doctor_id, NEW.available_days);
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Attach the trigger to doctoravailable_range table
DROP TRIGGER IF EXISTS doctor_range_update_trigger ON doctoravailable_range;
CREATE TRIGGER doctor_range_update_trigger
AFTER INSERT OR UPDATE OF available_days
ON doctoravailable_range
FOR EACH ROW
EXECUTE FUNCTION update_available_days_trigger();

        
        -- Reset start_date for the next doctor
        start_date := CURRENT_DATE;
    END LOOP;
END $$;
select * from AppointmentsSlotCalendar
