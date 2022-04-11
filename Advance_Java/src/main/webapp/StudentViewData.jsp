<%@page import="Bean.StudentBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="S" method="post">
		<jsp:useBean id="bean" class="Bean.StudentBean" scope="request"></jsp:useBean>
		<%
			List<StudentBean> l1 = (List<StudentBean>) request.getAttribute("w1");
			Iterator<StudentBean> it = l1.iterator();
		%>



		<table border="1" style="width: 100%; border: groove;">
			<tr style="background-color: #e1e6f1e3;">


				<th style="width: 13%;">Roll_No</th>
				<th style="width: 30%;">First_Name</th>
				<th style="width: 7%;">Last_Name</th>
				<th style="width: 7%;">Session</th>

			</tr>
			<%
				while (it.hasNext()) {
					bean = it.next();
			%>

			<tr>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getRollNo()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getFirstName()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getLastName()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getSession()%></td>

				<%
					}
				%>
			
		</table>
	</form>
	</div>
</body>
</html>