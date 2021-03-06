<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<Title>All Students</Title>
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
	<h1>All Students</h1>
	<table>
		<tr>
			<th>Student ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Sex</th>
			<th>Date of Birth</th>
			<th>Major</th>
		</tr>
		<c:forEach var="student" items="${allStudents}">
			<tr>
				<td>${student.studentId}</td>
				<td>${student.name}</td>
				<td>${student.age}</td>
				<td>${student.sex}</td>
				<td>${student.doB}</td>
				<td>${student.studentMajor}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="hello">Go back</a>
</body>
</html>