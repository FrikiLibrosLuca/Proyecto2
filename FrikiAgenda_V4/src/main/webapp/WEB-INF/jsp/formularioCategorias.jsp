<%@ include file="menu.jsp"%>

	<section>
			<form:form method="GET" modelAttribute="categoria" class="form-control" action="guardar_categoria">

                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="nombre">Nombre (*)</label>
                        <div class="col-md-7">
                            <form:input type="text" path="nombre" class="form-control"/>
                            <div class="has-error">
                                <form:errors path="nombre" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="descipcion">Descripcion (*)</label>
                        <div class="col-md-7">
                            <form:input type="text" path="descripcion" class="form-control"/>
                            <div class="has-error">
                                <form:errors path="descripcion" class="help-inline"/>
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
                        <a href="/"><button type="button" class="btn btn-primary btn-sm">Volver</button></a>
                    </div>
                </div>
            </form:form>
		</section>



<%@ include file="footer.html"%>