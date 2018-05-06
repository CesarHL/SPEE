package mx.edu.spee.pagos.action;

import org.apache.struts2.convention.annotation.AllowedMethods;
import org.apache.struts2.convention.annotation.Namespace;

import mx.ipn.escom.spee.action.GeneralActionSupport;

@Namespace("/pagos")
@AllowedMethods({ "visualizarServiciosCelex", "visualizarServiciosDentales", "visualizarServiciosFotocopiado",
		"visualizarServiciosBiblioteca" })
public class ConsultarServiciosAct extends GeneralActionSupport {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;

	public String index() {
		return INDEX;
	}

	public String visualizarServiciosCelex() {
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
}
