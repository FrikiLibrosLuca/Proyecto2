
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
				<c:foreach var="item" items="${listaCategoria}">
					<tr>
						<td>${item.id}</td>
						<td>${item.nombre}</td>
						<td>
						<a href="<c:url value='/buscar_categoria/'${item.id}/>">
								<p align="right">
									<button type="button" class="btn btn-primary"
										class="botonModificar">Detalles</button>
								</p>
						</a>
						</td>
						<td>
						<a href="<c:url value='/borrar_categoria/'${item.id}/>">
								<p align="right">
									<button type="button" class="btn btn-primary"
										class="botonModificar">Borrar</button>
								</p>
						</a>
						</td>

					</tr>


				</c:foreach>
			</table>
		</section>
	</div>
</div>


<%@ include file="footer.html"%>