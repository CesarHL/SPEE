package mx.ipn.escom.spee.pagos.mapeo;

import java.io.Serializable;
import java.util.Date;

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

import mx.ipn.escom.spee.controlacceso.mapeo.Usuario;
import mx.ipn.escom.spee.util.mapeo.Modelo;

@Entity
@Table(name = "ttp03_archivo_pago")
public class ArchivoPagoDia implements Modelo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "", sequenceName = "")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_archivo_pago")
	private Integer id;

	@Column(name = "id_usuario")
	private Integer idUsuario;

	@Column(name = "id_estado")
	private Integer idEstado;

	@Column(name = "id_servicio_area")
	private Integer idArea;

	@Column(name = "id_catalogo_servicios")
	private Integer idCatalogoServicios;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado", referencedColumnName = "id_estado", insertable = false, updatable = false)
	private EstadoPago estadoArchivo;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_area", referencedColumnName = "id_area_pago", insertable = false, updatable = false)
	private CatalogoArea catalogoArea;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_catalogo_servicios", referencedColumnName = "id_catalogo", insertable = false, updatable = false)
	private CatalogoServicio catalogoServicio;

	@Column(name = "nb_archivo")
	private String nombreArchivo;

	@Column(name = "fh_envio")
	private Date fechaEnvio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public EstadoPago getEstadoArchivo() {
		return estadoArchivo;
	}

	public void setEstadoArchivo(EstadoPago estadoArchivo) {
		this.estadoArchivo = estadoArchivo;
	}

	public CatalogoArea getCatalogoArea() {
		return catalogoArea;
	}

	public void setCatalogoArea(CatalogoArea catalogoArea) {
		this.catalogoArea = catalogoArea;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public CatalogoServicio getCatalogoServicio() {
		return catalogoServicio;
	}

	public void setCatalogoServicio(CatalogoServicio catalogoServicio) {
		this.catalogoServicio = catalogoServicio;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public Integer getIdCatalogoServicios() {
		return idCatalogoServicios;
	}

	public void setIdCatalogoServicios(Integer idCatalogoServicios) {
		this.idCatalogoServicios = idCatalogoServicios;
	}

}
