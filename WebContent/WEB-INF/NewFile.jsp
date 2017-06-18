<%@ page import="bestel.*, java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here ${ products.get(1).getName() }</title>
</head>
<body>

<table>
<tr>
<td>test</td>
<td> test2</td>
</tr>

<tr>
<td>test</td>
<td> test2</td>
</tr>
</table>

<%ArrayList<bestel.Product> al = (ArrayList)request.getAttribute("products"); %>
 <%= 
 ((DefaultProduct)al.get(1)).getName()
 %>
 
</body>
</html>