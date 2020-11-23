<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.ifpb.agenda.servlet.Contato"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/" var="ServletMenu"/>
<c:url value="/contato/excluir" var="servletExcluirContato"/>
<c:url value="/contato/editar" var="servletEditarContato"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de contatos</title>
</head>
	<body>
	
		<a href="${ServletMenu}">Menu</a>
		<br>
		
		<h2>Listar Contatos</h2>
		
		<ul>
			<c:forEach items="${lista}" var="contato">
			<li>ID: ${contato.id} Contato: ${contato.nome} | ${contato.num} | <fmt:formatDate 
			value="${contato.dataCriacao}" 
			pattern="dd/MM/yyyy"/>
			<a href = "${servletEditarContato}?id=${contato.id}">Editar</a>
			<a href = "${servletExcluirContato}?id=${contato.id}">Excluir</a>
			</li>		
			
		</c:forEach>
		</ul>
		
	</body>
</html>