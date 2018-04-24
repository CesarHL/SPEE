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
	<s:set var="varTheme" value="%{getText('mx.edu.eld.defaulTheme')}" />

	<div class="col-md-12">
		<h1 class="title">
			<s:text name="IU1.3-1_TITLE"></s:text>
		</h1>
	</div>

	<div class="row form-group">
		<div class="col-md-8 col-md-offset-2">
			<s:actionerror theme="%{varTheme}" />
			<s:actionmessage theme="%{varTheme}" />
		</div>
	</div>

	<div class="outter-section form-medium text-left">
		<div class="col-md-12">
			<s:text name="mx.com.eld.label.camposObligatorios" />
		</div>
	</div>

	<!-- Formulario Login -->
	<div class="col-sm-12">
		<s:form id="frmLogin" method="post" theme="simple"
			cssClass="form form-horizontal form-medium"
			action="%{#pageContext.request.contextPath}/control-acceso/login">
			<!-- USUARIO -->
			<div class="form-group">
				<label
					class="col-xs-2 col-sm-4 col-md-4 control-label label-obligatorio">
					<s:text name="IU1.3-1_LBL1" />
				</label>
				<div class="col-xs-12 col-sm-8 col-md-8">
					<s:textfield cssClass="form-control campo"
						cssClassError="input-error" name="login" id="txUsuario" />
					<s:fielderror fieldName="login" cssClass="error"
						theme="%{#varTheme}" />
				</div>
			</div>
			<!-- CONTRASEÑA -->
			<div class="form-group">
				<label
					class="col-xs-2 col-sm-4 col-md-4 control-label label-obligatorio"><s:text
						name="IU1.3-1_LBL2" /></label>
				<div class="col-xs-12 col-sm-8 col-md-8 ">
					<s:password cssClass="form-control campo" name="password"
						cssClassError="input-error" id="txUsuario" />
					<s:fielderror fieldName="password" cssClass="error"
						theme="%{#varTheme}" />
				</div>
			</div>
			<!-- BOTON ACEPTAR -->
			<div class="form-group">
				<s:submit cssClass="btn btn-default btn-default-eld"
					key="mx.com.eld.boton.aceptar" />
			</div>
			<!-- ENLACES PARA RECUPERAR CONTRASEÑA Y CREAR CUENTA -->
			<div class="form-group center">
				<div class="row">
					<div class="col-md-12 center">
						<a class="liga"
							href="${pageContext.request.contextPath}/control-acceso/recuperar-password/"><s:text
								name="IU1.3-1_LBL3" /></a>
					</div>
				</div>
			</div>
		</s:form>
	</div>
</body>
	</html>
</jsp:root>