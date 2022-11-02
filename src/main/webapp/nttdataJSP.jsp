<%@page import="com.nttdata.tomcat.NTTDataJSP"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NTT Data - Taller ApacheTomcat/JSP</title>
</head>
<body>
	<p>Taller práctico de Apache Tomcat / JSP</p>

	<p><%= NTTDataJSP.nameChars(request.getParameter("fname"))%></p>
</body>
</html>