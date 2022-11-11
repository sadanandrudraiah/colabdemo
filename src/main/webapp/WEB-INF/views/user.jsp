<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>

<body>

	<h1>User Page</h1>

	<form:form action="user.html" method="post">
	
		<label>User Id</label>
		<form:input path="userId" />
		<br />
		<label>Password</label>
		<form:input path="password" value ="********"/>
		<br />
		<input type="submit" value="Create" />

	</form:form>


<h2>UPDATE YOUR PASSWORD</h2>

<table border="1">

		<thead>
			<tr>
				<td> id </td>
				<td>User id </td>
				<td>Password</td>
			</tr>
		</thead>
<tbody>

			<c:forEach items="${USERLIST}" var="u">

				<tr>
				<td><c:out value="${u.id}"></c:out></td>
					<td><c:out value="${u.userId}"></c:out></td>
					<td><c:out value="${u.password}"></c:out></td>
					<td><a href="<c:url value='/user-del-${u.id}'/>">Delete</a></td>
					<td><a href="<c:url value='/user-edit-${u.userId}'/>">edit</a></td>					
				</tr>
				
			</c:forEach>

		</tbody>
	</table>
		
</body>
</html>