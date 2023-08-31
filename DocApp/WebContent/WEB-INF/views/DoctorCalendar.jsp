<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Calendar Layout with Selectable Date Tiles</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
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

.red {
	background-color: #db9393;
}

.blue {
	background-color: #abebe6;
}

.yellow {
	background-color: #f2eebd;
}

.green {
	background-color: #bff5cb;
}
</style>
</head>
<body>
	<div class="container mt-5">
		<div class="calendar">
			<div class="calendar-header text-center m-5">
				<h3 id="currentMonth">July 2023</h3>
			</div>
			<div class="calendar-dates m-5"></div>
			<div class="container-fluid m-5">
				<button id="prevMonthBtn" class="btn btn-primary">Previous
					Month</button>
				<button id="nextMonthBtn" class="btn btn-primary">Next
					Month</button>
			</div>
		</div>
	</div>
	
	<c:forEach items="${doctorSchedule}" var="daySchedule">
		<div class="col-md-4 mb-4">
			<div class="card">
				<div class="card-body">
					<h5 class="card-text">${daySchedule.slotid}</h5>
					<h5 class="card-text">${daySchedule.slotdoctorid}</h5>
					<h5 class="card-text">${daySchedule.slotdate}</h5>
					<h5 class="card-text">${daySchedule.slotfrom}</h5>
					<h5 class="card-text">${daySchedule.slotto}</h5>
					<h5 class="card-text">${daySchedule.slotstatus}</h5>
				</div>
			</div>
		</div>
	</c:forEach>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

	<script>
        $(document).ready(function () {
            var currentDate = new Date(2023, 6, 1);
            var currentMonthDisplay = $('#currentMonth');
            var calendarDates = $('.calendar-dates');
            var colorArray = ['red', 'blue', 'yellow', 'green'];
            
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
