<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Loan Application Preview</title>
    <style>
        body {
            font-family: "Arial", sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        
        h1 {
            text-align: center;
            color: #333;
        }
        h2 {
            color: #29ddc5;
            margin-top: 20px;
        }
        p {
            margin-bottom: 10px;
        }
        a,button {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background-color: #29ddc5;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        a:hover,button:hover {
            background-color: #1a9b84;
        }
        .back-link {
            float: left;
        }
        .submit-link {
            float: right;
        }
    </style>
</head>
<body>
  <form action="/loan/save" method="POST">
    <div class="container">
        <input type="hidden" name="custfirstname" value="${loanInputApplication.custfirstname}">
        <input type="hidden" name="custlastname" value="${loanInputApplication.custlastname}">
        <input type="hidden" name="custdob" value="${loanInputApplication.custdob}">
        <input type="hidden" name="custpanno" value="${loanInputApplication.custpanno}">
        <input type="hidden" name="custmobile" value="${loanInputApplication.custmobile}">
        <input type="hidden" name="custaddress" value="${loanInputApplication.custaddress}">
        <input type="hidden" name="custgname" value="${loanInputApplication.custgname}">
        <input type="hidden" name="custluudate" value="${loanInputApplication.custluudate}">
        <input type="hidden" name="custluser" value="${loanInputApplication.custluser}">
        

        <input type="hidden" name="lnapnominee" value="${loanInputApplication.lnapnominee}">
        <input type="hidden" name="lnaprelation" value="${loanInputApplication.lnaprelation}">

        <input type="hidden" name="lnapapdate" value="${loanInputApplication.lnapapdate}">
        <input type="hidden" name="lnaplntyid" value="${loanInputApplication.lnaplntyid}">
        <input type="hidden" name="lnapamount" value="${loanInputApplication.lnapamount}">
        <input type="hidden" name="lnapemirangefrom" value="${loanInputApplication.lnapemirangefrom}">
        <input type="hidden" name="lnapemirangeto" value="${loanInputApplication.lnapemirangeto}">
        <input type="hidden" name="lnapnomrequested" value="${loanInputApplication.lnapnomrequested}">
        <input type="hidden" name="lnapcibilscore" value="${loanInputApplication.lnapcibilscore}">
        <input type="hidden" name="lnapstatus" value="${loanInputApplication.lnapstatus}">
        <input type="hidden" name="lnapconclusionremarks" value="${loanInputApplication.lnapconclusionremarks}">
        <input type="hidden" name="lnapprocesseduser" value="${loanInputApplication.lnapprocesseduser}">
        <input type="hidden" name="lnapprocessedDate" value="${loanInputApplication.lnapprocessedDate}">
        <input type="hidden" name="lnapannualincome" value="${loanInputApplication.lnapannualincome}">
        <input type="hidden" name="lnapdisposalincome" value="${loanInputApplication.lnapdisposalincome}">
        
        <h1>Loan Application Preview</h1>
        <h2>Customer Information</h2>
        <p><strong>First Name:</strong> ${loanInputApplication.custfirstname}</p>
        <p><strong>Last Name:</strong> ${loanInputApplication.custlastname}</p>
        <p><strong>Date of Birth:</strong> ${loanInputApplication.custdob}</p>
        <p><strong>PAN Number:</strong> ${loanInputApplication.custpanno}</p>
        <p><strong>Mobile Number:</strong> ${loanInputApplication.custmobile}</p>
        <p><strong>Address:</strong> ${loanInputApplication.custaddress}</p>
        <p><strong>Guardian Name:</strong> ${loanInputApplication.custgname}</p>
        <p><strong>Last Update Date:</strong> ${loanInputApplication.custluudate}</p>
        <p><strong>Last User:</strong> ${loanInputApplication.custluser}</p>
        <h2>Nominee Information</h2>
        <p><strong>Nominee Name:</strong> ${loanInputApplication.lnapnominee}</p>
        <p><strong>Relationship with Applicant:</strong> ${loanInputApplication.lnaprelation}</p>
        <h2>Loan Applicant Information</h2>

        <p><strong>Application Date:</strong> ${loanInputApplication.lnapapdate}</p>
        <p><strong>Loan Type ID:</strong> ${loanInputApplication.lnaplntyid}</p>
        <p><strong>Loan Amount:</strong> ${loanInputApplication.lnapamount}</p>
        <p><strong>EMI Range From:</strong> ${loanInputApplication.lnapemirangefrom}</p>
        <p><strong>EMI Range To:</strong> ${loanInputApplication.lnapemirangeto}</p>
        <p><strong>Nominee Requested Amount:</strong> ${loanInputApplication.lnapnomrequested}</p>
        <p><strong>Annual Income:</strong>${loanInputApplication.lnapannualincome}</p>
        <p><strong>Disposable Income:</strong> ${loanInputApplication.lnapdisposalincome}</p>
        <p><strong>CIBIL Score:</strong> ${loanInputApplication.lnapcibilscore}</p>
        <p><strong>Status:</strong> ${loanInputApplication.lnapstatus}</p>
        <p><strong>Conclusion Remarks:</strong> ${loanInputApplication.lnapconclusionremarks}</p>
        
        <p><strong>Processed User:</strong> ${loanInputApplication.lnapprocesseduser}</p>
        <p><strong>Processed Date:</strong> ${loanInputApplication.lnapprocessedDate}</p>
        <p class="back-link"><a href="home">Back to Form</a></p>
        <p class="submit-link"><button type="submit">Submit</button></p>
    </div>
    
</body>
</html>
