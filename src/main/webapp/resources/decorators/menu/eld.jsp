<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:decorator="http://www.opensymphony.com/sitemesh/decorator"
	xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:s="/struts-tags"
	xmlns:sj="/struts-jquery-tags"
	xmlns:log="http://jakarta.apache.org/taglibs/log-1.0"><s:text name=""/>
	<jsp:directive.page language="java"
		contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" />
		<s:set var="ttbCicloEscolar" value="%{getText('menu.eld.ciclo_escolar')}" />
		<s:set var="ttbProcesoAdmision" value="%{getText('menu.eld.proceso_admision')}" />
		<s:set var="ttbInscripciones" value="%{getText('menu.eld.incripciones')}" />
		<s:set var="ttbEvaluaciones" value="%{getText('menu.eld.evaluaciones')}" />
		<s:set var="ttbSeguimiento" value="%{getText('menu.eld.seguimiento_egresados')}" />
	<ul class="nav navbar-nav">
		<li class="dropdown"><a title="${ttbCicloEscolar}"
			data-toggle="dropdown" class="dropdown-toggle" href="#"
			aria-expanded="false"><s:text name="menu.eld.ciclo_escolar"/><b class="caret"> <!--  -->
			</b></a>
			<ul class="dropdown-menu">
				<!-- <li><a
					href="${pageContext.request.contextPath}/admision/realizar-registro/new">Calendario
						Académico</a></li> -->
				<li><a
					href="${pageContext.request.contextPath}/convocatoria/gestionar-convocatoria"><s:text name="menu.eld.convocatoria"/></a></li>
			</ul></li>
		<li class="dropdown"><a title="${ttbProcesoAdmision}"
			data-toggle="dropdown" class="dropdown-toggle" href="#"
			aria-expanded="false"><s:text name="menu.eld.proceso_admision"/><b class="caret"> <!--  -->
			</b></a>
			<ul class="dropdown-menu">
				<!-- <li><a
					href="${pageContext.request.contextPath}/admision/realizar-registro/new">Gestionar
						Registro de Aspirantes</a></li> -->
				<li class="dropdown-submenu"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"><s:text name="menu.eld.CENEVAL"/></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/ceneval/registrar-folios/new"><s:text name="menu.eld.registrar_folios_CENEVAL"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/ceneval/gestionar-aspirantes-salon"><s:text name="menu.eld.establecer_aspirantes_salon"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/ceneval/planificar-salones"><s:text name="menu.eld.planificar_salones"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/ceneval/planificar-salones!show"><s:text name="menu.eld.ver_salones_programados"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/ceneval/generar-archivo"><s:text name="menu.eld.generar_asignacion_folios"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/ceneval/registrar-folios!resultados"><s:text name="menu.eld.registrar_resultados"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/ceneval/registrar-folios!showResultados"><s:text name="menu.eld.ver_resultados"/></a></li>
						<!-- <li><a href="${pageContext.request.contextPath}/ceneval/">Ver Reporte de Inconsistencias</a></li>-->
					</ul></li>
				<!-- <li><a
					href="${pageContext.request.contextPath}/admision/realizar-registro/new">Examen
						Psicométrico</a></li> -->
				<li class="dropdown-submenu"><a
					href="#"><s:text name="menu.eld.entrevistas"/></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/admision/aspirantes-entrevistar"><s:text name="menu.eld.definir_numero_aspirantes_entrevistar"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/admision/aspirantes-entrevistar/1"><s:text name="menu.eld.gestionar.lista_aspirantes_seleccionados"/></a></li>
						<li><a href="${pageContext.request.contextPath}/entrevistas/gestionar-periodo-entrevista"><s:text name="menu.eld.gestionar_periodos_entrevistas"/></a></li>
						<li><a href="${pageContext.request.contextPath}/entrevistas/gestionar-salones/new"><s:text name="menu.eld.gestionar_salones"/></a></li>
						<li><a href="${pageContext.request.contextPath}/entrevistas/gestionar-entrevistadores"><s:text name="menu.eld.gestionar_entrevistadores"/></a></li>
						<!--<li><a href="${pageContext.request.contextPath}">Gestionar Calendario de Entrevistas</a></li>-->
						<li><a href="${pageContext.request.contextPath}/entrevistas/gestionar-lista-aspirantes"><s:text name="menu.eld.gestionar_aspirantes_programar"/></a></li>
						<li><a href="${pageContext.request.contextPath}/entrevistas/gestionar-confirmacion-aspirante"><s:text name="menu.eld.gestionar_aspirantes_confirmar"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/entrevistas/gestionar-entrevistas/new"><s:text name="menu.eld.evaluacion_ntrevistas"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/entrevistas/gestionar-entrevistas"><s:text name="menu.eld.resultados_entrevistas"/></a></li>
					</ul></li>
				<li class="dropdown-submenu"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"><s:text name="menu.eld.seleccion_aspirantes"/></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/admision/aspirantes-aceptar"><s:text name="menu.eld.actualizar_numero_aspirantes_aceptar"/></a></li>
						<li><a
							href="${pageContext.request.contextPath}/admision/aspirantes-aceptar/1"><s:text name="menu.eld.definir_lista_aspirantes_aceptados"/></a></li>
					</ul></li>
			</ul></li>
		<li class="dropdown"><a title="${ttbInscripciones}"
			data-toggle="dropdown" class="dropdown-toggle" href="#"
			aria-expanded="false"><s:text name="menu.eld.incripciones"/></a></li>
		<li class="dropdown"><a title="${ttbEvaluaciones}"
			data-toggle="dropdown" class="dropdown-toggle" href="#"
			aria-expanded="false"><s:text name="menu.eld.evaluaciones"/></a></li>
		<li class="dropdown"><a title="${ttbSeguimiento}"
			data-toggle="dropdown" class="dropdown-toggle" href=""
			aria-expanded="false"><s:text name="menu.eld.seguimiento_egresados"/></a></li>
	</ul>
</jsp:root>