<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
</head>
<body>

	<h1>Book Page</h1>

	<form:form action="editBook.html" method="post">
		<form:input path="id" readonly="true"/>
		<br />
		<form:input path="ISBN" readonly="true"/>
		<br />
		<form:input path="title" />
		<br />
		<form:input path="price" />
		<br />
		<input type="submit" value="update" />
	</form:form>
	

</body>
</html>