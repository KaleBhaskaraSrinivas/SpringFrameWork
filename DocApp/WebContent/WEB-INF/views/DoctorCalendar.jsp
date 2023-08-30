<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Calendar Layout with Selectable Date Tiles</title>
    <!-- Link to Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        /* Custom CSS for calendar */
        .calendar {
            margin: 0 auto;
        }

        .calendar-day {
            width: 14.28%; /* 100% divided by 7 days */
            display: inline-block;
            text-align: center;
            padding: 10px 0;
            cursor: pointer;
        }

        .red { background-color: #db9393; }
        .blue { background-color: #abebe6; }
        .yellow { background-color: #f2eebd; }
        .green { background-color: #bff5cb; }

        .selected {
            background-color: #007bff;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="calendar">
            <div class="calendar-header text-center">
                <h3 id="currentMonth">July 2023</h3>
                <button id="prevMonthBtn" class="btn btn-primary">&lt; Previous Month</button>
                <button id="nextMonthBtn" class="btn btn-primary">Next Month &gt;</button>
            </div>
            <div class="calendar-dates">
                <!-- Calendar dates will be added dynamically here using JavaScript -->
            </div>
        </div>
    </div>

    <!-- Link to Bootstrap JS (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    <!-- Your custom JS -->
    <script>
        $(document).ready(function () {
            var currentDate = new Date(2023, 6, 1); // July 2023 (months are 0-based)
            var currentMonthDisplay = $('#currentMonth');
            var calendarDates = $('.calendar-dates');
            var colorArray = ['red', 'blue', 'yellow', 'green']; // Array of colors
            
            function renderCalendar() {
                calendarDates.empty();
                
                var firstDay = new Date(currentDate.getFullYear(), currentDate.getMonth(), 1).getDay();
                var lastDate = new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 0).getDate();
                
                for (var i = 1; i <= lastDate; i++) {
                    var date = new Date(currentDate.getFullYear(), currentDate.getMonth(), i);
                    var dayOfWeek = date.toLocaleDateString('en-US', { weekday: 'short' });
                    var colorClass = colorArray[(i - 1) % colorArray.length]; 
                    var dateDiv = $('<div>', { class: 'calendar-day ' + colorClass }).html(i + '<br>' + dayOfWeek);
                    
                    dateDiv.on('click', function () {
                        $('.calendar-day').removeClass('selected');
                        $(this).toggleClass('selected');
                    });
                    
                    calendarDates.append(dateDiv);
                }
                
                var monthOptions = { year: 'numeric', month: 'long' };
                currentMonthDisplay.text(currentDate.toLocaleDateString('en-US', monthOptions));
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
        });
    </script>
</body>
</html>
