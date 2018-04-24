package mx.edu.spee.controlacceso.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import mx.ipn.escom.spee.action.GeneralActionSupport;

@Namespace("/control-acceso")
@Result(name = GeneralActionSupport.SUCCESS, type = "redirectAction", params = { "actionName",
		"../profesor/gestionar-profesor" })
public class CambiarContrasenaAct extends GeneralActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String edit() {
		return EDIT;
	}

	/*
	 * IU1.7-15 Registrar Contraseña
	 */
	public String editNew() {
		return EDITNEW;
	}

	public void validateUpdate() {

	}

	public String update() {

		return SUCCESS;
	}

}
