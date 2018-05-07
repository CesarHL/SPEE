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

<s:set var="listPagosAutorizados"
	value="{{ 'César Erick Hernández López', 'HELC920704HDFRPS03', '2013630206', '01/May/2018', '$550 MXN', 'Celex B1'}}" />

<s:set var="ttbVisualizar" value="%{getText('tooltipVisualizar')}" />
<s:set var="varIconoVisualizar" value="'&#xE415;'" />

<div class="row title">
	<div class="col-md-12">
		<h1 class="title">
			<s:text name="CU98_TITLE" />
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
							<th><s:text name="CU98_THEAD1" /></th>
							<th><s:text name="CU98_THEAD2" /></th>
							<th><s:text name="CU98_THEAD3" /></th>
							<th><s:text name="CU98_THEAD4" /></th>
							<th><s:text name="CU98_THEAD5" /></th>
							<th><s:text name="CU98_THEAD6" /></th>
							<th><s:text name="CU98_THEAD7" /></th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="listPagosAutorizados" var="pagAutorizado">
							<tr>
								<td>${pagAutorizado[0]}</td>
								<td>${pagAutorizado[1]}</td>
								<td>${pagAutorizado[2]}</td>
								<td>${pagAutorizado[3]}</td>
								<td>${pagAutorizado[4]}</td>
								<td>${pagAutorizado[5]}</td>
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
	</html>
</jsp:root>