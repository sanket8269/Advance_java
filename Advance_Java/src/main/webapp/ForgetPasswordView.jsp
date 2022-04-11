<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
`
<body>
	<form action="ForgetCtl" method="post">
		<div align="center">
			<table align="center">
				<h2>Forget Password</h2>

				<%
					String t1 = (String) request.getAttribute("r2");
					if (t1 != null) {
				%>
				<font color="red"><%=t1%></font>
				</td>
				<%
					}
				%>

				<tr>
					<th>Login ID</th>
					<td><input type="email" name="login"
						placeholder="Enter Your Email Id "> <%
 	String t = (String) request.getAttribute("r1");
 	if (t != null) {
 %> <font color="red"><%=t%></font></td>
					<%
						}
					%>
					</td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="op" value="Login"> <input
						type="submit" name="op" value="cancel"></td>
				</tr>

			</table>
		</div>
	</form>
</body>


</html>