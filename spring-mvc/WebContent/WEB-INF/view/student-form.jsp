<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC demo - form tag + data binding</title>
</head>
<body>
	<h3>Student infos</h3>

	<form:form action="processForm" modelAttribute="student">
		<p> 
			Firstname: <form:input path="firstName"/> 
		</p>
		<p>
			Lastname: <form:input path="lastName"/>
		</p>
		
		<p>
			Country: <form:select path="country">
						 <form:option value="NG" label="Niger"/>
						 <form:option value="BR" label="Brasil"/>
						 <form:option value="FR" label="France"/>
						 <form:option value="SN" label="Sénégal"/>
					</form:select>
		</p>
		
		<p>
			Religion: 	<form:select path="religion">
							 <form:options items="${student.possibleReligions}"/>
						</form:select>
		</p>
		
		<p> Favorite Language: <br>
			 	<form:radiobutton path="favoriteLangage" value="Ruby"/> Ruby <br/>
			 	<form:radiobutton path="favoriteLangage" value="Java"/> Java <br/>
				<form:radiobutton path="favoriteLangage" value="C#"/> C# <br/>
		</p>
		
		<p>
			Your Passions: <br/>
			<form:checkbox path="passions" value="natation"/> Natation <br/>
			<form:checkbox path="passions" value="Foot"/> Foot <br/>
			<form:checkbox path="passions" value="Danse"/> Danse <br/>
		</p>
		
		
		<p> 
			<input type="submit" value="submit" /> 
		</p>
	
	</form:form>
</body>
</html>