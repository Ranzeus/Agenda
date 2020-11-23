<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/excluirContato" var="servletExcluiContato"/>
<c:url value="/" var="ServletMenu"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="${ServletMenu}">Menu</a>
		<br>
		
	<h2>Excluir Contato</h2>
	
	<form action="${servletExcluiContato}" method="get">
	<b>Id do Contato </b>:<input type="number" name="id"/>
	<input type="submit"/>
	</form>
</body>
</html>