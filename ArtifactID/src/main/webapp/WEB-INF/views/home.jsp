<%@taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<tags:template>
	<jsp:attribute name="head">  
		<script type="text/javascript">
			// inline JavaScript here 
		</script>
  	</jsp:attribute>  
	<jsp:body>
		<h1>Hello <c:out value="${ name }" /></h1>
		<p>This is just an example page.</p>
		<a href="allMajors">View all majors</a>
		<br>
		<a href="allStudents">View all students</a>
		<br>
		<a href="getMajorById">Get major by ID</a>
		<br>
		<a href="getStudentById">Get student by ID</a>
	</jsp:body>
</tags:template>