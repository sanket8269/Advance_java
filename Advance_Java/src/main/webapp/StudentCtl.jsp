<%@ page import="Model.StudentModel"%>
<%@ page import="Bean.StudentBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- 
	<%
		int age = Integer.parseInt(request.getParameter("age"));
	%>
	<%=age%> --%>
	<jsp:useBean id="bean" scope="request" class="Bean.StudentBean"></jsp:useBean>

	<jsp:setProperty name="bean" property="*" />

	<jsp:getProperty name="bean" property="rollNo" />
	<jsp:getProperty name="bean" property="firstName" />
	<jsp:getProperty name="bean" property="lastName" />
	<jsp:getProperty name="bean" property="session" />

	<%
		String op = request.getParameter("operation");
		if (op.equals("Add")) {
			StudentModel.testadd(bean);

		} else if (op.equals("Modify")) {
			StudentModel.testupdate(bean);

		} else if (op.equals("Delete")) {
			StudentModel.testdelete(bean);

		}
	%>
</body>
</html>