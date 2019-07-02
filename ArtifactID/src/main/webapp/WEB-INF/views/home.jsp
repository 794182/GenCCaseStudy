<%@taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<tags:template>
	<jsp:attribute name="head">  
		<script type="text/javascript">
			// inline JavaScript here
		</script>
  	</jsp:attribute>
	<jsp:body>
		<h1>Technocrats University</h1>
		<p>Options:</p>
		<ol>
		<li><a href="allMajors">View all majors</a></li>
		<li><a href="allStudents">View all students</a></li>
		<li><a href="getMajorById">Get major by ID</a></li>
		<li><a href="getStudentById">Get student by ID</a></li>
		<li><a href="getAllStudentsByMajorCost">Get all students by major cost</a></li>
		</ol>
	</jsp:body>
</tags:template>