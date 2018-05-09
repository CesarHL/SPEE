<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">

<jsp:text>
	<![CDATA[                 
	<script type="text/javascript" src="${pageContext.request.contextPath}/pages/pagos/consultar-servicios/js/index.js"></script>
	]]>
</jsp:text>

<s:set var="varIconoBancomer" value="'&#xE8A1;'" />
<s:set var="varIconoAdjuntar" value="'&#xE5D8;'" />

<div class="row title">
	<div class="col-md-12">
		<h1 class="title">
			<s:text name="Visualizar Servicios" />
		</h1>
	</div>
</div>

<div class="form-medium">
	<div class="row">
		<label class="col-md-4 text-left control-label"> <s:text
				name="Nombre">
			</s:text>
		</label><label class="col-md-4 text-left"> César Erick Hernández López
		</label>

	</div>
	<div class="row">
		<label class="col-md-4 text-left control-label"> <s:text
				name="CURP">
			</s:text>
		</label> <label class="col-md-4 text-left"> HELC920407HDFRPS03 </label>
	</div>
	<div class="row">
		<label class="col-md-4 text-left control-label"> <s:text
				name="Boleta">
			</s:text>
		</label> <label class="col-md-4 text-left"> 2013630206 </label>
	</div>
</div>

<div class="form-section form-horizontal">
	<div class="form-group">
		<div class="row">
			<div class="col-md-12">
				<table id="tblServicios" class="table table-striped">
					<thead>
						<tr>
							<th><s:text name="Concepto" /></th>
							<th><s:text name="Costo" /></th>

							<th><s:text name="Area" /></th>
							<th><s:text name="Acciones" /></th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="listCatalogoServicios" var="oservicio">
							<tr>
								<td>${oservicio.servicio}</td>
								<td><s:text name="$"></s:text> ${oservicio.monto}<s:text
										name=" MXN"></s:text></td>

								<td>${oservicio.idArea}</td>
								<td><a
									href="${pageContext.request.contextPath}/pagos/cargar-pago/new?idServicio=${oservicio.clave}"
									title="Adjuntar Archivo"> <i
										class="material-icons md-24 md-eld">${varIconoAdjuntar}</i>
								</a><a href="#" title="Pagar en Bancomer"> <i
										class="material-icons md-24 md-eld">${varIconoBancomer}</i>
								</a></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

	</html>
</jsp:root>