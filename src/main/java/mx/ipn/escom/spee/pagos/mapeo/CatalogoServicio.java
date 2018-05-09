package mx.ipn.escom.spee.pagos.mapeo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mx.ipn.escom.spee.util.mapeo.Modelo;

@Entity
@Table(name = "tc02_catalogo_servicios")
public class CatalogoServicio implements Modelo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "", sequenceName = "")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_catalogo")
	private Integer id;

	@Column(name = "nu_clave")
	private String clave;

	@Column(name = "ds_tipo")
	private String tipo;

	@Column(name = "nu_monto")
	private Double monto;

	@Column(name = "nb_servicio")
	private String servicio;

	@Column(name = "nu_area")
	private Integer idArea;

	public CatalogoServicio() {
		super();
	}

	public CatalogoServicio(Integer id, String clave, String tipo, Double monto, String servicio, Integer area) {
		super();
		this.id = id;
		this.clave = clave;
		this.tipo = tipo;
		this.monto = monto;
		this.servicio = servicio;
		this.idArea = area;
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

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

}
