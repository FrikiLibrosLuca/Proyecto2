<%@ include file="menu.jsp"%>

<div class="row ">
	<div class="col-lg-12 ">
		<div class="panel panel-default">
			<div class="panel-heading cuadrado">Categoría</div>
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
								<td>${categoria.id}</td>
								<td>${categoria.nombre}</td>
								<td>${categoria.descripcion}</td>
								<td><a href="buscar_categoria/${categoria.id}"><button
											type="button" class="btn btn-primary">Modificar</button></a></td>
								<td><a href="borrar_categoria/${categoria.id}"><button
											type="button" class="btn btn-danger">Eliminar</button></a>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading cuadrado">
				<a href="/">Volver</a>
			</div>
		</div>
	</div>
</div>




	<%@ include file="footer.jsp"%>