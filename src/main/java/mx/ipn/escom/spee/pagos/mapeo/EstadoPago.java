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
@Table(name = "tc09_estado_archivo")
public class EstadoPago implements Modelo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum EstadoPagoEnum {

		AUTORIZADO(1, "Pago Autorizado"),

		REVISION(2, "Pago en Revision"),

		RECHAZADO(3, "Pago Rechazado");

		private Integer idEstatus;

		private String nombre;

		private EstadoPagoEnum(Integer idEstatus, String nombre) {
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
	@Column(name = "id_estado")
	private Integer id;

	@Column(name = "nb_estado")
	private String nombreEstado;

	@OneToMany(mappedBy = "estadoArchivo")
	private List<ArchivoPagoDia> listArchivosPago;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreEstado() {
		return nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	public List<ArchivoPagoDia> getListArchivosPago() {
		return listArchivosPago;
	}

	public void setListArchivosPago(List<ArchivoPagoDia> listArchivosPago) {
		this.listArchivosPago = listArchivosPago;
	}

}
