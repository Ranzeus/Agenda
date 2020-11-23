<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/contato/criar" var="novoContatoServlet"/>
<c:url value="/contatos" var="listaContatonovoContato"/>
<c:url value="/contato/formExcluir/" var="excluirContatoServlet"/>

<html>
<head>
<meta charset="ISO-8859-1">
<title>MENU</title>
</head>
<body>
<h1>Menu da Agenda de Contatos</h1>
<a href="${novoContatoServlet}">Cadastrar Contato</a>
<br>
<a href="${listaContatonovoContato}">Listar Contatos</a>
<br>
<a href="${excluirContatoServlet}">Excluir Contato</a>
</body>
</html>