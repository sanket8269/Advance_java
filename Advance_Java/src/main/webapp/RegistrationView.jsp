<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration From</title>
<style type="text/css">
/* body {
	background-image: url("https://source.unsplash.com/random/200*400");
	background-size: cover;
	align: center;
	font-family:;
}

h1 {
	color: gold;
}

th {
	color: #EAE3B9;
} */
</style>
</head>
<body>
	<table width="100" border="0">
		<tr>
			<td width="90"><a href="LoginView.jsp">Login</a></td>
			<h1 align="Right">
				<img src="Rays.png">
			</h1>
			</td>
		</tr>
		<tr>
			<td>
				<h3>Hi,Guest</h3>
			</td>
		</tr>
	</table>
	<hr>
	<h1 align="center">REGISTRATION FORM</h1>
	<form action="RegistrationCtl" method="post">
		<table align="center">
			<tr>
				<th>NAME</th>
				<td><input type="text" name="name"
					placeholder="Enter Your Name" font> <%
 	String B = (String) request.getAttribute("s1");
 	if (B != null) {
 %> <font color="red"><%=B%></font></td>
				<%
					}
				%>
			</tr>

			<tr>
				<th>Password</th>
				<td><input type="password" name="pwd"
					placeholder="Enter Your password" font> <%
 	String B1 = (String) request.getAttribute("s4");
 	if (B1 != null) {
 %> <font color="red"><%=B1%></font></td>
				<%
					}
				%>
			</tr>
			<tr>
				<th>EMAIL</th>
				<td><input type="Email" name="email"
					placeholder="Enter Your Email"> <%
 	String B3 = (String) request.getAttribute("s2");
 	if (B3 != null) {
 %> <font color="red"><%=B3%></font></td>
				<%
					}
				%>
			</tr>
			</tr>
			<tr>
				<th>Contact</th>
				<td><input type="number" name="contact"
					placeholder="Contact Number"> <%
 	String B4 = (String) request.getAttribute("s3");
 	if (B4 != null) {
 %> <font color="red"><%=B4%></font></td>
				<%
					}
				%>
			</tr>
			<tr>
				<th>Gender</th>
				<td><select class='form-control' name='gender'>
						<option selected value='F'>Female</option>
						<option value='M'>Male</option>
				</select></td>
			</tr>
			<tr>
				<th>City</th>
				<td><input type="option" name="city" placeholder="Your City">
					<%
						String B5 = (String) request.getAttribute("s5");
						if (B5 != null) {
					%> <font color="red"><%=B5%></font></td>
				<%
					}
				%>
			</tr>
			<tr>
				<td align="right"><input type="submit" name="op"
					value="Register Now"> <input type="reset" name="op"
					value="Cancel"></td>
			</tr>
		</table>
	</form>
</body>
</html>
