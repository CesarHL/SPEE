<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<!-- Head -->
</head>
<body>
	<!-- Título -->
	<div class="row title">
		<div class="col-md-12">
			<h1 class="title">
				<s:text name="IUGA7.3-14_TITLE"></s:text>
			</h1>
		</div>
	</div>
	<!-- ActionError and ActionMessage -->
	<div class="outter-section form-horizontal form-medium">
		<div class="row">
			<div class="col-md-12">
				<s:actionerror theme="%{getText('mx.edu.eld.defaulTheme')}" />
				<s:actionmessage theme="%{getText('mx.edu.eld.defaulTheme')}" />
			</div>
		</div>
	</div>

	<!-- Formulario Cambiar contraseña -->
	<div class="col-sm-12">
		<s:form id="frmCambiarContraseña"
			cssClass="form-horizontal"
			action="%{#pageContext.request.contextPath}/control-acceso/cambiar-contrasena/1"
			theme="simple">
			<fieldset class="form-section form-medium text-justify">
			<legend class="form-section">
				<s:text name="IUGA7.3-14_LBL1"/>
			</legend>

			<!-- Nombre de usuario -->
			<div class="form-group">
				<label
					class="col-xs-2 col-sm-4 col-md-4 control-label">
					<s:text name="IUGA7.3-14_LBL2" />
				</label>
				<div class="col-xs-12 col-sm-8 col-md-8">
				<s:text name="%{model.nombre}" />
				</div>
			</div>
			<!-- Contraseña -->
			<div class="form-group">
				<label
					class="col-xs-2 col-sm-4 col-md-4 control-label label-obligatorio"><s:text
						name="IUGA7.3-14_LBL3" /></label>
				<div class="col-xs-12 col-sm-8 col-md-8 ">
					<s:password cssClass="form-control campo"
						cssClassError="input-error" id="psContraseña" name="model.password" />
					<s:fielderror fieldName="model.password" cssClass="error" theme="" />
				</div>
			</div>
			<!-- Confirmar contraseña -->
			<div class="form-group">
				<label
					class="col-xs-2 col-sm-4 col-md-4 control-label label-obligatorio"><s:text
						name="IUGA7.3-14_LBL4" /></label>
				<div class="col-xs-12 col-sm-8 col-md-8 ">
					<s:password cssClass="form-control campo"
						cssClassError="input-error" id="psContraseña" />
					<s:fielderror fieldName="" cssClass="error" theme="" />
				</div>
			</div>
			</fieldset>
			<!-- Botones -->
			<div class="row">
				<div class="outter-section form-medium">
					<div class="col-md-12 text-right">
						<s:submit value="%{getText('mx.com.eld.boton.aceptar')}" class="btn btn-default btn-default-eld"/>
						<a class="btn btn-default btn-default-eld"
						   href="${pageContext.request.contextPath}/profesor/gestionar-profesor">
						   <s:text name="mx.com.eld.boton.cancelar"/>
						</a>
					</div>
				</div>
			</div>
		</s:form>
	</div>
</body>
	</html>
</jsp:root>