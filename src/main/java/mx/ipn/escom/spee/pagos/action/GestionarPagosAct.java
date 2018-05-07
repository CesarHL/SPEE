package mx.ipn.escom.spee.pagos.action;

import org.apache.struts2.convention.annotation.Namespace;

import mx.ipn.escom.spee.action.GeneralActionSupport;
import mx.ipn.escom.spee.action.NombreObjetosSesion;
import mx.ipn.escom.spee.action.SessionManager;
import mx.ipn.escom.spee.controlacceso.mapeo.Usuario;
import mx.ipn.escom.spee.util.ResultConstants;

@Namespace("/pagos")
public class GestionarPagosAct extends GeneralActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Usuario usuarioSel;

	public String index() {
		getUsuarioSel();
		if (usuarioSel.getPerfilActivo()
				.getId() == mx.ipn.escom.spee.controlacceso.mapeo.Perfil.PerfilUsuarioEnum.ADMINISTRADOR_CELEX
						.getValor()) {
			return ResultConstants.ADMINISTRADOR_CELEX;
		} else if (usuarioSel.getPerfilActivo()
				.getId() == mx.ipn.escom.spee.controlacceso.mapeo.Perfil.PerfilUsuarioEnum.ALUMNO.getValor()) {
			return ResultConstants.ALUMNO;
		} else {
			return NO_AUTORIZADO;
		}
	}

	public String editNew() {
		return EDITNEW;
	}

	public Usuario getUsuarioSel() {
		if (SessionManager.get(NombreObjetosSesion.USUARIO_SESION) != null) {
			usuarioSel = (Usuario) SessionManager.get(NombreObjetosSesion.USUARIO_SESION);
		}
		return usuarioSel;
	}

	public void setUsuarioSel(Usuario usuarioSel) {
		this.usuarioSel = usuarioSel;
	}
}
