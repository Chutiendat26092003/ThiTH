<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../../common/admin.jsp" %>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Product List</title>
</head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h2>Employee</h2>
            <hr>

            <form action="/employee/save" method="post">
                <input type="text" name="id" value="${employee.id}" hidden>
                <div class="mb-3">
                    <label for="name" class="form-label">Full Name</label>
                    <input type="text" class="form-control" id="name" name="name" value="${employee.name}" required>
                </div>
                <div class="mb-3">
                    <label for="wage" class="form-label">Wage</label>
                    <input type="number" class="form-control" id="wage" name="wage" value="${employee.wage}" required>
                </div>
                <div class="flex-content">
                    <a href="/employees" class="btn btn-danger">Back to Employee List</a>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
