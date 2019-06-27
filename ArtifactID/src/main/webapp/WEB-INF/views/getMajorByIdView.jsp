<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<Title>Get Major By ID</Title>
<style>
* {
	font-family: calibri;
}
body {
	background-color: wheat;
}
</style>
</head>
<body>
	<h1>Get Major By ID</h1>
	<table>
		<tr>
			<th>Major ID</th>
			<th>Name</th>
			<th>Difficulty</th>
			<th>Cost</th>
		</tr>
		<tr>
			<td>${maj.majorId}</td>
			<td>${maj.name}</td>
			<td>${maj.difficulty}</td>
			<td>${maj.cost}</td>
		</tr>
	</table>
	<br />
	<a href="hello">Go back</a>
</body>
</html>