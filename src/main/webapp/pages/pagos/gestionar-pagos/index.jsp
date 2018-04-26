<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">

<jsp:text>
	<![CDATA[                 
	<script type="text/javascript" src="${pageContext.request.contextPath}/pages/pagos/gestionar-pagos/js/index.js"></script>
	]]>
</jsp:text>

<s:set var="listPagosEnviados"
	value="{{'', '01/02/2018', '$550 MXN', 'Celex B1'}}" />

<s:set var="ttbVisualizar" value="%{getText('tooltipVisualizar')}" />
<s:set var="varIconoVisualizar" value="'&#xE415;'" />

<div class="row title">
	<div class="col-md-12">
		<h1 class="title">
			<s:text name="CU15_TITLE" />
		</h1>
	</div>
</div>

<div class="form-section form-horizontal">
	<div class="form-group">
		<div class="row">
			<div class="col-md-12">
				<table id="tblPagosEnviados" class="table table-striped">
					<thead>
						<tr>
							<th><s:text name="CU15_THEAD1" /></th>
							<th><s:text name="CU15_THEAD2" /></th>
							<th><s:text name="CU15_THEAD3" /></th>
							<th><s:text name="CU15_THEAD4" /></th>
							<th><s:text name="CU15_THEAD5" /></th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="listPagosEnviados" var="pagAutorizado">
							<tr>
								<td>${pagAutorizado[0]}</td>
								<td>${pagAutorizado[1]}</td>
								<td>${pagAutorizado[2]}</td>
								<td>${pagAutorizado[3]}</td>
								<td><a href="#" title="${ttbVisualizar}"> <i
										class="material-icons md-24 md-eld">${varIconoVisualizar}</i>
								</a></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<div class="text-left">
	<div class="col-md-12">
		<label><s:text name="CU15_LBL"></s:text></label>
		<s:text name="CU15_LBL1"></s:text>
	</div>
	<div class="col-md-12">
		<label><s:text name="CU15_LBL"></s:text></label>
		<s:text name="CU15_LBL2"></s:text>
	</div>
	<div class="col-md-12">
		<label><s:text name="CU15_LBL"></s:text></label>
		<s:text name="CU15_LBL3"></s:text>
	</div>
</div>
	</html>
</jsp:root>