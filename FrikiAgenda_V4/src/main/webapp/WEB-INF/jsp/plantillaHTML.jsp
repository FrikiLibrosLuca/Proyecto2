<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>FrikiAgenda</title>

		<link href="../../css/main.css" rel="stylesheet" />
		
		<link href="../../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
		
		<link href="../../vendor/metisMenu/metisMenu.min.css" rel="stylesheet" />
		
		<link href="../../dist/css/sb-admin-2.css" rel="stylesheet" />
		
		<link href="../../vendor/morrisjs/morris.css" rel="stylesheet" />
		
		<link href="../../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />

</head>

<body>

    <div id="wrapper" >

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top coloress" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><span class="nombreFrikiAgenda">FrikiAgenda</span></a>
            </div>
            <!-- /.navbar-header -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default coloress">
                            <div class="panel-heading cuadrado">
                                BÃºsquedas
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <form role="form">
                                            <div class="form-group">
                                                <label>Buscar por:</label>
                                                <select class="form-control" name="campo">
                                                <option>Selecciona una opciÃ³n...</option>
                                                <option value="categoria">CategorÃ­a</option>
                                                <option value="departamento">Departamento</option>
                                            </select>
                                            </div>
                                            <div class="form-group">
                                                <label for="nombre">Nombre:</label>
                                                <input type="text" class="form-control" min=3 max=45 name="nombre" id="nombre">
                                            </div>
                                            <div class="form-group">
                                                <button type="button" class="btn btn-default" id="buscarCat">Buscar</button>
                                            </div>                                            
                                        </form>
                                    </div>
                                    <!-- /.col-lg-6 (nested) -->
                                </div>
                                <!-- /.row (nested) -->
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
                            Insertar Categoría
                        </div>                        
                    </div>
                </div>
                <!-- /.col-lg-4 -->
            </div>
                
                <!-- ESTO ES EL LA LISTA DE CATEGORIAS ESCRIBIR CON AJAX -->
                <div class="row ">
                    <div class="col-lg-12 ">
                        <div class="panel panel-default">
                            <div class="panel-heading cuadrado">
                                Categorías
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>Nombre</th>
                                                <th>Descripción</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <!-- en el tbody modificaremos la lista -->
                                        <tbody>
                                            <tr>
                                                <td id="idCat">1</td>
                                                <td id="idNombre">Pidgey</td>
                                                <td id="idDescripcion">Otto</td>
                                                <td><button type="button" class="btn btn-primary">Modificar</button></td>
                                                <td><button type="button" class="btn btn-danger">Eliminar</button></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <!-- /.table-responsive -->
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-6 -->
                </div>
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

   <script src="../../vendor/jquery/jquery.min.js"></script>
   <script src="../../js/agenda.js"></script>

</body>

</html>