<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Data</title>
</head>
<body>
<%
String u = request.getParameter("user");
String p = request.getParameter("pwd");
%>
<%=u%>
<%=p%>
</body>
</html>