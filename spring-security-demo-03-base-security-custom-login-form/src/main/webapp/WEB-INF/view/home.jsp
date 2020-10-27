<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Tuto spring security"</title>
	</head>
	<body>
		<h2>luv2code Company page ==></h2>
		
		<p> Welcome to spring ecurity demo</p>
		
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			
			<input type="submit" value="Logout"/>
		
		</form:form>
		
	</body>
</html>