<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student information stored successfully</h2>
<hr/>

<h3>Name: ${student.name}</h3>
<h3>Email: ${student.email} </h3>
<h3>Course code: ${student.courseCode} </h3>
<h3>Free pass: ${student.freePasses} </h3>
<h3>Country: ${student.country}</h3>
<h3>Language: ${student.favoriteLanguage}</h3>

<!-- loop through to display the selected check boxes we will add jstl core   -->
<h3>Operating Systems:</h3>
	<ul>
		<core:forEach var="os" items="${student.operatingSystems}">
		<li>${ os}</li>
		</core:forEach>
	</ul>

</body>
</html>