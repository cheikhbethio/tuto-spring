<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Tuto spring security"</title>
	</head>
	<body>
		<h2>luv2code Company page ==></h2>
		
		<p> Welcome to spring security demo</p>
		<hr>
			User: <security:authentication property="principal.username" />
			<br> <br>
			Role(s): <security:authentication property="principal.authorities" />
		<hr>

		<security:authorize access="hasRole('MANAGER')">
			<p> 
				<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
				(Only for Manager peeps)
			</p>		
		</security:authorize>
		
		<security:authorize access="hasRole('ADMIN')">
			<p> 
				<a href="${pageContext.request.contextPath}/systems">Admin Area</a>
				(Only for Admins peeps)
			</p>		
		</security:authorize>
		
		
		
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			
			<input type="submit" value="Logout"/>
		
		</form:form>
		
	</body>
</html>