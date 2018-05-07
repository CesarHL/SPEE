package mx.ipn.escom.spee.pagos.mapeo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mx.ipn.escom.spee.util.mapeo.Modelo;

@Entity
@Table(name = "tc01_catalogo_area")
public class ArchivoPagoDia implements Modelo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "", sequenceName = "")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "")
	@Column(name = "id_archivo_pago_dia")
	private Integer id;

	@Column(name = "tx_archivo")
	private Byte archivo;

	@Column(name = "nb_archivo")
	private String nombre;

	@Column(name = "fh_envio")
	private Date fechaEnvio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Byte getArchivo() {
		return archivo;
	}

	public void setArchivo(Byte archivo) {
		this.archivo = archivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

}
