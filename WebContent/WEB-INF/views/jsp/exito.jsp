<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Carga exitosa</title>
</head>
<body>
	<h1>La carga se realizo con exito</h1>
	
	seleccionar
	<form:form action="cargaFormulario.action" method="get">
			<td colspan="2" align="center"><input type="submit" value="ingresar patentes" /></td>
		</form:form>
		
		<form:form action="listarPatentes.action" method="get">
			<td colspan="2" align="center"><input type="submit" value="listarPatentes" /></td>
		</form:form>
	
	
</body>
</html>