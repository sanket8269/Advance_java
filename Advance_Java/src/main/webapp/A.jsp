<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	A JSP
	<%
	request.setAttribute("id", "1");
	response.sendRedirect("B.jsp");
%>
	<%--<%response.sendRedirect("B.jsp"); --%>
	<%-- <jsp:forward page="B.jsp"></jsp:forward>--%>
</body>
</html>