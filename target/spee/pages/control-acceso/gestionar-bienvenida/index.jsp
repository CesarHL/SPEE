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
	<!-- Usuario en sesion -->
	<s:set var="usuario"
		value="%{#session[@mx.ipn.escom.cdt.util.action.NombreObjetosSesion@USUARIO_SESION]}" />
	<!-- Perfiles que se encuentran en el sistema -->
	<s:set var="varSA"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@SECRETARIA_DE_ADMINISTRACION.getValor()}" />
	<s:set var="varCCE"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@COORDINACION_CONTROL_ESCOLAR.getValor()}" />
	<s:set var="varASA"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@ASISTENTE_S_A.getValor()}" />
	<s:set var="varAS"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@ASPIRANTE.getValor()}" />
	<s:set var="varPR"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@PROFESOR.getValor()}" />
	<s:set var="varRCE"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@RESPONSABLE_CONTROL_ESCOLAR.getValor()}" />
	<s:set var="varPS"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@PSICOLOGO.getValor()}" />
	<s:set var="varCP"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@COORDINADOR_PSICOLOGO.getValor()}" />
	<s:set var="varCONT"
		value="%{@mx.ipn.escom.cdt.controlacceso.mapeo.Perfil$PerfilUsuarioEnum@CONTADOR.getValor()}" />

	<div class="row title">
		<div class="col-md-12">
			<h1 class="title">
				<s:text name="IU1A_TITLE" />
			</h1>
		</div>
	</div>

	<div class="form-group">
		<div class="col-md-8 col-md-offset-2">
			<s:actionmessage cssClass="alert alert-success" />
		</div>
	</div>

	<!-- Formulario Login -->
	<div class="outter-section form form-medium">

		<s:if test="#usuario.perfilActivo.id == #varSA">
			<s:text name="IU1A_LABEL1">
				<s:param>
					secretaría de administración
				</s:param>
			</s:text>
		</s:if>

		<s:elseif test="#usuario.perfilActivo.id == #varCCE">
			<s:text name="IU1A_LABEL1">
				<s:param>
					coordinación de control escolar
				</s:param>
			</s:text>
		</s:elseif>
		<s:elseif test="#usuario.perfilActivo.id == #varASA">
			<s:text name="IU1A_LABEL1">
				<s:param>
					asistente de secretaría de administración
				</s:param>
			</s:text>
		</s:elseif>
		<s:elseif test="#usuario.perfilActivo.id == #varAS">
			<s:text name="IU1A_LABEL1">
				<s:param>
					aspirante
				</s:param>
			</s:text>
		</s:elseif>
		<s:elseif test="#usuario.perfilActivo.id == #varPR">
			<s:text name="IU1A_LABEL1">
				<s:param>
					profesor
				</s:param>
			</s:text>
		</s:elseif>
		<s:elseif test="#usuario.perfilActivo.id == #varRCE">
			<s:text name="IU1A_LABEL1">
				<s:param>
					responsable de control escolar
				</s:param>
			</s:text>
		</s:elseif>
		<s:elseif test="#usuario.perfilActivo.id == #varPS">
			<s:text name="IU1A_LABEL1">
				<s:param>
					psícologo
				</s:param>
			</s:text>
		</s:elseif>
		<s:elseif test="#usuario.perfilActivo.id == #varCP">
			<s:text name="IU1A_LABEL1">
				<s:param>
					coordinador de psicologos
				</s:param>
			</s:text>
		</s:elseif>
		<s:elseif test="#usuario.perfilActivo.id == #varCONT">
			<s:text name="IU1A_LABEL1">
				<s:param>
					contador
				</s:param>
			</s:text>
		</s:elseif>
	</div>
</body>
	</html>
</jsp:root>