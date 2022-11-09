<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Student</title>
</head>
<body>

	<h1>Edit Student</h1>
	
	<form:form method="post" action="editStudent.html">
	<form:input path="rollNum" readonly="true"/><br/>
	<form:input path="name"/></br>
	<input type="submit" value="update"/>
	</form:form>
	
	
	</form>

</body>
</html>