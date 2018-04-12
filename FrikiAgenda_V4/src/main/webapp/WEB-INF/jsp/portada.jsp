
<%@ include file="menu.jsp"%>

<div class="row ">
	<div class="col-lg-12 ">
		<div class="panel panel-default">
			<div class="panel-heading cuadrado">Categorías</div>
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
							</tr>
						</thead>
						<!-- en el tbody modificaremos la lista -->
						<tbody>
						<c:forEach var="item" items="${listaCategoria}">
							<tr>
								<td>${item.id}</td>
								<td>${item.nombre}</td>
								<td>${item.descripcion}</td>
								<td><a href="borrar_categoria/${item.id}"><button type="button" class="btn btn-danger">Eliminar</button></a>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>


			<%@ include file="footer.html"%>