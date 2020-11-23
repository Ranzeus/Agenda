<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.ifpb.agenda.servlet.Contato"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alterarContato" var="ServletAlterarContato"/>
<c:url value="/" var="ServletMenu"/>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Alterar Contato</title>
	</head>
	
	<body>
		
		<a href="${ServletMenu}">Menu</a>
		<br>
		
		<h2>Editar Contato</h2>
		
		<form action="${ServletAlterarContato}" method="post">
		
			<b>Nome: </b><input type="text" name="nome" value="${contato.nome }"/>
			<b>Numero: </b><input type="text" name="num" value="${contato.num}"/>
			<input type="hidden" name="id" value="${contato.id}"/>
			<input type="submit" />
			
		</form>
	</body>
</html>