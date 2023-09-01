<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1 class="mt-4">Doctors Information</h1>
        <form action="/DocApp/doctorDetails">
            <div class="row" id="doctor-list">
                <c:forEach items="${doctorsData}" var="doctor">
                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <div class="card-body">
                                <img class="card-img-top" src="${doctor.photo}" alt="Doctor Photo">
                                <h5 class="card-title">${doctor.fullname}</h5>
                                <h6 class="card-title">${doctor.designation}</h6>
                                <button class="btn btn-info" type="submit" name="doctorid" value="${doctor.doctorid}">
                                    View Details
                                </button>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </form>
    </div>
</body>
</html>
