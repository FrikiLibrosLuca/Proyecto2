<%@ include file="menu.jsp"%>
<section>
			<form:form method="POST" modelAttribute="categoria" class="form-control">

                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="codempleado">Codigo de empleado : </label>
                        <div class="col-md-7">
                            <form:input value="${empleado.codempleado}" type="text" path="codempleado" id="codempleado" class="form-control"/>
                            <div class="has-error">
                                <form:errors path="codempleado" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="salario">Salario de empleado : </label>
                        <div class="col-md-7">
                            <form:input value="${empleado.salario}"type="text" path="salario" id="salario" class="form-control"/>
                            <div class="has-error">
                                <form:errors path="salario" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="fechaAlta">Fecha de alta del empleado : </label>
                        <div class="col-md-7">
                            <form:input value="${empleado.fechaAlta}"type="text" path="fechaAlta" id="fechaAlta" class="form-control"/>
                            <div class="has-error">
                                <form:errors path="fechaAlta" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="categoria">Fecha de alta del empleado : </label>
                        <div class="col-md-7">
                            <form:input value="${empleado.categoria.nombre}"type="text" path="categoria" id="categoria" class="form-control"/>
                            <div class="has-error">
                                <form:errors path="categoria" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="departamento">Fecha de alta del empleado : </label>
                        <div class="col-md-7">
                            <form:input value="${empleado.departamento.nombre}"type="text" path="departamento" id="departamento" class="form-control"/>
                            <div class="has-error">
                                <form:errors path="departamento" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="row">
                    <div class="form-actions floatRight">
                        <input type="submit" value="guardar_categoria" class="btn btn-primary btn-sm">
                    </div>
                </div>
            </form:form>
		</section>
<%@ include file="footer.html"%>