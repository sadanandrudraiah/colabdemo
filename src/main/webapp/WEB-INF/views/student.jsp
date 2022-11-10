<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student page</title>
</head>
<body>

	<h1>Student Page</h1>

	<form:form action="student.html" method="post">
		<label>Roll Number</label>
		<form:input path="rollNum" />
		<br />
		<label>Name</label>
		<form:input path="name" />
		<br />
		<input type="submit" value="Create" />

	</form:form>

	<h1>Student List</h1>

	<table border="1">

		<thead>
			<tr>
				<td>Student RollNumber</td>
				<td>Student Name</td>
				<td></td>
			</tr>
		</thead>

		<tbody>
		<tbody>
			<c:forEach items="${STUDENTLIST}" var="s">

				<tr>
					<td><c:out value="${s.rollNum}"></c:out></td>
					<td><c:out value="${s.name}"></c:out></td>
					<td><a href="<c:url value='/student-del-${s.rollNum}'/>"><button>Delete</button></a></td>
					<td><a href="<c:url value='/student-edit-${s.rollNum}'/>"><button>edit</button></a></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<br/>
	<br/>
	<a href="user.html"><button>user </button> <br /></a>
	
</body>
</html>
