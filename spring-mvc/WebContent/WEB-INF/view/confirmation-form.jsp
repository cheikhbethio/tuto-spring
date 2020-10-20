<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC demo - form tag + data binding</title>
</head>
<body>
	<h3>Student registred</h3>
		Your first name: ${student.lastName} <br/>
		Your last name: ${student.lastName} <br/>
		You in the ${student.religion} religion <br/>
		Your favorite language: ${student.favoriteLangage} <br/>
		Your passions: <br>
		<ul>
			<c:forEach var="temp" items="${student.passions}">
				<li> ${temp} </li>		
			</c:forEach>
		</ul>

	</p>
	
</body>
</html>