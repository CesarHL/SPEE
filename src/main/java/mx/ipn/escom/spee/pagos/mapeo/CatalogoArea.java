package mx.ipn.escom.spee.pagos.mapeo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mx.ipn.escom.spee.util.mapeo.Modelo;

@Entity
@Table(name = "tc01_catalogo_area")
public class CatalogoArea implements Modelo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum AreaEnum {

		CELEX(1, "Centro de Lenguas Extrangeras"),

		DENTALES(2, "Servicios Dentales"),

		BIBLIOTECA(3, "Servicios Biblioteca"),

		FOTOCOPIADO(3, "Servicios Fotocopiado");

		private Integer idEstatus;

		private String nombre;

		private AreaEnum(Integer idEstatus, String nombre) {
			this.idEstatus = idEstatus;
			this.nombre = nombre;
		}

		public Integer getIdEstatus() {
			return idEstatus;
		}

		public String getNombre() {
			return nombre;
		}
	}

	@Id
	@SequenceGenerator(name = "", sequenceName = "")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_area_pago")
	private Integer id;
	
	@Column(name = "nb_area")
	private String nombreArea;

	@OneToMany(mappedBy = "catalogoArea")
	private List<ArchivoPagoDia> listArchivosPago;

	public CatalogoArea() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public List<ArchivoPagoDia> getListArchivosPago() {
		return listArchivosPago;
	}

	public void setListArchivosPago(List<ArchivoPagoDia> listArchivosPago) {
		this.listArchivosPago = listArchivosPago;
	}

	
	
}
