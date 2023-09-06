<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
    box-sizing: border-box;
}

body {
    font-family: "Lato", sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
}

.container {
    max-width: 800px;
    margin: 0 auto;
    padding: 20px;
    background-color: #fff;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
    text-align: center;
    color: #333;
}

.tab {
    overflow: hidden;
}

.tab button {
    background-color: inherit;
    color: black;
    float: left;
    border: none;
    outline: none;
    text-align: center;
    cursor: pointer;
    transition: 0.3s;
    font-size: 15px;
    margin-right: 20px;
    padding: 10px 20px;
    border-radius: 5px;
}

.tab button:hover {
    background-color: blue;
}

.tab button.active {
    background-color: skyblue;
    color: #333;
}

.tabcontent {
    display: none;
    padding: 20px 12px;
    border: 6px solid #42853b;
    background-color: rgb(183, 250, 209);
    color: black;
    border-radius: 25px;
}

.active-tab {
    display: block;
}

.tablinks {
    transition: background-color 0.3s;
}

.tablinks.active {
    background-color: green;
}

label {
    display: block;
    margin-bottom: 5px;
    font-weight: bold;
}

input[type="text"], input[type="number"], input[type="date"], textarea {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 3px;
    font-size: 14px;
}

/* Style submit button */
input[type="submit"] {
    background-color: #29ddc5;
    color: #fff;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
}

/* Style validation error messages */
.error {
    color: red;
}
</style>
</head>
<body>
<div class="container">
    <h1>Enter the details</h1>
    <div class="tab">
        <button class="tablinks active" onclick="buttonActivity(event, 'customer')" id="defaultOpen">Customer</button>
        <button class="tablinks" onclick="buttonActivity(event, 'Nominee')">Nominee</button>
        <button class="tablinks" onclick="buttonActivity(event, 'LoanApplicant')">LoanApplicant</button>
    </div>
    <form action="/LoanManagementSystem/submitLoanApplication" method="get" onsubmit="storeFormData()">
        <div id="customer" class="tabcontent active-tab">
            <h3>Customer</h3>
            <label for="custid">Customer ID:</label> <input type="number" id="custid" name="custid" required><br> <br>
            <label for="custfirstname">First Name:</label> <input type="text" id="custfirstname" name="custfirstname" required><br>
            <br> <label for="custlastname">Last Name:</label> <input type="text" id="custlastname" name="custlastname" required><br>
            <br> <label for="custdob">Date of Birth:</label> <input type="date" id="custdob" name="custdob" required><br>
            <br> <label for="custpanno">PAN Number:</label> <input type="text" id="custpanno" name="custpanno" required><br>
            <br> <label for="custmobile">Mobile Number:</label> <input type="number" id="custmobile" name="custmobile" required><br>
            <br> <label for="custaddress">Address:</label>
            <textarea id="custaddress" name="custaddress" required></textarea>
            <br> <br> <label for="custgname">Guardian Name:</label> <input type="text" id="custgname" name="custgname" required><br>
            <br> <label for="custluudate">Last Update Date:</label> <input type="date" id="custluudate" name="custluudate" required><br>
            <br> <label for="custluser">Last User:</label> <input type="number" id="custluser" name="custluser" required><br>
            <br>
        </div>
        <div id="Nominee" class="tabcontent">
            <h3>Nominee</h3>
            <label for="lnapid">Loan Applicant ID:</label> <input type="number" id="lnapid1" name="lnapid1" required><br>
            <br> <label for="lnapnominee">Nominee Name:</label> <input type="text" id="lnapnominee" name="lnapnominee" required><br> <br>
            <label for="lnaprelation">Relationship with Applicant:</label> <input type="text" id="lnaprelation" name="lnaprelation" required><br>
            <br>
        </div>
        <div id="LoanApplicant" class="tabcontent">
            <h3>LoanApplicant</h3>
            <label for="lnapid">Loan Applicant ID:</label> <input type="number" id="lnapid2" name="lnapid2" required><br>
            <br> <label for="lnapcustid">Customer ID:</label> <input type="number" id="lnapcustid" name="lnapcustid" required><br>
            <br> <label for="lnapapdate">Application Date:</label> <input type="date" id="lnapapdate" name="lnapapdate" required><br>
            <br> <label for="lnaplntyid">Loan Type ID:</label> <input type="number" id="lnaplntyid" name="lnaplntyid" required><br>
            <br> <label for="lnapamount">Loan Amount:</label> <input type="number" id="lnapamount" name="lnapamount" required><br>
            <br> <label for="lnapemirangefrom">EMI Range From:</label> <input type="number" id="lnapemirangefrom" name="lnapemirangefrom" required><br>
            <br> <label for="lnapemirangeto">EMI Range To:</label> <input type="number" id="lnapemirangeto" name="lnapemirangeto" required><br>
            <br> <label for="lnapnomrequested">Nominee Requested Amount:</label> <input type="number" id="lnapnomrequested" name="lnapnomrequested" required><br>
            <br> <label for="lnapcibilscore">CIBIL Score:</label> <input type="number" id="lnapcibilscore" name="lnapcibilscore" required><br>
            <br> <label for="lnapstatus">Status:</label> <input type="text" id="lnapstatus" name="lnapstatus" required><br>
            <br> <label for="lnapconclusionremarks">Conclusion Remarks:</label>
            <textarea id="lnapconclusionremarks" name="lnapconclusionremarks" rows="4" cols="50" required></textarea>
            <br> <br> <label for="lnapprocesseduser">Processed User:</label> <input type="number" id="lnapprocesseduser" name="lnapprocesseduser" required><br>
            <br> <label for="lnapprocessedDate">Processed Date:</label> <input type="date" id="lnapprocessedDate" name="lnapprocessedDate" required><br>
            <br>
        </div>
        <br> <br>
        <center>
            <input type="submit" value="Go to preview">
        </center>
    </form>
</div>
<script>
    function buttonActivity(evt, cityName) {
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].classList.remove("active");
        }
        document.getElementById(cityName).style.display = "block";
        evt.currentTarget.classList.add("active");
    }
    document.getElementById("defaultOpen").click();
</script>
</body>
</html>
