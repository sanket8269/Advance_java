<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="p" method="post">
		<div align="center">
			<table align="center">
				<h2>Change Password</h2>
				</div>
				<tr>
					<th>New Password</th>
					<td><input type="gmail" name="password"> <% 	
 	String ds = (String) request.getAttribute("D2");
 	if (ds != null) {
 %> <font color="red"><%=ds%></font> <%
 	}
 %></td>
					</td>
				</tr>
				

				<tr>
					<th></th>
					<td><input type="submit" name="op" value="Login"> <input
						type="submit" name="op" value="cancel"></td>
				</tr>

			</table>
	</form>


</body>
</html>