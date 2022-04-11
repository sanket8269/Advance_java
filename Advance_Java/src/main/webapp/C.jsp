<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	C.jsp
	<%
	request.setAttribute("lname", "jain");

	String s = (String) request.getAttribute("id");
	String b = (String) request.getAttribute("name");
	String c = (String) request.getAttribute("lname");
%>
	<%=s%>
	<%=b%>
	<%=c%>
</body>
</html>