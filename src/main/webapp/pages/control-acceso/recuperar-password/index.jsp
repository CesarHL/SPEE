<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	
</head>
<body>
	<s:set var="btnAceptar" value="%{getText('mx.com.eld.boton.aceptar')}" />
	<s:set var="btnCancelar" value="%{getText('mx.com.eld.boton.cancelar')}" />

	<div class="row title">
		<div class="col-md-12">
			<h1 class="title">
				<s:text name="IU1.3-3_TITLE"></s:text>
			</h1>
		</div>
	</div>

	<div class="form-group">
		<div class="col-md-8 col-md-offset-2">
			<s:actionmessage cssClass="alert alert-success" />
		</div>
	</div>
	
	<div class="outter-section form-medium text-left">
		<div class="col-md-12">
			<s:text name="mx.com.eld.label.camposObligatorios" />
		</div>
	</div>
	<s:form
		action="%{#pageContext.request.contextPath}/control-acceso/login"
		method="post" theme="simple">
		<fieldset class="form form-horizontal form-medium">
			<legend class="form-section">
				<s:text name="IU1.3-3_SUBTITLE" />
			</legend>
			<div class="form-group">
				<label
					class="col-xs-12 col-sm-4 col-md-4 control-label label-obligatorio"
					for=""> <s:text name="IU1.3.3_LBL3" />
				</label>
				<div class="col-xs-12 col-sm-8 col-md-8">
					<s:textfield cssClass="form-control campo"
						cssClassError="input-error" id="txUsuario" />
					<s:fielderror fieldName="" cssClass="error" theme="" />
				</div>
			</div>
			
			<label><s:text name="IU1.3-3-2_LBL1"/></label>
			
			<!-- Boton Aceptar y Cancelar -->

		</fieldset>

		<div class="outter-section form-medium text-right">
			<div class="col-xs-12 col-md-12 col-md-12 text-right">
				<a class="btn btn-default btn-default-eld"
					href="${pageContext.request.contextPath}/control-acceso/login">${btnAceptar}</a>
				<a class="btn btn-default btn-default-eld"
					href="${pageContext.request.contextPath}/control-acceso/login">${btnCancelar}</a>
			</div>
		</div>

	</s:form>
</body>
	</html>
</jsp:root>