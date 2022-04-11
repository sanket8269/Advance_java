<%@page import="Bean.AuthenticateBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style type="text/css">
h1 {
	color: #B32800
}
</style>
</head>
<body align="center">
	<%@ include file="Header.jsp"%>
		<h1 align="center">Welcome to Rays</h1>
	<%
		AuthenticateBean email = (AuthenticateBean) session.getAttribute("email");
		//out.println("Welcome!!" + email.);
	%>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<hr>
	<%@ include file="Footer.jsp"%>
</body>
</html>