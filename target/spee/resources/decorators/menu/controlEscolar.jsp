<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:decorator="http://www.opensymphony.com/sitemesh/decorator"
	xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:s="/struts-tags"
	xmlns:sj="/struts-jquery-tags"
	xmlns:log="http://jakarta.apache.org/taglibs/log-1.0">
	<jsp:directive.page language="java"
		contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" />
	<s:set var="ttbProcesoAdmision"
		value="%{getText('menu.coordinacion.proceso_admision')}" />
	<s:set var="ttbEntrevista"
		value="%{getText('menu.coordinacion.entrevistas')}" />
	<s:set var="ttbGestionAcademica"
		value="%{getText('menu.coordinacion.gestion_academica')}" />
	<s:set var="ttbEstructuracionAcademica"
		value="%{getText('menu.coordinacion.estructuración_academica')}" />
	<s:set var="ttbReinscripcion"
		value="%{getText('menu.coordinacion.reinscripcion')}" />
	<s:set var="ttbInscripciones"
		value="%{getText('menu.coordinacion.inscripciones')}" />
	<!-- /.navbar-top-links -->
	<div class="navbar-eld sidebar" role="navigation">
		<div class="sidebar-nav navbar-collapse">
			<ul class="nav" id="side-menu">
				<!-- Admisión -->
				<li class="dropdown"><a href="#" title="${ttbProcesoAdmision}">
						<s:text name="menu.coordinacion.proceso_admision" /> <span
						class="fa arrow" />
				</a>
					<ul class="nav nav-second-level">
						<!-- Gestionar Convocatoria de Ingreso -->
						<li class="dropdown"><a
							href="${pageContext.request.contextPath}/convocatoria/gestionar-convocatoria">
								<s:text name="menu.coordinacion.convocatoria" />
						</a></li>
						<!-- Registro de aspirantes -->
						<li class="dropdown"><a
							href="${pageContext.request.contextPath}/admision/gestionar-aspirantes">
								<s:text name="menu.coordinacion.gestionar_registro_aspirantes" />
						</a></li>
						
						<!-- Examen Psicometrico -->
						<li class="dropdown"><a href="${pageContext.request.contextPath}/psicometrico/gestionar-examen-psicometrico"> <s:text
									name="menu.coordinacion.examen_psicometrico" />
						</a></li>

						<!-- Evaluacion de conocimientos -->
						<li class="dropdown"><a
							href="${pageContext.request.contextPath}/ceneval/gestionar-evaluacion-conocimientos">
								<s:text name="menu.coordinacion.evaluacion_conocimientos" />
						</a></li>

						<!-- Aspirantes -->
						<li class="dropdown"><a href="#"> <s:text
									name="menu.coordinacion.seleccion_aspirantes" /> <span
								class="fa arrow" />
						</a>
							<ul class="nav nav-third-level">
								<!-- Aspirantes Aceptados -->
								<li class="dropdown"><a
									href="${pageContext.request.contextPath}/admision/aspirantes-aceptar">
										<s:text name="menu.coordinacion.aspirantes_aceptados" />
								</a></li>
								<!-- Aspirantes en espera -->
								<li class="dropdown"><a
									href="${pageContext.request.contextPath}/admision/aspirantes-aceptar/new">
										<s:text name="menu.coordinacion.aspirantes_en_espera" />
								</a></li>
						</ul></li>
				</ul></li>
				<!-- Entrevistas -->
				<li class="dropdown"><a href="#" title="${ttbEntrevista}">
						<s:text name="menu.coordinacion.entrevistas" /> <span
						class="fa arrow" />
				</a>
					<ul class="nav nav-second-level">
						<!-- Gestionar Entrevistas -->
						<li class="dropdown"><a
							href="${pageContext.request.contextPath}/entrevistas/gestionar-entrevistas">
								<s:text name="menu.coordinacion.gestionar_aplicacion_entrevistas" />
						</a></li>
						<!-- Lista de aspirantes Seleccionados -->
						<li class="dropdown"><a
							href="${pageContext.request.contextPath}/admision/gestionar-aspirante-entrevista/new">
								<s:text name="menu.coordinacion.lista_aspirantes_seleccionados" />
						</a></li>
						<!-- Gestionar Entrevistadores -->
						<li class="dropdown"><a
							href="${pageContext.request.contextPath}/entrevistas/gestionar-entrevistadores">
								<s:text name="menu.coordinacion.gestionar_entrevistadores" />
						</a></li>
				</ul></li>
			</ul>
		</div>
	</div>
</jsp:root>