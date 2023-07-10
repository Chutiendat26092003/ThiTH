
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/taglist.jsp"%>
<html>
<head>
    <title>Employees</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <!-- jQuery library -->
<%--    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>--%>

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <sitemesh:write propertiy="head" />
</head>
<body>
<%@include file="navbar.jsp"%>
<div class="page-content">
    <sitemesh:write propertiy="body"/>
</div>
</body>
</html>
