
<%@ include file="menu.jsp"%>



<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">FrikiAgenda</h1>
		</div>
		<section>
			<table>
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>MostrarDetalles</th>
					<th>Borrar</th>

				</tr>
				<c:forEach var="item" items="${listaCategoria}">
					<tr>
						<td>${item.id}</td>
						<td>${item.nombre}</td>
						<td>
						<a href="buscar_categoria/${item.id}">Mostrar detalles</a>
						
						</td>
						<td>
						<a href="borrar_categoria/${item.id}">Eliminar entrada</a>	
									<button type="button" class="btn btn-primary"
										class="botonModificar">Borrar</button>	
					
						</td>

					</tr>


				</c:forEach>
			</table>
		</section>
	</div>
</div>


<%@ include file="footer.html"%>