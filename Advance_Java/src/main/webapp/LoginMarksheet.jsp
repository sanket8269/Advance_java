<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration From</title>
<link
	href="https://fonts.googleapis.com/css2?family=Cinzel&family=Lexend+Peta:wght@500&family=Lobster&family=Sansita+Swashed:wght@500&display=swap"
	rel="stylesheet">
<style type="text/css">
body {
	background-image: url("https://source.unsplash.com/random/200*400");
	background-size: cover;
	align: center;
	font-family:;
}

h1 {
	color: synblue;
}

th {
	color: #EAE3B9;
}
</style>
</head>
<body>
	<h1 align="center">MARKSHEET</h1>
	<form action="Localcgtl" method="post">
		<table align="center" bgcolor="grey" border="15px">
			<tr>
				<th>ID</th>
				<td><input type="text" name="user" placeholder="Enter Your ID"
					font></td>
			</tr>
			</tr>
			<tr>
				<th>ROLL_NO</th>
				<td><input type="text" name="user"
					placeholder="Enter Your Roll Number" font></td>
			</tr>
			</tr>
			<tr>
				<th>FIRST_NAME</th>
				<td><input type="text" name="name"
					placeholder="Enter Your Name"></td>
			</tr>
			</tr>
			<tr>
				<th>LAST_NAME</th>
				<td><input type="text" name="contact"
					placeholder="Enter Your Surname"></td>
			</tr>
			</tr>
			<tr>
				<th>PHYSICS</th>
				<td><input type="number" name="City" placeholder="Marks"></td>
			</tr>
			<tr>
				<th>CHEMISTRY</th>
				<td><input type="number" name="City" placeholder="Marks"></td>
			</tr>
			<tr>
				<th>MATHS</th>
				<td><input type="number" name="City" placeholder="Marks"></td>
			</tr>
			<tr>
				<td><input type="submit" name="op" value="Register Now">
					<input type="submit" name="op" value="Cancel"></td>
			</tr>
		</table>
	</form>
</body>
</html>