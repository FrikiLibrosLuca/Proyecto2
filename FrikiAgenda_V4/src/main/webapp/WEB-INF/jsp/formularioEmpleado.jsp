<%@ include file="menuB.jsp"%>
<section>
	<form:form method="GET" modelAttribute="empleado" class="form-control"
		action="guardar_Empleado">

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-label" for="codempleado">Codigo
					de empleado : </label>
				<div class="col-md-7">
					<form:input value="${empleado.codempleado}" type="text"
						path="codempleado" id="codempleado" class="form-control" />
					<div class="has-error">
						<form:errors path="codempleado" class="help-inline" />
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-label" for="salario">Salario
					de empleado : </label>
				<div class="col-md-7">
					<form:input value="${empleado.salario}" type="text" path="salario"
						id="salario" class="form-control" />
					<div class="has-error">
						<form:errors path="salario" class="help-inline" />
					</div>
				</div>
			</div>
		</div>



		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-label" for="categoria">Nombre
					de la categoría : </label>
				<div class="col-md-7">
					<form:input value="${empleado.categoria.id}" type="text"
						path="categoria" id="categoria" class="form-control" />
					<div class="has-error">
						<form:errors path="categoria" class="help-inline" />
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-label" for="departamento">Nombre
					del departamento : </label>
				<div class="col-md-7">
					<form:input value="${empleado.departamento.id}" type="text"
						path="departamento" id="departamento" class="form-control" />
					<div class="has-error">
						<form:errors path="departamento" class="help-inline" />
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="form-actions floatRight">
				<input type="submit" value="Guardar" class="btn btn-primary btn-sm">
			</div>
		</div>
		<div class="row">
			<div class="form-actions floatRight">
				<a href="listaEmp"><button type="button" class="btn btn-primary btn-sm">Volver</button></a>
			</div>
		</div>
		
		
	</form:form>

</section>

<%@ include file="footer.html"%>