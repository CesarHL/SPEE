package mx.edu.spee.controlacceso.action;

import org.apache.struts2.convention.annotation.Namespace;

import mx.ipn.escom.spee.action.GeneralActionSupport;

@Namespace("/control-acceso")
public class ModificarDatosAct extends GeneralActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String editNew() {
		return EDITNEW;
	}

}
