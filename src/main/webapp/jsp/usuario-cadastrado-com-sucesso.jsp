<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usu�rio cadastrado com sucesso</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<h2>Usu�rio cadastrado com sucesso</h2>
	
	<%=request.getAttribute("nomeDoUsuario")%>
	
</body>
</html>