<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar usu�rio</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	
	<h1>Cadastrar usu�rio</h1>
	
	<form action="cadastroDeUsuario" method="post">
		Nome do usu�rio
		<input type="text" name="nomeDoUsuario" />
		<br />
		Data de nasimento
		<input type="text" name="dataDeNascimento" />
		<br />
		Email do usu�rio
		<input type="text" name="emailDoUsuario" />
		<br />
		Senha do usu�rio
		<input type="text" name="senhaDoUsuario" />
		<br />
		
		<input type="submit" name="cadastrar" />
	</form>
	
</body>
</html>