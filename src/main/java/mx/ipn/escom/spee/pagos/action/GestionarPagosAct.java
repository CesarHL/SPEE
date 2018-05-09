package mx.ipn.escom.spee.pagos.action;

import java.util.List;

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
import mx.ipn.escom.spee.pagos.mapeo.ArchivoPagoDia;
import mx.ipn.escom.spee.pagos.mapeo.CatalogoArea.AreaEnum;
import mx.ipn.escom.spee.pagos.mapeo.EstadoPago.EstadoPagoEnum;
import mx.ipn.escom.spee.util.ResultConstants;
import mx.ipn.escom.spee.util.bs.GenericSearchBs;

@Namespace("/pagos")
@Results({ @Result(name = ActionSupport.SUCCESS, type = "redirectAction", params = { "actionName",
		"gestionar-pagos/new" }) })
public class GestionarPagosAct extends GeneralActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Usuario usuarioSel;

	@Autowired
	private PagoBs pagoBs;

	private GenericSearchBs genericSearchBs;

	private List<ArchivoPagoDia> listPagos;

	public String index() {
		getUsuarioSel();
		if (usuarioSel.getPerfilActivo()
				.getId() == mx.ipn.escom.spee.controlacceso.mapeo.Perfil.PerfilUsuarioEnum.ADMINISTRADOR_CELEX
						.getValor()) {
			ArchivoPagoDia archivoPago = new ArchivoPagoDia();
			archivoPago.setIdEstado(EstadoPagoEnum.AUTORIZADO.getIdEstatus());
			archivoPago.setIdArea(AreaEnum.CELEX.getIdEstatus());
			listPagos = genericSearchBs.findByExample(archivoPago);
			
			return ResultConstants.ADMINISTRADOR_CELEX;
		} else if (usuarioSel.getPerfilActivo()
				.getId() == mx.ipn.escom.spee.controlacceso.mapeo.Perfil.PerfilUsuarioEnum.ALUMNO.getValor()) {
			ArchivoPagoDia archivoPago = new ArchivoPagoDia();
			archivoPago.setIdUsuario(usuarioSel.getId());
			
			listPagos = genericSearchBs.findByExample(archivoPago);
			return ResultConstants.ALUMNO;
		} else {
			return NO_AUTORIZADO;
		}
	}

	public String editNew() {
		return EDITNEW;
	}

	public void validateCreate() {

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

	/**
	 * @return the genericSearchBs
	 */
	public GenericSearchBs getGenericSearchBs() {
		return genericSearchBs;
	}

	/**
	 * @param genericSearchBs
	 *            the genericSearchBs to set
	 */
	public void setGenericSearchBs(GenericSearchBs genericSearchBs) {
		this.genericSearchBs = genericSearchBs;
	}

	/**
	 * @return the listPagos
	 */
	public List<ArchivoPagoDia> getListPagos() {
		return listPagos;
	}

	/**
	 * @param listPagos
	 *            the listPagos to set
	 */
	public void setListPagos(List<ArchivoPagoDia> listPagos) {
		this.listPagos = listPagos;
	}

}
