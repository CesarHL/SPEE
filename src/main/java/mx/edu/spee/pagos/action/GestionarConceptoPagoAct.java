package mx.edu.spee.pagos.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import mx.ipn.escom.spee.action.GeneralActionSupport;

@Namespace("/pagos")
@Results({ @Result(name = GeneralActionSupport.SUCCESS, type = "redirectAction", params = { "actionName", "" }),
		@Result(name = GeneralActionSupport.ERROR, type = "redirectAction", params = { "actionName", "" }) })
public class GestionarConceptoPagoAct extends GeneralActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String index(){
		return INDEX;
	}

	public String editNew() {
		return EDITNEW;
	}

	public String show() {
		return SHOW;
	}
	
	public void validateCreate() {

	}
	
	public String create() {
		return SUCCESS;
	}
}
