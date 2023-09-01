$(document).ready(function() {
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

			dateDiv.on('click', function() {
			});

			calendarDates.append(dateDiv);
		}

		var monthOptions = { year: 'numeric', month: 'long' };
		currentMonthDisplay.text(currentDate.toLocaleDateString('en-US', monthOptions));
	}

	renderCalendar();

	$('#prevMonthBtn').on('click', function() {
		currentDate.setMonth(currentDate.getMonth() - 1);
		renderCalendar();
	});

	$('#nextMonthBtn').on('click', function() {
		currentDate.setMonth(currentDate.getMonth() + 1);
		renderCalendar();
	});
});
