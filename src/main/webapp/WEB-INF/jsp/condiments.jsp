<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Condiments Management</title>
</head>
<body>
	<h1>Condiments data</h1>
	
	<form:form action="con.do" method="POST" commandName="conn">
	<table>
		<tr>
			<td> ID</td>
			<td><form:input type="text" path="id" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><form:input  type="text" path="name" /></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><form:input type="text" path="price" /></td>
		</tr>
		<tr>
			<td>Total</td>
			<td><form:input type="text" path="total" /></td>
		</tr>
		<tr>
			<td>Note</td>
			<td><form:input path="note" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>

	
	<table border="1" style="width: 500px; text-align: center;">
		<th>ID</th>
		<th>NAMe</th>
		<th>Price</th>
		<th>Total</th>
		<th>Note</th>
		<c:forEach items="${conlist}" var="conlistI">
			<tr>
				<td>${conlistI.id}</td>
				<td>${conlistI.name}</td>
				<td>${conlistI.price}</td>
				<td>${conlistI.total}</td>
				<td>${conlistI.note}</td>
			</tr>
		
		</c:forEach>
	</table>
</body>
</html>