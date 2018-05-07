package mx.ipn.escom.spee.pagos.mapeo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mx.ipn.escom.spee.util.mapeo.Modelo;

@Entity
@Table(name = "tc02_catalogo_servicio")
public class CatalogoServicio implements Modelo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "", sequenceName = "")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "")
	@Column(name = "id_catalogo_servicio")
	private Integer id;

	@Column(name = "tx_clave")
	private String clave;

	@Column(name = "tx_tipo")
	private String tipo;

	@Column(name = "ds_descripcion")
	private String descripcion;

	@Column(name = "nu_precio")
	private Double precio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_area", referencedColumnName = "id_area", insertable = false, updatable = false)
	private CatalogoArea catalogoArea;

	public CatalogoServicio() {
		super();
	}

	public CatalogoServicio(Integer id, String clave, String tipo, String descripcion, Double precio) {
		super();
		this.id = id;
		this.clave = clave;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
