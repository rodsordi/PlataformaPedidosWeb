<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar produto</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	
	<h1>Cadastrar produto</h1>
	
	<form action="cadastroDeProduto" method="post">
		Nome:
		<input type="text" name="nome" />
		<br />
		Quantidade em estoque:
		<input type="text" name="qtdEstoque" />
		<br />
		Valor:
		<input type="text" name="valor" />
		<br />
		<input type="submit" name="cadastrar" />
	</form>
</body>
</html>