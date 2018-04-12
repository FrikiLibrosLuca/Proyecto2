<%@ include file="menuB.jsp"%>

<div class="row ">
	<div class="col-lg-12 ">
		<div class="panel panel-default">
			<div class="panel-heading cuadrado">Empleados</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>ID</th>
								<th>Código de empleados</th>
								<th>Salario</th>
								<th>Fecha de Alta</th>
								<th>Categoría</th>
								<th>Departamento</th>
								
								<th></th>
							</tr>
						</thead>
						<!-- en el tbody modificaremos la lista -->
						<tbody>
						<c:forEach var="item" items="${listaEmpleado}">
							<tr>
								<td>${item.idempleados}</td>
								<td>${item.codempleado}</td>
								<td>${item.salario}</td>
								<td>${item.fechaAlta}</td>
								<td>${item.categoria.nombre}</td>
								<td>${item.departamento.nombre}</td>
								
								<td><a href="borrar_empleado/${item.idempleados}"><button type="button" class="btn btn-danger">Eliminar</button></a>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="row ">
	<div class="col-lg-12 ">
		<div class="panel panel-default">
			<a href="/"><button type="button" class="btn btn-primary">Volver</button></a>
		</div>
	</div>
</div>

			<%@ include file="footer.html"%>