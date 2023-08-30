<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>


<body>
	<div class="container">
		<h1 class="mt-4">Doctors Information</h1>
		<form action="/DocApp/doctorCalendar">
			<div class="row" id="doctor-list"></div>
			<input type="hidden" name="doctorid" id="selected-doctorid">
		</form>
	</div>

	<script type="text/javascript">
 $.ajax({
	 url: "/DocApp/getDoctorsList",
	 success: (doctorsData)=>{
		 console.log(doctorsData);
		 renderDoctorsData(doctorsData);
	 }
 }); 
 
 function renderDoctorsData(data) {
     var doctorListDiv = $("#doctor-list");
     data.forEach(function(doctor) {
    	 const btn = $("<button>").addClass("btn btn-primary").text("View Availability");
         var card = $("<div>").addClass("col-md-4 mb-4")
             .append(
                 $("<div>").addClass("card").append(
                     $("<div>").addClass("card-body").append(
                         $("<h5>").addClass("card-title").text(doctor.fullname),
                         $("<p>").addClass("card-text").text("Specialized in " + doctor.specializationname),
                         $("<p>").addClass("card-text").text("Qualification " + doctor.qualification),
                         $("<p>").addClass("card-text").text(doctor.experience + " years of experience"),
                         btn
                     )
                 )
             );
         card.attr({
        	 name: "doctorid",
        	 value: doctor.doctorid
         });
         btn.on("click", function() {
        	 $("#selected-doctorid").val(doctor.doctorid);
             $("form").submit();
         });
         doctorListDiv.append(card);
     });
 }

 
</script>

</body>
</html>