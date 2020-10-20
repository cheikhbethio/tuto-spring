<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Customers</title>
<link	type="text/css" rel="stylesheet" 
	href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
	
	<div id="wrapper">
		<div id="header"> 
			<h2>CRM - Customers RelationShip Management</h2>
		</div>
		
		<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;" class="add-button"/>
		
		<div id="container">
			<div id="content">
				<table>
					<tr> 
						<th> Firstname </th>
						<th> LastName </th>
						<th> Email </th>
						<th> Action </th>
					</tr>
					
					<c:forEach var="current" items="${customers}">
						<c:url var="updateLink" value="/customer/showForforUpdate">
							<c:param name="customerId" value="${current.id}"></c:param>
						</c:url>
						
						<c:url var="deleteLink" value="/customer/delete">
							<c:param name="customerId" value="${current.id}"></c:param>
						</c:url>
						
						
						<tr> 
							<td> ${current.firstName}</td>
							<td> ${current.lastName}</td>
							<td> ${current.email}</td>
							<td>
								<a href="${updateLink}">Update</a> 
								|
								<a href="${deleteLink}">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</table>			
			</div>
		</div>
	
	</div>
</body>
</html>

