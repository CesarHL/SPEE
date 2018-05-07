/**
 * 
 */
package mx.edu.spee.controlacceso.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import mx.ipn.escom.spee.action.GeneralActionSupport;

@Namespace("/control-acceso")
@Results({
		@Result(name = GeneralActionSupport.SUCCESS, type = "redirectAction", params = { "actionName",
				"../control-acceso/login-aspirante" }),
		@Result(name = ActivarCuentaAct.SIN_REGISTRO_CUENTAS, type = "redirectAction", params = { "actionName",
				"../control-acceso/login-aspirante" }) })
public class ActivarCuentaAct extends GeneralActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1826843150920974694L;

	public static final String SIN_REGISTRO_CUENTAS = "sinRegistroCuentas";

	/**
	 * Token de la cuenta a activar
	 */
	private String token;

	/**
	 * Verifica si existe un periodo de registro de cuentas valido, si el token
	 * viene vacio, ha expirado o no es encontrado en la tabla de aspirantes
	 * 
	 * @return
	 */
	public String editNew() {
		return EDITNEW;
	}

	public String activarCuentaAspirante() {
		return SUCCESS;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
