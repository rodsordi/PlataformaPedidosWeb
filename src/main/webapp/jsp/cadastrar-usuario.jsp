<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar usuário</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	
	<h1>Cadastrar usuário</h1>
	
	<form action="cadastroDeUsuario" method="post">
		<input type="text" name="nomeDoUsuario" />
		<input type="text" name="emailDoUsuario" />
		<input type="text" name="senhaDoUsuario" />
		
		<input type="submit" name="cadastrar" />
	</form>
	
</body>
</html>