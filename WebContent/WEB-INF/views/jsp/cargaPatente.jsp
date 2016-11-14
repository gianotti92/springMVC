<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<c:url value="/resources/validacion.js" />"></script>
<title>Carga Patente</title>
</head>
<body>

	formato a ingresar nuevos- LLNNNLL anteriores-LLLNNN maquinaria-LLLNN

	<hr>
	<form id="patente" action="cargaPatente.action" method="POST"
		onsubmit="validarFormulario()">
		Numero de dominio:<br> <input type="text" name="numeroDominio"
			id="numeroDominio"> <select name="tipoDominio"
			id="tipoDominio">
			<option value="1">Antiguos</option>
			<option value="2">Nuevos</option>
			<option value="3">Maquinaria</option>
		</select><br> Fecha alta:<br> <input type="text" name="fechaAlta"
			id="fechaAlta"><br> Estado:<br> <input type="text"
			name="estado" id="estado"><br> <br> <input
			type="submit" value="Submit">
	</form>

	<hr>

	<form:form action="listarPatentes.action" method="get">
		<td colspan="2" align="center"><input type="submit"
			value="Volver" /></td>
	</form:form>
</body>
</html>