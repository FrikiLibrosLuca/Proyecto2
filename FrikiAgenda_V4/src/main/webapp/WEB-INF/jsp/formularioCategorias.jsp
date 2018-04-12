<%@ include file="menu.jsp"%>

	<section>
			<form:form method="POST" modelAttribute="categoria" class="form-control">

                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="nombre">Nombre (*)</label>
                        <div class="col-md-7">
                            <form:input value="${categoria.nombre}" type="text" path="nombre" id="nombre" class="form-control"/>
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
                            <form:input value="${categoria.descripcion}"type="text" path="descripcion" id="descripcion" class="form-control"/>
                            <div class="has-error">
                                <form:errors path="descripcion" class="help-inline"/>
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