package mx.ipn.escom.spee.pagos.action;

import org.apache.struts2.convention.annotation.AllowedMethods;
import org.apache.struts2.convention.annotation.Namespace;

import mx.ipn.escom.spee.action.GeneralActionSupport;

@Namespace("/pagos")
@AllowedMethods({ "autorizarPago", "rechazarPago"})
public class GestionarAutorizacionPagosAct extends GeneralActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String index() {
		return INDEX;
	}
	
	public String show() {
		return SHOW;
	}
	
	public String editNew() {
		return EDITNEW;
	}
	
	public void autorizarPago() {
		
	}
	
	public void rechazarPago() {
		
	}
}
