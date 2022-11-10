<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h1>
		Welcome

		<c:if test="${USER != null }">
			<c:out value="${USER.userId}" />
		</c:if>

	</h1>

	<br />
	<br />

	<a href="book.html"><button>Book</button></a>
		
	<br />
	<br />

	<a href="student.html"><button>Student</button> <br /></a>

</body>
</html>