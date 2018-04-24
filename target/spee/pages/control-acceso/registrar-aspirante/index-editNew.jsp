<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0" xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
    <jsp:directive.page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
    <html xmlns="http://www.w3.org/1999/xhtml">

    <head>
        <!-- Head -->
    </head>

    <body>
        <!-- Variables -->
        <s:set var="btnAceptar" value="%{getText('mx.com.eld.boton.aceptar')}" />
        <s:set var="btnCancelar" value="%{getText('mx.com.eld.boton.cancelar')}" />
        <s:set var="theme" value="%{getText('mx.edu.eld.defaulTheme')}" />

        <!-- Title -->
        <div class="row title">
            <div class="col-md-12">
                <h1 class="title">
				<s:text name="IU1.3-2_TITLE"></s:text>
			</h1>
            </div>
        </div>
        
        <!-- Action Message -->
        <div class="form-group">
            <div class="col-md-8 col-md-offset-2">
                <s:actionmessage theme="%{#theme}" />
                <s:actionerror theme="%{#theme}" />
            </div>
        </div>
        
        <!-- Anotacion campos obligatorios -->
        <div class="col-md-12">
            <div class="outter-section form-medium text-left">
                <s:text name="mx.com.eld.label.camposObligatorios" />
            </div>
        </div>
        
        <s:form action="%{#pageContext.request.contextPath}/control-acceso/registrar-aspirante" method="post" theme="simple">
            <fieldset class="form form-horizontal form-medium">
                <legend class="form-section">
                    <s:text name="IU1.3-2_SUBTITLE" />
                </legend>
                <!-- CURP -->
                <div class="form-group">
                    <label class="col-xs-12 col-sm-4 col-md-4 control-label label-obligatorio" for="">
                        <s:text name="IU1.4-1_LBL1" />
                    </label>
                    <div class="col-xs-12 col-sm-8 col-md-8">
                        <s:textfield name="model.curp" cssClass="form-control" cssClassError="input-error" id="txUsuario" maxlength="18"/>
                        <s:fielderror fieldName="model.curp" cssClass="error" theme="%{#theme}" />
                    </div>
                </div>
                <!-- NOMBRE -->
                <div class="form-group">
                    <label class="col-xs-12 col-sm-4 col-md-4 control-label label-obligatorio" for="">
                        <s:text name="IU1.3-2_LBL1" />
                    </label>
                    <div class="col-xs-12 col-sm-8 col-md-8">
                        <s:textfield name="model.nombre" cssClass="form-control" cssClassError="input-error" id="txUsuario" maxlength="100"/>
                        <s:fielderror fieldName="model.nombre" cssClass="error" theme="%{#theme}" />
                    </div>
                </div>
                <!-- PRIMER APELLIDO -->
                <div class="form-group">
                    <label class="col-xs-12 col-sm-4 col-md-4 control-label label-obligatorio" for="">
                        <s:text name="IU1.3-2_LBL2" />
                    </label>
                    <div class="col-xs-12 col-sm-8 col-md-8">
                        <s:textfield name="model.primerApellido" cssClass="form-control" cssClassError="input-error" id="txUsuario" maxlength="100"/>
                        <s:fielderror fieldName="model.primerApellido" cssClass="error" theme="%{#theme}" />
                    </div>
                </div>
                <!-- SEGUNDO APELLIDO -->
                <div class="form-group">
                    <label class="col-xs-12 col-sm-4 col-md-4 control-label" for="">
                        <s:text name="IU1.3-2_LBL3" />
                    </label>
                    <div class="col-xs-12 col-sm-8 col-md-8">
                        <s:textfield name="model.segundoApellido" cssClass="form-control" cssClassError="input-error" id="txUsuario" maxlength="100"/>
                        <s:fielderror fieldName="model.segundoApellido" cssClass="error" theme="%{#theme}" />
                    </div>
                </div>
                <!-- Correo electronico -->
                <div class="form-group">
                    <label class="col-xs-12 col-sm-4 col-md-4 control-label label-obligatorio" for="">
                        <s:text name="IU1.3-2_LBL4" />
                    </label>
                    <div class="col-xs-12 col-sm-8 col-md-8">
                        <s:textfield name="model.login" cssClass="form-control" cssClassError="input-error" id="txUsuario" maxlength="50"/>
                        <s:fielderror fieldName="model.login" cssClass="error" theme="%{#theme}" />
                    </div>
                </div>
                <!-- confirmar correo electronico -->
                <div class="form-group">
                    <label class="col-xs-12 col-sm-4 col-md-4 control-label label-obligatorio" for="">
                        <s:text name="IU1.3-2_LBL5" />
                    </label>
                    <div class="col-xs-12 col-sm-8 col-md-8">
                        <s:textfield name="model.confirmLogin" cssClass="form-control" cssClassError="input-error" id="txUsuario" maxlength="50"/>
                        <s:fielderror fieldName="model.confirmLogin" cssClass="error" theme="%{#theme}" />
                    </div>
                </div>
            </fieldset>
            <!-- Boton Aceptar y Cancelar -->
            <div class="outter-section form-medium text-right">
                <div class="col-xs-12 col-md-12 col-md-12 text-right">
                    <a class="btn btn-default btn-default-eld" href="${pageContext.request.contextPath}/control-acceso/login-aspirante">${btnAceptar}</a>
                    <a class="btn btn-default btn-default-eld" href="${pageContext.request.contextPath}/control-acceso/login-aspirante">${btnCancelar}</a>
                </div>
            </div>
        </s:form>
    </body>

    </html>
</jsp:root>