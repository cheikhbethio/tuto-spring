<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

	<form:form action="processForm" modelAttribute="customer">
		FirstName <form:input path="firstName" /> <br/>
		LastName <form:input path="lastName" />
		<form:errors cssClass="error" path="lastName"/> <br>
		
		FreePasses <form:input path="freePasses"/>
		<form:errors cssClass="error" path="freePasses"/> <br>
		
		PostalCode <form:input path="postalCode"/>
		<form:errors cssClass="error" path="postalCode"/> <br>
		
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>