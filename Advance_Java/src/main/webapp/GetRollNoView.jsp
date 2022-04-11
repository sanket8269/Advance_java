<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	</table>
	<hr>

	<form action="StdCtl" method="post">
		<h3 align="center">
			RollNo<input type="text" name="rollnumber"><input
				type="submit" name="operation" value="Go">
			<%
				String C4 = (String) request.getAttribute("msg");
				if (C4 != null) {
			%>
			<font color="red"><%=C4%></font>
			</td>
			<%
				}
			%>

		</h3>
	</form>
</body>
</html>