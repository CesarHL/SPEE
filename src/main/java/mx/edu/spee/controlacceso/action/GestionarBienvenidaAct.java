package mx.edu.spee.controlacceso.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import mx.ipn.escom.spee.action.GeneralActionSupport;
import mx.ipn.escom.spee.action.NombreObjetosSesion;
import mx.ipn.escom.spee.action.SessionManager;
import mx.ipn.escom.spee.controlacceso.mapeo.Usuario;

/**
 * Clase para gestionar los mensajes de bienvenida de los distintos actores del
 * SAE
 *
 * @author ELD
 */
@Namespace("/control-acceso")
@Results({ @Result(name = "login", type = "redirectAction", params = { "actionName", "login" }) })
public class GestionarBienvenidaAct extends GeneralActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1689537805258891308L;

	/**
	 * Metodo index de la convencion de rest, direcciona a la pantalla de
	 * bienvenida de cada perfil, en caso de que no exista un usuario en sesion
	 * direcciona a la pantalla de login
	 * 
	 * @return
	 */
	public String index() {
		Usuario usuario = (Usuario) SessionManager.get(NombreObjetosSesion.USUARIO_SESION);
		if (usuario != null) {
			return INDEX;
		} else {
			return LOGIN;
		}
	}
}
