# SpringFrameWork

"doctorid"	"doctorslotindex"	"doctorschedule"	"doctoravailablefrom"	"doctoravailableto"	"doctoravailableslot"
1	1	"135"	"09:00:00"	"12:00:00"	15
1	2	"246"	"14:00:00"	"17:00:00"	30
2	1	"135"	"10:00:00"	"13:00:00"	15
2	2	"246"	"15:00:00"	"18:00:00"	30
3	1	"146"	"08:00:00"	"11:00:00"	15
3	2	"127"	"09:00:00"	"12:00:00"	20
4	1	"135"	"14:00:00"	"17:00:00"	15
4	2	"246"	"10:00:00"	"13:00:00"	30
5	1	"257"	"15:00:00"	"18:00:00"	20
5	2	"346"	"08:00:00"	"11:00:00"	10
6	1	"12345"	"11:00:00"	"13:00:00"	30
7	1	"147"	"16:00:00"	"19:00:00"	15
8	1	"267"	"09:00:00"	"12:00:00"	35
9	1	"3467"	"14:30:00"	"17:30:00"	20
10	1	"67"	"14:30:00"	"17:30:00"	10

this is table 1

slotid, slotdoctorid, slotdate, slotfrom , slotto , slotstatus 

this is table 2

take each row from table 1 , create slots to insert it into table 2 
for example 

slotid - 1 ( auto increment ),
slotdoctorid - 1 ( doctorid from table 1) ,
slotdate - todays date, 
slotfrom - doctoravailabefrom ,
slotto - doctoravailabefrom + doctoravailbleslot  ,
slotstatus - 
available if day of week is in doctorschedule of table 1
not availabe if day of week is not in doctorschedule of table 1

for example if day of week is 1 and doctorschedule is 135 consider 1 is in 135 so the slotstatus will be availabe , if day of week is 1 and doctorschedule is 245 consider 1 not in 245 so the slotstatus is not available

so slots must be created from doctoravailablefrom to doctoravailableto with the intervals 
for example doctoravailableslot is 15 then 12 slot entries will be in table 2 for doctor with id 1 

create a postgresql function to do the above which will take date input and perform the above task
