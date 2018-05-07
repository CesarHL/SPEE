package mx.ipn.escom.spee.pagos.action;

import java.util.List;

import org.apache.struts2.convention.annotation.AllowedMethods;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import mx.ipn.escom.spee.action.GeneralActionSupport;
import mx.ipn.escom.spee.pagos.bs.CatalogoServiciosBs;
import mx.ipn.escom.spee.pagos.mapeo.CatalogoServicio;

@Namespace("/pagos")
@AllowedMethods({ "visualizarServiciosCelex", "visualizarServiciosDentales", "visualizarServiciosFotocopiado",
		"visualizarServiciosBiblioteca" })
public class ConsultarServiciosAct extends GeneralActionSupport {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;

	@Autowired
	private CatalogoServiciosBs catalogoServiciosBs;

	private List<CatalogoServicio> listCatalogoServicios;

	public String index() {
		return INDEX;
	}

	public String visualizarServiciosCelex() {
		listCatalogoServicios = catalogoServiciosBs.obtenerServiciosTipo();
		return "visualizarServiciosCelex";
	}

	public String visualizarServiciosDentales() {
		return "visualizarServiciosDentales";
	}

	public String visualizarServiciosFotocopiado() {
		return "visualizarServiciosFotocopiado";
	}

	public String visualizarServiciosBiblioteca() {
		return "visualizarServiciosBiblioteca";
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

}
