<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book page</title>
</head>
<body>

	<h1>Book Page</h1>

	<form:form action="book.html" method="post">
		<label>Book ISBN</label>
		<form:input path="ISBN" />
		<br />
		<label>Book title   </label>
		<form:input path="title" />
		<br />
		<label>Book Price</label>
		<form:input path="price" />
		<br />
		<input type="submit" value="Create" />

	</form:form>

	<h1>Book List</h1>

	<table border="1">

		<thead>
			<tr>
				<td>Book id </td>
				<td>Book ISBN</td>
				<td>Book title</td>
				<td>Book price</td>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${BOOKLIST}" var="b">

				<tr>
					<td><c:out value="${b.id}"></c:out></td>
					<td><c:out value="${b.ISBN}"></c:out></td>
					<td><c:out value="${b.title}"></c:out></td>
					<td><c:out value="${b.price}"></c:out></td>
					<td><a href="<c:url value='/book-del-${b.id}'/>">Delete</a></td>
					<td><a href="<c:url value='/book-edit-${b.ISBN}'/>">edit</a></td>					
				</tr>
				
			</c:forEach>

		</tbody>
	</table>
</body>
</html>