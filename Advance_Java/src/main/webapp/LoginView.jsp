<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">


</head>
<body bgcolor="White">
	<%@ include file="Header.jsp"%>
	<form action="Hello" method="post">
		<br>

		<div align="center">
			<table align="center">
				<span class="fa fa-user-plus fa-3x"></span>
				<h2 align="center">Login Form</h2>
				<%
					String n = (String) request.getAttribute("j1");
					if (n != null) {
				%>
				<font color="Green"><%=n%></font>
				</td>
				<%
					}
				%>
				<%
					String w = (String) request.getAttribute("G");
					if (w != null) {
				%>
				<font color="Green"><%=n%></font>
				</td>
				<%
					}
				%>

				<%
					String t = (String) request.getAttribute("Error");
					if (t != null) {
				%>
				<font color="Green"><%=t%></font>
				</td>
				<%
					}
				%>
				</div>
				<tr>
					<th>Username*</th>
					<td><input type="email" name="email"><%
 	String D = (String) request.getAttribute("s1");
 	if (D != null) {
 %><font color="red"><%=D%></font></td>

					<%
						}
					%>
				</tr>
				<tr>
					<th>Password*</th>
					<td><input type="password" name="pwd"> <%
 	String Z = (String) request.getAttribute("s2");
 	if (Z != null) {
 %> <font color="red"><%=Z%></font></td>
					<%
						}
					%>
					<th></th>
					<td><input type="hidden" name="jsid"
						value="<%=session.getId()%>"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="hidden" name="jsid"
						value="<%=request.getAttribute("G")%>"></td>
				</tr>
				<tr>
					<th></th>

					<td><button class="btn btn-outline-dark">
							<span class="fa fa-user-circle fa-spin"></span>Login
						</button>
						<button class="btn btn-outline-dark">
							<span class="fa fa-user-circle fa-spin"></span>Cancel
						</button></td>
				</tr>
				<tr>
					<th></th>
					<td><a href="RegistrationView.jsp">Create an account</a></td>
				</tr>
				<th></th>
				<td><a href="ForgetPasswordView.jsp">Forget Password</a></td>
			</table>
	</form>
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
	<%@ include file="Footer.jsp"%>
</body>
</html>