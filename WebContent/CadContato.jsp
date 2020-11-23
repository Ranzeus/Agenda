<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoContato" var="servletNovoContato"/>
<c:url value="/ListaContatos" var="servletListContatos"/>
<c:url value="/" var="ServletMenu"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Contato</title>
</head>
<body>

	<a href="${ServletMenu}">Menu</a>
		<br>
	
	<h2>Cadastrar Contato</h2>
	
	<form action="${servletNovoContato}" method="post">
	<b>Nome: </b><input type="text" name="nome"/>
	<b>Numero: <input type="text" name="num"/>
	<input type="submit"/>
	</form>
</body>
</html>