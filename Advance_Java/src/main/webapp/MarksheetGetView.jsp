<%@page import="Bean.MarksheetBean"%>
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

	<form action="MG" method="post">
		<jsp:useBean id="bean" class="Bean.MarksheetBean" scope="request"></jsp:useBean>
		<%
			List<MarksheetBean> l1 = (List<MarksheetBean>) request.getAttribute("w1");
			Iterator<MarksheetBean> it = l1.iterator();
		%>



		<table border="1" style="width: 100%; border: groove;">
			<tr style="background-color: #e1e6f1e3;">

				<th style="width: 5%;">ID</th>
				<th style="width: 13%;">Roll_No</th>
				<th style="width: 30%;">First_Name</th>
				<th style="width: 7%;">Last_Name</th>
				<th style="width: 7%;">Physics</th>
				<th style="width: 7%;">Chemistry</th>
				<th style="width: 7%;">Maths</th>

			</tr>
			<%
				while (it.hasNext()) {
					bean = it.next();
			%>

			<tr>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getId()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getRoll_NO()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getFIRST_NAME()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getLAST_NAME()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getPHYSICS()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getCHEMISTRY()%></td>
				<td style="text-align: center; text-transform: capitalize;"><%=bean.getMATHS()%></td>

				<%
					}
				%>
			
		</table>
	</form>
	</div>
</body>
</html>