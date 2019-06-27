<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<Title>Get Student By ID</Title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<form action="getStudentByIdView" method="post">
		StudentID:<br> <input type="text" name="StudentID"><br>
		<input type="submit" value="Get">
	</form>
</body>
</html>