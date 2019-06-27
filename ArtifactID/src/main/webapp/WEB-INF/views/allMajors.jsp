<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<Title>All Majors</Title>
</head>
<body>
	<h1>All Majors</h1>
	<table>
		<tr>
			<th>Major ID</th>
			<th>Name</th>
			<th>Difficulty</th>
			<th>Cost</th>
		</tr>
		<c:forEach var="maj" items="${allMajors}">
			<tr>
				<td>${maj.majorId}</td>
				<td>${maj.name}</td>
				<td>${maj.difficulty}</td>
				<td>${maj.cost}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="hello">Go back</a>
</body>
</html>