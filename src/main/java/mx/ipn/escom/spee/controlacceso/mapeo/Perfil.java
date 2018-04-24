package mx.ipn.escom.spee.controlacceso.mapeo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mx.ipn.escom.spee.util.mapeo.Catalogo;
import mx.ipn.escom.spee.util.mapeo.Modelo;

@Entity
@Table(name = "tau01_perfil")
public class Perfil implements Modelo, Catalogo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1261786304467427786L;

	public enum PerfilUsuarioEnum {
		SECRETARIA_DE_ADMINISTRACION(1), COORDINACION_CONTROL_ESCOLAR(2), ASISTENTE_S_A(3), ASPIRANTE(4), PROFESOR(
				5), RESPONSABLE_CONTROL_ESCOLAR(6), PSICOLOGO(7), COORDINADOR_PSICOLOGO(8), CONTADOR(9), ALUMNO(10);

		private Integer valor;

		private PerfilUsuarioEnum(Integer valor) {
			this.valor = valor;
		}

		/**
		 * @return the valor
		 */
		public Integer getValor() {
			return valor;
		}

	}

	/**
	 * Identificador del perfil
	 */
	@Id
	@SequenceGenerator(name = "tau01_perfil_id_perfil_seq", sequenceName = "tau01_perfil_id_perfil_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tau01_perfil_id_perfil_seq")
	@Column(name = "id_perfil")
	private Integer id;

	/**
	 * Nombre del perfil
	 */
	@Column(name = "nb_perfil")
	private String nombre;

	/**
	 * Descripción del perfil
	 */
	@Column(name = "ds_perfil")
	private String descripcion;

	/**
	 * Siglas nombre del perfil
	 */
	@Column(name = "tx_sigla")
	private String sigla;

	/**
	 * Estado del elemento en el catálogo
	 */
	@Column(name = "st_activo")
	private Boolean activo;

	/**
	 * Constructor por defecto
	 *
	 */
	public Perfil() {
		super();
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param sigla
	 * @param activo
	 */
	public Perfil(Integer id, String nombre, String descripcion, String sigla, Boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.sigla = sigla;
		this.activo = activo;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return El campo sigla.
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla
	 *            a asignar
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	/**
	 * @return the activo
	 */
	public Boolean getActivo() {
		return activo;
	}

	/**
	 * @param activo
	 *            the activo to set
	 */
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
}