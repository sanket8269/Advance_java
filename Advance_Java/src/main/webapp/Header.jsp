<%@page import="Bean.AuthenticateBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">


<style type="text/css">
.navbar {
	background-color: black;
	border-radius: 4px;
}

.navbar li {
	margin: 13px 40px;
	padding: 12px;
}

.navbar li a {
	padding: 3px;
	color: white;
	margin: 5px 5px;
	color: white;
}

.navbar li a:hover {
	color: red;
}

.search {
	float: right;
	color: white;
}

.navbar input {
	border: 2px solid balck;
	border-radius: 4px;
}
</style>
</head>
<body>
	<header>
		<nav class="navbar">
			<div align="right">
				<img alt="Rays Logo" src="Rays.png">
			</div>
			<ul>
				<li>
					<div align="left">
						<%
							AuthenticateBean h = (AuthenticateBean) session.getAttribute("email");
							if (h != null) {
						%>
						<a href="">Home</a> <a href="m">Marksheet</a><a href="MG">MarksheetGet</a><a
							href="S">StudentData</a> <a href="StudentView.jsp">Student</a> <a
							href="">About Us</a> <a href="Logout.jsp">Logout</a> <a
							href="VisitorCount">VisitorCount</a>
		</nav>
		<hr>
		<div align="left">
<span class="fa fa-user-plus "></span>
			Hii...!!<%=h.getFirst_name()%>
		</div>
		<%
			}
		%>
		</div>
		</li>
		</ul>
	</header>
</body>
</html>