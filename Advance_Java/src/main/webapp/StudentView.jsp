<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
<div align="right">
<img src="Rays.png">
</div>
	<table width="100" border="0">	
	<hr>
	<h2 align="center">Student Management</h2>
	<form action="StudentCtl.jsp" method="post">
		<table align="center">
			<tr>
				<%
					String C = (String) request.getAttribute("j1");
					if (C != null) {
				%>
				<font color="red"><%=C%></font>
				</td>
				<%
					}
				%>
				<th>Roll No :</th>
				<td><input type="text" name="rollNo"><br></td>
				<%
					String B = (String) request.getAttribute("a1");
					if (B != null) {
				%>
				<font color="red"><%=B%></font>
				</td>
				<%
					}
				%>
			</tr>

			<tr>
				<th>First Name :</th>
				<td><input type="text" name="firstName"><br></td>
				<%
					String B1 = (String) request.getAttribute("a2");
					if (B1 != null) {
				%>
				<font color="red"><%=B1%></font>
				</td>
				<%
					}
				%>
			</tr>
			<tr>
				<th>Last Name :</th>
				<td><input type="text" name="lastName"><br></td>
				<%
					String B2 = (String) request.getAttribute("a3");
					if (B2 != null) {
				%>
				<font color="red"><%=B2%></font>
				</td>
				<%
					}
				%>
			</tr>
			<tr>
				<th>Session :</th>
				<td><input type="text" name="session"></td>
				<%
					String B3 = (String) request.getAttribute("a4");
					if (B3 != null) {
				%>
				<font color="red"><%=B3%></font>
				</td>
				<%
					}
				%>
			</tr>
			<td><input type="submit" value="Add" name="operation"> <input
				type="submit" value="Delete" name="operation"> <input
				type="submit" value="Modify" name="operation"> <a
				href="GetRollNoView.jsp">GetView</a></td>

		</table>
	</form>
</body>
</html>