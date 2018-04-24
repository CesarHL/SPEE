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

	<s:set var="tool" value="getText('MSG41')" />
	<!-- Título -->
	<div class="row title">
		<div class="col-md-12">
			<h1 class="title">
				<s:text name="IU1.7-15_TITLE"></s:text>
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

	<!-- Anotacion campos obligatorios-->
	<div class="col-md-12">
		<div class="outter-section form-medium text-left">
			<s:text name="mx.com.eld.label.camposObligatorios" />
		</div>
	</div>

	<!-- Formulario Registrar contraseña -->
	<div class="col-sm-12">
		<s:form id="frmRegistrarContraseña" cssClass="form-horizontal"
			action="%{#pageContext.request.contextPath}/control-acceso/cambiar-contrasena"
			theme="simple">
			<fieldset class="form-section form-medium text-justify">
				<legend class="form-section">
					<s:text name="IU1.7-15_LEGEND" />
				</legend>

				<!-- Correo electronico -->
				<div class="form-group">
					<label class="col-xs-12 col-sm-4 col-md-4 control-label ">
						<s:text name="IU1.7-15_LBL1" />
					</label> 
					<div class="col-xs-8 col-md-8 text-xs-left text-md-left">
					<label ><s:property
							value="getText('IU1.7-15_LBL4')" /> </label>
					</div>
				</div>
				<!-- Contraseña -->
				<div class="form-group">

					<label
						class="col-xs-2 col-sm-4 col-md-4 control-label label-obligatorio"><i
						class="material-icons md-15 md-eld" data-toggle="tooltip"
						data-placement="top" title="${tool}">&#xE887;</i>&#160;<s:text
							name="IU1.7-15_LBL2" /></label>
					<div class="col-xs-12 col-sm-8 col-md-8 ">
						<s:password cssClass="form-control campo"
							cssClassError="input-error" id="psContraseña"
							name="model.password" />
						<s:fielderror fieldName="model.password" cssClass="error" theme="" />
					</div>
				</div>
				<!-- Confirmar contraseña -->
				<div class="form-group">
					<label
						class="col-xs-2 col-sm-4 col-md-4 control-label label-obligatorio"><s:text
							name="IU1.7-15_LBL3" /></label>
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
						<a class="btn btn-default btn-default-eld" href="#"> <s:text
								name="mx.com.eld.boton.aceptar" />
						</a> <a class="btn btn-default btn-default-eld" href="#"> <s:text
								name="mx.com.eld.boton.cancelar" />
						</a>
					</div>
				</div>
			</div>
		</s:form>
	</div>
</body>
	</html>
</jsp:root>