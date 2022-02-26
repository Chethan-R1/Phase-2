<%@ page import="com.pro.prod"%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
 prod pro = (prod) session.getAttribute("pro");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table class = "table">
	<tbody>
	<tr>
	<td>Id:</td>
	<td><%= pro.getId() %></td>
	</tr>
	<tr>
	<td>Name:</td>
	<td><%= pro.getName() %></td>
	</tr>
	<tr>
	<td>Price:</td>
	<td><%= pro.getPrice() %></td>
	</tr>
	<tr>
	<td>Name:</td>
	<td><%= pro.getDate() %></td>
	</tr>
	</tbody>
	</table>

</body>
</html>