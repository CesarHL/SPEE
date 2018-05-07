package mx.edu.spee.controlacceso.action;

import org.apache.struts2.convention.annotation.AllowedMethods;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import mx.edu.spee.controlacceso.bs.LoginBs;
import mx.edu.spee.controlacceso.exception.UserNotFoundException;
import mx.edu.spee.example.action.MenuAct;
import mx.ipn.escom.spee.action.GeneralActionSupport;
import mx.ipn.escom.spee.action.NombreObjetosSesion;
import mx.ipn.escom.spee.action.SessionManager;
import mx.ipn.escom.spee.controlacceso.mapeo.Usuario;
import mx.ipn.escom.spee.controlacceso.mapeo.Perfil.PerfilUsuarioEnum;

@Namespace("/control-acceso")
@AllowedMethods({ "cambiarMenu", "welcome" })
@Results({ @Result(name = MenuAct.MENU, type = "redirectAction", params = { "actionName", "%{action}" }) })
public class LoginAct extends GeneralActionSupport {

	protected static final String WELCOME = "welcome";

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginAct.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String action;

	private String usuarioAux;

	/**
	 * Login de acceso del usuario
	 */
	private String login;

	/**
	 * Password de acceso del usuario
	 */
	private String password;

	private static final String BIENVENIDA_RESULT = "../control-acceso/gestionar-bienvenida";

	@Autowired
	private LoginBs loginBs;

	public static final String MENU = "menu";

	public String index() {
		return INDEX;
	}

	public void validateCreate() {
		try {
			loginBs.ingresar(login, password);
		} catch (UserNotFoundException e) {
			addActionError(getText("MSG29"));
			LOGGER.error("Usuario no encontrado");
		}
	}

	/**
	 * Este metodo asigna el usuario (con perfil) dado y lo guarda en session de
	 * acuerdo al ingresado en el login
	 * 
	 * @return
	 */
	public String create() {
		Usuario usuario = (Usuario) SessionManager.get(NombreObjetosSesion.USUARIO_SESION);
		if (PerfilUsuarioEnum.SUBDIRECTOR.getValor().equals(usuario.getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.ADMINISTRADOR_CELEX.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.ADMINISTRADOR_DENTALES.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.ADMINISTRADOR_BIBLIOTECA.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.ADMINISTRADOR_FOTOCOPIADO.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.ENCARGADO_CAJA.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.CONTADOR.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.ALUMNO.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.TRABAJADOR.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else if (PerfilUsuarioEnum.EXTERNO.getValor().equals(usuario.getPerfilActivo().getId())) {
			action = BIENVENIDA_RESULT;
		} else {
			action = "../example/example-a";
		}
		return MENU;
	}

	/*
	 * Manda a la pantalla de bienvenda del usuario
	 */
	public String welcome() {
		return WELCOME;
	}

	/**
	 * @return the login
	 */
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

	/**
	 * @return the password
	 */
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

	/**
	 * @return the loginBs
	 */
	public LoginBs getLoginBs() {
		return loginBs;
	}

	/**
	 * @param loginBs
	 *            the loginBs to set
	 */
	public void setLoginBs(LoginBs loginBs) {
		this.loginBs = loginBs;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getUsuarioAux() {
		if (usuarioAux == null) {
			usuarioAux = new String();
		}
		return usuarioAux;
	}

	public void setUsuarioAux(String usuarioAux) {
		this.usuarioAux = usuarioAux;
	}
}
