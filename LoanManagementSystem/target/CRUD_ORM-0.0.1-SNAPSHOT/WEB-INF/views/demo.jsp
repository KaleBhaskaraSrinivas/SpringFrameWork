<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box
}

body {
	font-family: "Lato", sans-serif;
}

/* Style the tab container */
.tab {
	overflow: hidden;
	background-color: #29ddc5; /* Background color for the tab container */
}

/* Style the buttons inside the tab */
.tab button {
	background-color: inherit;
	color: black /* Text color for the buttons */
      float: left;
	border: none;
	outline: none;
	text-align: center;
	cursor: pointer;
	transition: 0.3s;
	font-size: 15px;
	margin-right: 20px; /* Add some space between buttons */
	padding: 10px 20px; /* Padding for the buttons */
	border-radius: 5px; /* Rounded corners for the buttons */
}

/* Change background color of buttons on hover */
.tab button:hover {
	background-color: white; /* Background color on hover */
}

/* Create an active/current "tab button" class */
.tab button.active {
	background-color: green;
	/* Background color for the active tab button */
	color: #333; /* Text color for the active tab button */
}

/* Style the tab content */
.tabcontent {
	display: none;
	padding: 20px 12px;
	border: 6px solid #42853b;
	width: 50%;
	height: 700px;
	background-color: rgb(183, 250, 209);
	/* Background color for the tab content */
	color: black; /* Text color for the tab content */
	border-radius: 25px; /* Rounded corners for the tab content */
}

/* Show the active tab */
.active-tab {
	display: block;
}
</style>
</head>
<body>
		<h1>Enter the details</h1>

		<div class="tab">
			<button class="tablinks active" onclick="buttonActivity(event, 'customer')" id="defaultOpen">customer</button>
			<button class="tablinks" onclick="buttonActivity(event, 'Nominee')"> Nominee </button>
			<button class="tablinks" onclick="buttonActivity(event, 'LoanApplicant')">LoanApplicant</button>
		</div>
		
		
		<form action="/LoanManagementSystem/submitLoanApplication" method="get">
		
		
		<div id="customer" class="tabcontent active-tab">
			<h3>customer</h3>
			
		<label for="custid">Customer ID:</label>
        <input type="text" id="custid" name="custid" required><br><br>
        
        <label for="custfirstname">First Name:</label>
        <input type="text" id="custfirstname" name="custfirstname" required><br><br>
        
        <label for="custlastname">Last Name:</label>
        <input type="text" id="custlastname" name="custlastname" required><br><br>
        
        <label for="custdob">Date of Birth:</label>
        <input type="date" id="custdob" name="custdob" required><br><br>
        
        <label for="custpanno">PAN Number:</label>
        <input type="text" id="custpanno" name="custpanno" required><br><br>
        
        <label for="custmobile">Mobile Number:</label>
        <input type="text" id="custmobile" name="custmobile" required><br><br>
        
        <label for="custaddress">Address:</label>
        <textarea id="custaddress" name="custaddress" required></textarea><br><br>
        
        <label for="custgname">Guardian Name:</label>
        <input type="text" id="custgname" name="custgname" required><br><br>
        
        <label for="custluudate">Last Update Date:</label>
        <input type="date" id="custluudate" name="custluudate" required><br><br>
        
        <label for="custluser">Last User:</label>
        <input type="text" id="custluser" name="custluser" required><br><br>
		</div>



		<div id="Nominee" class="tabcontent">
			<h3>Nominee</h3>
			 <label for="lnapid">Loan Applicant ID:</label>
        <input type="text" id="lnapid1" name="lnapid1" required><br><br>
        
        <label for="lnapnominee">Nominee Name:</label>
        <input type="text" id="lnapnominee" name="lnapnominee" required><br><br>
        
        <label for="lnaprelation">Relationship with Applicant:</label>
        <input type="text" id="lnaprelation" name="lnaprelation" required><br><br>
		</div>



		<div id="LoanApplicant" class="tabcontent">
			<h3>LoanApplicant</h3>
			<label for="lnapid">Loan Applicant ID:</label>
        <input type="text" id="lnapid2" name="lnapid2" required><br><br>
        
        <label for="lnapcustid">Customer ID:</label>
        <input type="text" id="lnapcustid" name="lnapcustid" required><br><br>
        
        <label for="lnapapdate">Application Date:</label>
        <input type="date" id="lnapapdate" name="lnapapdate" required><br><br>
        
        <label for="lnaplntyid">Loan Type ID:</label>
        <input type="text" id="lnaplntyid" name="lnaplntyid" required><br><br>
        
        <label for="lnapamount">Loan Amount:</label>
        <input type="text" id="lnapamount" name="lnapamount" required><br><br>
        
        <label for="lnapemirangefrom">EMI Range From:</label>
        <input type="text" id="lnapemirangefrom" name="lnapemirangefrom" required><br><br>
        
        <label for="lnapemirangeto">EMI Range To:</label>
        <input type="text" id="lnapemirangeto" name="lnapemirangeto" required><br><br>
        
        <label for="lnapnomrequested">Nominee Requested Amount:</label>
        <input type="text" id="lnapnomrequested" name="lnapnomrequested" required><br><br>
        
        <label for="lnapcibilscore">CIBIL Score:</label>
        <input type="text" id="lnapcibilscore" name="lnapcibilscore" required><br><br>
        
        <label for="lnapstatus">Status:</label>
        <input type="text" id="lnapstatus" name="lnapstatus" required><br><br>
        
        <label for="lnapconclusionremarks">Conclusion Remarks:</label>
        <textarea id="lnapconclusionremarks" name="lnapconclusionremarks" rows="4" cols="50" required></textarea><br><br>
        
        <label for="lnapprocesseduser">Processed User:</label>
        <input type="text" id="lnapprocesseduser" name="lnapprocesseduser" required><br><br>
        
        <label for="lnapprocessedDate">Processed Date:</label>
        <input type="date" id="lnapprocessedDate" name="lnapprocessedDate" required><br><br>
		</div>
		
		
		<input type="submit">
		
		
		</form>

		<script>
			function buttonActivity(evt, cityName) {
				var i, tabcontent, tablinks;
				tabcontent = document.getElementsByClassName("tabcontent");
				for (i = 0; i < tabcontent.length; i++) {
					tabcontent[i].style.display = "none";
				}
				tablinks = document.getElementsByClassName("tablinks");
				for (i = 0; i < tablinks.length; i++) {
					tablinks[i].className = tablinks[i].className.replace(
							" active", "");
				}
				document.getElementById(cityName).style.display = "block";
				evt.currentTarget.className += " active";
			}

			// Get the element with id="defaultOpen" and click on it
			document.getElementById("defaultOpen").click();
		</script>
</body>
</html>
