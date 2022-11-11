<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>        

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>login page</title>
</head>
<body>

	
	<h1>Login Page</h1>
	
	<c:if test="${param.ERROR != null}" >   <%-- ${param} shortcut for req param --%>
		<c:out value="${param.ERROR }"  >
		</c:out>
	</c:if>
	
	<form action="login.html" method="post">
		
		<label>User Id</label>
		<input type="text" name="userId"><br/>
		
		<label>Password</label>
		<input type="password" name="password"><br/>
		
		<input type="submit" value="login">
	</form>

<br/><br/><br/>

<h3>If you are a New User Click <a href = "user.html"> Here</a></h3> 

	
</body>
</html>