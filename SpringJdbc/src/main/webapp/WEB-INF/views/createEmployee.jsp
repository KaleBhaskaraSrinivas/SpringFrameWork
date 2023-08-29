<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Create Employee</title>
</head>
<body>
    <h1>Create Employee</h1>
    <form action="saveEmployee" method="post">
        <label for="empno">Employee No:</label>
        <input type="text" id="empno" name="empno"><br>
        
        <label for="dept_no">Department No:</label>
        <input type="text" id="dept_no" name="dept_no"><br>
        
        <label for="ename">Name:</label>
        <input type="text" id="ename" name="ename"><br>
        
        <label for="job">Job:</label>
        <input type="text" id="job" name="job"><br>
        
        <label for="sal">sal:</label>
        <input type="text" id="sal" name="sal"><br>
        
        <input type="submit" value="Create">
    </form>
</body>
</html>
