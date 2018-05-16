package mx.ipn.escom.spee.pagos.action;

import java.util.List;

import org.apache.struts2.convention.annotation.AllowedMethods;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import mx.ipn.escom.spee.action.GeneralActionSupport;
import mx.ipn.escom.spee.action.NombreObjetosSesion;
import mx.ipn.escom.spee.action.SessionManager;
import mx.ipn.escom.spee.pagos.bs.CatalogoServiciosBs;
import mx.ipn.escom.spee.pagos.mapeo.CatalogoServicio;
import mx.ipn.escom.spee.util.bs.GenericSearchBs;
import mx.ipn.escom.spee.util.mapeo.AjaxResult;

@Namespace("/pagos")
@Results({
		@Result(name = "jsonTest", type = "json", params = { "root", "action", "includeProperties", "ajaxResult.*" }) })
@AllowedMethods({ "jsonTest" })
public class ConsultarServiciosAct extends GeneralActionSupport {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;

	@Autowired
	private CatalogoServiciosBs catalogoServiciosBs;

	@Autowired
	private GenericSearchBs genericSearchBs;

	private List<CatalogoServicio> listCatalogoServicios;

	private AjaxResult ajaxResult;

	public String index() {
		listCatalogoServicios = genericSearchBs.findAll(CatalogoServicio.class);
		return INDEX;
	}

	@SkipValidation
	public String jsonTest() {
		getAjaxResult();
		ajaxResult = obtenerArchivos();
		SessionManager.put(NombreObjetosSesion.AJAX_RESULT, ajaxResult);
		return "jsonTest";
	}

	public AjaxResult obtenerArchivos() {
		AjaxResult ajaxResult = new AjaxResult();
		ajaxResult.addCampo("pagos",
				 genericSearchBs.findAll(CatalogoServicio.class));

		return ajaxResult;
	}

	public CatalogoServiciosBs getCatalogoServiciosBs() {
		return catalogoServiciosBs;
	}

	public void setCatalogoServiciosBs(CatalogoServiciosBs catalogoServiciosBs) {
		this.catalogoServiciosBs = catalogoServiciosBs;
	}

	public List<CatalogoServicio> getListCatalogoServicios() {
		return listCatalogoServicios;
	}

	public void setListCatalogoServicios(List<CatalogoServicio> listCatalogoServicios) {
		this.listCatalogoServicios = listCatalogoServicios;
	}

	public GenericSearchBs getGenericSearchBs() {
		return genericSearchBs;
	}

	public void setGenericSearchBs(GenericSearchBs genericSearchBs) {
		this.genericSearchBs = genericSearchBs;
	}

	public AjaxResult getAjaxResult() {
		this.ajaxResult = (AjaxResult) SessionManager.get(NombreObjetosSesion.AJAX_RESULT);
		if (ajaxResult == null) {
			ajaxResult = new AjaxResult();
			SessionManager.put(NombreObjetosSesion.AJAX_RESULT, ajaxResult);
		}
		return ajaxResult;
	}

	/**
	 * @param ajaxResult
	 *            the ajaxResult to set
	 */
	public void setAjaxResult(AjaxResult ajaxResult) {
		this.ajaxResult = ajaxResult;
	}

}
