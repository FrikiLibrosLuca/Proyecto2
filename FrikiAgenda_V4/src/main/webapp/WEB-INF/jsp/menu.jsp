<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="agenda, empleado, categoria">
<meta name="author" content="Grupo1">



<spring:url value="../../css/main.css" var="estilos1" />
<link href="${estilos1}" rel="stylesheet" />

<spring:url value="../../vendor/bootstrap/css/bootstrap.min.css"
	var="estilos2" />
<link href="${estilos2}" rel="stylesheet" />

<spring:url value="../../vendor/metisMenu/metisMenu.min.css"
	var="estilos3" />
<link href="${estilos3}" rel="stylesheet" />

<spring:url value="../../dist/css/sb-admin-2.css" var="estilos4" />
<link href="${estilos4}" rel="stylesheet" />

<spring:url value="../../vendor/morrisjs/morris.css" var="estilos5" />
<link href="${estilos5}" rel="stylesheet" />

<spring:url value="../../vendor/font-awesome/css/font-awesome.min.css"
	var="estilos6" />
<link href="${estilos6}" rel="stylesheet" type="text/css" />



<title>FrikiAgenda</title>


</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top coloress" role="navigation" style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/"><span class="nombreFrikiAgenda">FrikiAgenda</span></a>
			</div>
			<!-- /.navbar-header -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="row">
					<div class="col-lg-12">
						<div class="panel panel-default coloress">
							<div class="panel-heading cuadrado">Búsquedas</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
										<form:form method="POST" modelAttribute="categoria" class="form-control" action="buscar_categoria/${item.nombre}">
											<div class="form-group">
												<label id="nombre">Buscar por Categoria</label>
												<form:input type="text" class="form-control" min=3 max=45 path="nombre" id="nombre"/>
											</div>
											<div class="has-error">
				                                <form:errors path="nombre" class="help-inline"/>
				                            </div>
											<div class="form-group">
												<form:input type="submit" class="btn btn-default" value="Buscar"/>
											</div>
										</form:form>
									</div>
									<!-- /.col-lg-6 (nested) -->
								</div>
								<!-- /.row (nested) -->
								<div class="row">
									<div class="col-lg-12">
										<form:form method="POST" modelAttribute="categoria" class="form-control" action="buscar_categoria/${item.nombre}">
											<div class="form-group">
												<label id="codempleado">Buscar por código de empleado</label>
												<form:input type="text" class="form-control" min=3 max=45 path="codempleado" id="codempleado"/>
											</div>
											<div class="has-error">
				                                <form:errors path="nombre" class="help-inline"/>
				                            </div> 
											<div class="form-group">
												<form:input type="submit" class="btn btn-default" value="Buscar"/>
											</div>
										</form:form>
									</div>
									<!-- /.col-lg-6 (nested) -->
								</div>
							</div>
							<!-- /.panel-body -->
						</div>
						<!-- /.panel -->
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>
		
		<!-- PAGE CONTENT-------------------------------------------------------------------------------------------------------------------- -->
        <div id="page-wrapper">
            <div class="container-fluid">
               
               <!-- ESTE DIV ES EL TITULO ---------------------------------- -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Listado de CategorÃ­as</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                
                <!-- ESTE DIV ES PARA INSERTAR CATEGORIA ------------------- -->
                <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading cuadrado">
                            <a href="formularioCategorias.jsp">Insertar Categoría</a>
                        </div>                        
                    </div>
                </div>
                <!-- /.col-lg-4 -->
            </div>