<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION</title>
</head>
<body>
<%
String u = request.getParameter("user");
String p = request.getParameter("user");
String m = request.getParameter("Email");
String N = request.getParameter("contact");
String d = request.getParameter("Subject");
String g = request.getParameter("gender");
String c = request.getParameter("city");
%>
<%=u%>
<%=p%>
<%=m%>
<%=N%>
<%=d%>
<%=g%>
<%=c%>

</body>
</html>