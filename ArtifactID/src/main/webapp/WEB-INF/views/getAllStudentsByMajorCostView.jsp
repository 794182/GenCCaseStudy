<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<Title>Get All Students By Major Cost</Title>
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
	<h1>Get All Students By Major Cost</h1>
	<table>
		<tr>
			<th>Student ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Sex</th>
			<th>Date of Birth</th>
			<th>Major</th>
		</tr>
		<c:forEach var="students" items="${getAllStudentsByMajorCostView}">
			<tr>
				<td>${students.studentId}</td>
				<td>${students.name}</td>
				<td>${students.age}</td>
				<td>${students.sex}</td>
				<td>${students.doB}</td>
				<td>${students.studentMajor}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="hello">Go back</a>
</body>
</html>