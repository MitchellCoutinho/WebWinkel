<%@ page import="bestel.*, java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Geen titel</title>
</head>
<body>

<% 
StringBuilder sb = new StringBuilder();
java.util.Enumeration<String> en = request.getAttributeNames();
String outp = "asd";

for (int i = 0; i < 2; i++)  {
	sb.append("<tr>")
	.append("<td>")
	.append(outp)
	.append("</td>")
	.append("</tr>");
}
	%>
	<table>
	<%= sb.toString() %>
	</table>

<form method="post" action="">
Kies je lievelingskleur: <input type="color" name="kleur"><br>
Hoe oud ben je: <input type="number" name = "leeftijd"> <br>
<input type="submit">

</form>

</body>
</html>