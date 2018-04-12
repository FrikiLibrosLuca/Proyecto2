<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">

<head>

<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">


	
		<spring:url value="../../css/main.css" var="estilos1" />
		<link href="${estilos1}" rel="stylesheet" />
		
		<spring:url value="../../vendor/bootstrap/css/bootstrap.min.css" var="estilos2" />
		<link href="${estilos2}" rel="stylesheet" />
		
		<spring:url value="../../vendor/metisMenu/metisMenu.min.css" var="estilos3" />
		<link href="${estilos3}" rel="stylesheet" />
		
		<spring:url value="../../dist/css/sb-admin-2.css" var="estilos4" />
		<link href="${estilos4}" rel="stylesheet" />
		
		<spring:url value="../../vendor/morrisjs/morris.css" var="estilos5" />
		<link href="${estilos5}" rel="stylesheet" />
		
		<spring:url value="../../vendor/font-awesome/css/font-awesome.min.css" var="estilos6" />
		<link href="${estilos6}" rel="stylesheet" type="text/css" />

    

    <title>FrikiAgenda</title>


</head>

<body>

    <div id="wrapper">

        <div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">FrikiAgenda</h1>
				</div>
				
				
