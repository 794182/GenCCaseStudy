<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<Title>Get Major By ID</Title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<form action="getMajorByIdView" method="post">
		MajorID:<br> <input type="text" name="MajorID"><br>
		<input type="submit" value="Get">
	</form>
</body>
</html>