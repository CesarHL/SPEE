package mx.edu.spee.controlacceso.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/control-acceso")
@Result(name = "SUCCESS", type = "redirectAction", params = { "actionName", "../control-acceso/login" })
public class RecuperarPasswordAct extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String index(){
		return "index";
	}

	public String edit(){
		return "edit";
	}
	
	public String update(){
		return SUCCESS;
	}
}
