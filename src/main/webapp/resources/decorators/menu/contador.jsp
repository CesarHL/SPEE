<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:decorator="http://www.opensymphony.com/sitemesh/decorator"
	xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:s="/struts-tags"
	xmlns:sj="/struts-jquery-tags"
	xmlns:log="http://jakarta.apache.org/taglibs/log-1.0">
	<jsp:directive.page language="java"
		contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" />
	<s:set var="ttbCicloEscolar"
		value="%{getText('menu.secretaria_administracion.ciclo_escolar')}" />

	<div class="navbar-eld sidebar" role="navigation">
		<div class="sidebar-nav navbar-collapse">
			<ul class="nav" id="side-menu">
				<li class="dropdown"><a title="" href="#"> <s:text
							name="menu.contador.configuracion_pagos" />
				</a></li>
				<li class="dropdown"><a title="" href="#"> <s:text
							name="menu.contador.prorrogas" />
				</a></li>

				<li class="dropdown"><a title="" href="#"> <s:text
							name="menu.contador.condonaciones" />
				</a></li>


				<li class="dropdown"><a
					href="${pageContext.request.contextPath}/pagos/gestionar-pagos"><s:text
							name="menu.contador.pagos" /><span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li class="dropdown">
						 <a
							href="${pageContext.request.contextPath}/pagos/gestionar-concepto-pago">
								<s:text name="menu.contador.gestionar_conceptos" />
						</a> <a
							href="${pageContext.request.contextPath}/pagos/gestionar-costo-concepto/new">
								<s:text name="menu.contador.costo_conceptos" />
						</a></li>
					</ul></li>

				<li class="dropdown"><a
					href="${pageContext.request.contextPath}/pagos/gestionar-pagos"><s:text
							name="menu.contador.esquema_pagos" /><span class="fa arrow"></span>
				</a>
					<ul class="nav nav-second-level">
						<li class="dropdown"><a
							href="${pageContext.request.contextPath}/entrevistas/gestionar-pago-admision">
								<s:text name="menu.contador.pagos_admision" />
						</a> <a href="#"> <s:text name="menu.contador.pagos_ciclo_escolar" />
						</a> <a href="#"> <s:text name="menu.contador.pagos_servicios" />
						</a> <a href="#"> <s:text name="menu.contador.pagos_titulacion" />
						</a> <a href="#"> <s:text name="menu.contador.pagos_particulares" />
						</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</jsp:root>