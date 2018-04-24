<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">

<jsp:text>
	<![CDATA[                 
	<script type="text/javascript" src="${pageContext.request.contextPath}/pages/pagos/gestionar-pagos-autorizados/js/editNew.js"></script>
	]]>
</jsp:text>

<s:set var="listPagosAutorizados"
	value="{{'', 'Rodrigo López Hernández', 'HELC920412HDFRPS02', '2013630206', '550.00 MXN', 'Inglés B1'},
	 {'', 'José López Hernández', 'JELC920412HDFRPS02', 'Trabajador', '603.00 MXN', 'Inglés B2'},
	 {'', 'Pedro López Hernández', 'PELC920412HDFRPS02', 'Externo', '600.00 MXN', 'Inglés B3'}}" />

<s:set var="ttbVisualizar" value="%{getText('tooltipVisualizar')}" />
<s:set var="ttbAdjuntar" value="%{getText('tooltipAdjuntar')}" />

<s:set var="varIconoVisualizar" value="'&#xE8F4;'" />
<s:set var="varIconoAdjuntar" value="'&#xE5D8;'" />

<div class="row title">
	<div class="col-md-12">
		<h1 class="title">
			<s:text name="CU14_TITLE" />
		</h1>
	</div>
</div>

<div class="form-section form-horizontal">
	<div class="form-group">
		<div class="row">
			<div class="col-md-12">
				<table id="tblPagosPorAutorizar" class="table table-striped">
					<thead>
						<tr>
							<th><s:text name="CU14_THEAD1" /></th>
							<th><s:text name="CU14_THEAD2" /></th>
							<th><s:text name="CU14_THEAD3" /></th>
							<th><s:text name="CU14_THEAD4" /></th>
							<th><s:text name="CU14_THEAD5" /></th>
							<th><s:text name="CU14_THEAD6" /></th>
							<th><s:text name="CU14_THEAD7" /></th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="listPagosAutorizados" var="pagoAutorizado">
							<tr>
								<td>${pagoAutorizado[0]}</td>
								<td>${pagoAutorizado[1]}</td>
								<td>${pagoAutorizado[2]}</td>
								<td><a
									href="${pageContext.request.contextPath}/pagos/gestionar-autorizacion-pagos/show"
									title="${ttbVisualizar}"> <i
										class="material-icons md-24 md-eld">${varIconoVisualizar}</i>
								</a><a
									href="${pageContext.request.contextPath}/pagos/gestionar-autorizacion-pagos/new"
									title="${ttbAdjuntar}"> <i
										class="material-icons md-24 md-eld">${varIconoAdjuntar}</i>
								</a></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<div class="form-group">
	<label class="col-md-4 control-label"> <s:text name="CU14_LBL1"></s:text>
	</label>
</div>
	</html>
</jsp:root>