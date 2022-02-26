<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Product</title>
</head>
<body >

<h1>Insert Product Details</h1>

<form action=InsertProduct method=post>
	<label for=name>Name :-</label> <input type="text" name=name id=name /><br><br>	
	<label for=price>Price :-</label> <input type="text" name=price id=price /><br><br>	
	<label for=qty>qty :-</label> <input type="text" name=qty id=qty /><br><br>
	<input type=submit value=submit /> 
</form>
</div>


<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:Green;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>

</body>
</html>