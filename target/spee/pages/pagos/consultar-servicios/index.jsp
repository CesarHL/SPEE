<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">

<jsp:text>
	<![CDATA[                 
	<script type="text/javascript" src="${pageContext.request.contextPath}/pages/pagos/gestionar-archivo-pagos/js/index.js"></script>
	]]>
</jsp:text>

<s:set var="listTiposContacto"
	value="{{'01/02/2018','Celex'},
	 {'01/02/2018', 'Celex'},
	 {'01/02/2018', 'Servicios Dentales'}}" />

<s:set var="ttbVisualizar" value="%{getText('tooltipVisualizar')}" />
<s:set var="varIconoVisualizar" value="'&#xE8F4;'" />

<div class="row title">
	<div class="col-md-12">
		<h1 class="title">
			<s:text name="CU90_TITLE" />
		</h1>
	</div>
</div>

<div class="form-medium">
	<div class="row">
		<label class="col-md-4 text-left control-label"> <s:text
				name="CU90_LBL1">
			</s:text>
		</label><label class="col-md-4 text-left"> César Erick Hernández López
		</label>

	</div>
	<div class="row">
		<label class="col-md-4 text-left control-label"> <s:text
				name="CU90_LBL2">
			</s:text>
		</label> <label class="col-md-4 text-left"> HELC920407HDFRPS03 </label>
	</div>
	<div class="row">
		<label class="col-md-4 text-left control-label"> <s:text
				name="CU90_LBL3">
			</s:text>
		</label> <label class="col-md-4 text-left"> 2013630206 </label>
	</div>
	<div class="row">
		<label class="col-md-4 text-left control-label"> <s:text
				name="CU90_LBL4">
			</s:text>
		</label> <label class="col-md-4 text-left"> 000001 </label>
	</div>

</div>

<div class="form-medium">
	<label class="col-md-4 control-label" for=""><s:text
			name="CU90_LBL5" /></label>
	<div class="col-md-7 col-contact">
		<s:select id="slcListTipoContactos" list="%{#listTiposContacto[0]}"
			name="Seleccione" listValue="nombre" listKey="id" headerKey="-1"
			headerValue="Seleccione" cssClass="form-control" required="true"
			cssErrorClass="error" />
	</div>
	<div class="col-md-1">
		<a href="${pageContext.request.contextPath}/pagos/consultar-servicios!visualizarServiciosCelex" class="btn btn-default btn-default-eld"><s:text
				name="%{getText('mx.com.eld.boton.mostrar')}" /></a>
	</div>
</div>

	</html>
</jsp:root>