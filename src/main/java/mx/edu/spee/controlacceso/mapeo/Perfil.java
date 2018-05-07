package mx.edu.spee.controlacceso.mapeo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mx.ipn.escom.spee.util.mapeo.Catalogo;

@Entity
@Table(name = "tau01_perfil")
public class Perfil implements Catalogo {
	public enum perfilEnum {
		SUBDIRECTOR(1, "Subdirector"),

		ADMINISTRADOR_CELEX(2, "Coordinacion de control escolar"),

		ADMINISTRADOR_DENTALES(3, "Asistente para la secretaria de administración"),

		ADMINISTRADOR_BIBLIOTECA(4, "Aspirante"),

		ADMINISTRADOR_FOTOCOPIADO(5, "Aspirante"),

		ENCARGADO_CAJA(6, "Aspirante"),

		CONTADOR(7, "Aspirante"),

		ALUMNO(8, "Aspirante"),

		TRABAJADOR(9, "Aspirante"),

		EXTERNO(10, "Aspirante");

		private Integer perfil;
		private String nombre;

		private perfilEnum(Integer perfil, String nombre) {
			this.perfil = perfil;
			this.nombre = nombre;
		}

		public Integer getPerfil() {
			return perfil;
		}

		public String getNombre() {
			return nombre;
		}

	}

	@Id
	@SequenceGenerator(name = "", sequenceName = "")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "")
	@Column(name = "id_perfil")
	private Integer id;

	/**
	 * Nombre del elemento del catálogo
	 */
	@Column(name = "nb_perfil")
	private Integer nombre;

	/**
	 * Descripción del elemento del catálogo
	 */
	@Column(name = "ds_perfil")
	private String descripcion;

	/**
	 * Estado del elemento del catálogo
	 */
	@Column(name = "st_activo")
	private Boolean activo;

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
	public Integer getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(Integer nombre) {
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
