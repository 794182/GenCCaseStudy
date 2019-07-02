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
	<form action="getAllStudentsByMajorCostView" method="post">
		Major Cost:<br> <input type="text" name="cost"><br>
		<input type="submit" value="Get">
	</form>
</body>
</html>