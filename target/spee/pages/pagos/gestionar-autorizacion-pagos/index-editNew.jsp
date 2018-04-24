<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<jsp:text>
	<![CDATA[                 
	<script
		src="${pageContext.request.contextPath}/pages/admision/gestionar-autorizacion-pagos/js/index-editNew.js"
		type="text/javascript"></script>
	]]>
</jsp:text>
</head>
<body>
	<div class="row title">
		<div class="col-md-12">
			<h1 class="title">
				<s:text name="CU41_TITLE" />
			</h1>
		</div>
	</div>
	<fieldset class="form-section form-horizontal form-medium text-justify">
		<legend class="form-section">
			<s:text name="CU41_LBL1"></s:text>
		</legend>
		<s:property value="getText('CU41_LBL2')" />
		<div>
			<ul>
				<li><s:property value="getText('CU41_LBL3')" /></li>
			</ul>
		</div>
		<div class="form-group">
			<label class="col-md-4 control-label"> <s:text
					name="CU41_LBL4"></s:text>
			</label>
			<div class="col-md-6">
				<s:textfield cssClass="form-control" cssClassError="input-error"
					name="" id="txArchivo" />
				<s:fielderror fieldName="" cssClass="error" theme="" />
			</div>
			<div class="col-xs-12 col-sm-8 col-md-1">
				<span class="input-group-btn" id="loadImage"> <i
					class="material-icons md-24 md-eld"
					onclick="selectImage('fileIdentificacion');">file_upload</i>
				</span> <input type='file' id="fileIdentificacion"
					name="fileIdentificacion" class="hide" accept=".pdf" value="" />
			</div>
		</div>
	</fieldset>
	
	<div class="outter-section form-horizontal form-medium text-right">
		<a id="btnDialogAcept" class="btn btn-default btn-default-eld"
			href="${pageContext.request.contextPath}/pagos/gestionar-autorizacion-pagos">
			<s:text name="mx.com.eld.boton.aceptar" />
		</a> <a
			href="${pageContext.request.contextPath}/pagos/gestionar-autorizacion-pagos"
			class="btn btn-default btn-default-eld"><s:text
				name="mx.com.eld.boton.cancelar" /></a>
	</div>
</body>
	</html>
</jsp:root>