package mx.ipn.escom.spee.pagos.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import mx.ipn.escom.spee.action.GeneralActionSupport;
import mx.ipn.escom.spee.action.NombreObjetosSesion;
import mx.ipn.escom.spee.action.SessionManager;
import mx.ipn.escom.spee.controlacceso.mapeo.Usuario;
import mx.ipn.escom.spee.pagos.bs.PagoBs;
import mx.ipn.escom.spee.util.ResultConstants;

@Namespace("/pagos")
@Results({
		@Result(name = ActionSupport.SUCCESS, type = "redirectAction",
				params = { "actionName", "gestionar-pagos/new" }) })
public class GestionarPagosAct extends GeneralActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Usuario usuarioSel;

	@Autowired
	private PagoBs pagoBs;

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
	
	public void validateCreate() {
		pagoBs.registrarPago();
	}

	public String create() {
		addActionMessage("Pago se envió exitosamente");
		return SUCCESS;
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

	public PagoBs getPagoBs() {
		return pagoBs;
	}

	public void setPagoBs(PagoBs pagoBs) {
		this.pagoBs = pagoBs;
	}

}
