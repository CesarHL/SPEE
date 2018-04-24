package mx.edu.spee.controlacceso.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;

import mx.ipn.escom.spee.action.GeneralActionSupport;

@Namespace("/control-acceso")
@Results({
		@Result(name = "activado", type = "redirectAction", params = { "actionName",
				"../admision/bienvenida-aspirante" }),
		@Result(name = "condiciones-aceptadas", type = "redirectAction", params = { "actionName",
				"../admision/registrar-aspirante" }),
		@Result(name = "registrada", type = "redirectAction", params = { "actionName",
				"../admision/pagar-admision/new" }),
		@Result(name = "pago-derecho", type = "redirectAction", params = { "actionName",
				"../admision/pagar-admision/" }),
		@Result(name = "evaluacion", type = "redirectAction", params = { "actionName",
				"../admision/gestionar-evaluacion-aspirante" }),
		@Result(name = "entrevista", type = "redirectAction", params = { "actionName",
				"../entrevistas/gestionar-calendarizacion-entrevista" }),
		@Result(name = "espera-resultado", type = "redirectAction", params = { "actionName",
				"../admision/aspirantes-aceptar!resultados" }),
		@Result(name = "aceptado", type = "redirectAction", params = { "actionName",
				"../admision/gestionar-resultado" }),
		@Result(name = "aspirante-no-aceptado", type = "redirectAction", params = { "actionName",
				"../admision/gestionar-resultado!noAceptado" }) })
public class LoginAspiranteAct extends GeneralActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8720707885186387681L;

	/**
	 * Variables utilizadas para redireccionar al aspirante, segun el estado en
	 * el que se encuentre.
	 */
	private static final String REDIRECT_ACTIVADO = "activado";

	/**
	 * Login con el que intenta iniciar sesion un aspirante
	 */
	private String login;

	/**
	 * Password con el que intenta iniciar sesion un aspirante
	 */
	private String password;

	/**
	 * Metodo index de la convencion de rest que dirige a la pantalla de login
	 * de los aspirantes, de no haber una convocatoria activa se notifica al
	 * aspirante
	 * 
	 * @return
	 */
	public DefaultHttpHeaders index() {
		return new DefaultHttpHeaders(INDEX).disableCaching();
	}

	/**
	 * Metodo create segun la convencion de rest, utilizado para el acceso del
	 * aspirante segun el estado en el que se encuentre. En cada uno de los
	 * estados a excepcion del estado de espera de resultados, se verifica el
	 * periodo de las actividades, que se encuentren en tiempo de su aplicacion.
	 * 
	 * @return
	 */
	public String create() {
		return REDIRECT_ACTIVADO;
	}

	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
