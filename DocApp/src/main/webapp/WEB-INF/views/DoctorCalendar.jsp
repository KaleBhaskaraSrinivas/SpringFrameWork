<!DOCTYPE html>
<html>
<head>
    <title>Calendar Layout with Selectable Date Tiles</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        .calendar {
            margin: 0 auto;
        }

        .calendar-day {
            width: 14.28%; 
            display: inline-block;
            text-align: center;
            padding: 10px 0;
            cursor: pointer;
        }

        .available { background-color: #bff5cb; }
        .not-available { background-color: #d3d3d3; }

    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="calendar">
            <div class="calendar-header text-center m-5">
                <h3 id="currentMonth">July 2023</h3>
            </div>
            <div class="calendar-dates m-5">
            </div>
            <div class="container-fluid m-5">
            	<button id="prevMonthBtn" class="btn btn-primary">Previous Month</button>
                <button id="nextMonthBtn" class="btn btn-primary">Next Month</button>
            </div>
        </div>
        <div class="container-fluid" id="slotDropdown"></div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    <script>
    $(document).ready(function () {
        var slotsData = null;
        const queryString = window.location.search;
        const queryParams = new URLSearchParams(queryString);
        const doctorid = queryParams.get('doctorid');
        const url = "/DocApp/getDoctorSchedule?doctorid=" + doctorid;

        $.ajax({
            url: url,
            success: function(response){
                console.log(response);
                slotsData = response;
                var currentDate = new Date(2023, 7, 1);
                var currentMonthDisplay = $('#currentMonth');
                var calendarDates = $('.calendar-dates');
                var slotDropdown = $('#slotDropdown');
                
                function renderCalendar() {
                    calendarDates.empty();
                    slotDropdown.empty();

                    var firstDay = new Date(currentDate.getFullYear(), currentDate.getMonth(), 1).getDay();
                    var lastDate = new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 0).getDate();

                    for (var i = 1; i <= lastDate; i++) {
                        var date = new Date(currentDate.getFullYear(), currentDate.getMonth(), i);
                        var dayOfWeek = date.getDay();
                        var dateDiv = $('<div>', { class: 'calendar-day' }).html(i + '<br>' + getDayOfWeekName(dayOfWeek));
                        
                        dateDiv.on('click', function () {
                            var selectedDate = new Date(currentDate.getFullYear(), currentDate.getMonth(), parseInt($(this).text()));
                            var slots = getAvailableSlotsForDate(selectedDate);
                            
                            slotDropdown.empty();
                            if (slots.length > 0) {
                                var select = $('<select>', { id: 'slotsSelect', class: 'form-select' });
                                select.append($('<option>', { value: '' }).text('Select a slot'));
                                slots.forEach(function(slot) {
                                    select.append($('<option>', { value: slot.slotid }).text(slot.slotfrom + ' - ' + slot.slotto));
                                });
                                slotDropdown.append(select);
                            } else {
                                slotDropdown.text('No available slots for selected date.');
                            }
                        });

                        var slots = getAvailableSlotsForDate(date);
                        if (slots.length > 0) {
                            dateDiv.addClass('available');
                        } else {
                            dateDiv.addClass('not-available');
                        }

                        calendarDates.append(dateDiv);
                    }

                    var monthOptions = { year: 'numeric', month: 'long' };
                    currentMonthDisplay.text(currentDate.toLocaleDateString('en-US', monthOptions));
                }

                function getDayOfWeekName(dayOfWeek) {
                    var daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
                    return daysOfWeek[dayOfWeek];
                }

                function getAvailableSlotsForDate(date) {
                    return slotsData.filter(function (slot) {
                        return slot.slotdate === formatDate(date) && slot.slotstatus === 'available';
                    });
                }

                function formatDate(date) {
                    var year = date.getFullYear();
                    var month = (date.getMonth() + 1).toString().padStart(2, '0');
                    var day = date.getDate().toString().padStart(2, '0');
                    return year + '-' + month + '-' + day;
                }

                renderCalendar();

                $('#prevMonthBtn').on('click', function () {
                    currentDate.setMonth(currentDate.getMonth() - 1);
                    renderCalendar();
                });

                $('#nextMonthBtn').on('click', function () {
                    currentDate.setMonth(currentDate.getMonth() + 1);
                    renderCalendar();
                });
            }
        });
    });

    </script>
</body>
</html>
