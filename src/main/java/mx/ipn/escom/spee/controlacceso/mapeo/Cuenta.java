package mx.ipn.escom.spee.controlacceso.mapeo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

import mx.ipn.escom.spee.util.mapeo.Modelo;

/**
 * La Cuenta es la entidad que permite determinar si se debe permitir el accesso
 * a un usuario registrado, ya que contiene los periodos de vigencia de los
 * perfiles activos para el usuario.
 * 
 * @author hermes
 *
 */

@Entity
@Table(name = "tau03_cuenta")
public class Cuenta implements Modelo, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2576005497905201698L;

	@EmbeddedId
	private CuentaId id;
	/**
	 * Identificador del {@link Usuario} de la cuenta
	 */
	@Column(name = "id_usuario", insertable = false, updatable = false)
	private Integer idUsuario;

	/**
	 * Identificador del {@link Perfil} de la cuenta
	 */
	@Column(name = "id_perfil", insertable = false, updatable = false)
	private Integer idPerfil;

	/**
	 * Identificador de la cuenta
	 */
	@Column(name = "id_cuenta", insertable = false, updatable = false)
	private Integer idCuenta;

	/**
	 * Fecha de inicio del periodo de vigencia de la cuenta
	 */
	@Column(name = "fh_inicio")
	private Date inicio;

	/**
	 * Fecha de fin del periodo de vigencia de la cuenta
	 */
	@Column(name = "fh_fin")
	private Date fin;

	/**
	 * Perfil asociado a la cuenta
	 */
	@ManyToOne
	@JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil", insertable = false, updatable = false)
	private Perfil perfil;

	/**
	 * Cosntructor por defecto
	 */
	public Cuenta() {
		super();
	}

	/**
	 * Constructor para agregar a una cuenta en el momento en el que se registra
	 * un usuario. Este usuario
	 * 
	 * @param id
	 * @param inicio
	 */
	public Cuenta(CuentaId id, Date inicio) {
		super();
		this.id = id;
		this.inicio = inicio;
	}

	/**
	 * 
	 * @param idUsuario
	 * @param idPerfil
	 * @param idCuenta
	 * @param inicio
	 * @param fin
	 */
	public Cuenta(Integer idUsuario, Integer idPerfil, Integer idCuenta, Date inicio, Date fin) {
		super();
		this.idUsuario = idUsuario;
		this.idPerfil = idPerfil;
		this.idCuenta = idCuenta;
		this.inicio = inicio;
		this.fin = fin;
	}

	/**
	 * @return the id
	 */
	public CuentaId getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(CuentaId id) {
		this.id = id;
	}

	/**
	 * @return the idUsuario
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario
	 *            the idUsuario to set
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the idPerfil
	 */
	public Integer getIdPerfil() {
		return idPerfil;
	}

	/**
	 * @param idPerfil
	 *            the idPerfil to set
	 */
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	/**
	 * @return the idCuenta
	 */
	public Integer getIdCuenta() {
		return idCuenta;
	}

	/**
	 * @param idCuenta
	 *            the idCuenta to set
	 */
	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	/**
	 * @return the inicio
	 */
	@Validations(requiredFields = { @RequiredFieldValidator(message = "${getText('MSG26')}") })
	public Date getInicio() {
		return inicio;
	}

	/**
	 * @param inicio
	 *            the inicio to set
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	/**
	 * @return the fin
	 */
	@Validations(requiredFields = { @RequiredFieldValidator(message = "${getText('MSG26')}") })
	public Date getFin() {
		return fin;
	}

	/**
	 * @param fin
	 *            the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}

	/**
	 * @return the perfil
	 */
	public Perfil getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil
	 *            the perfil to set
	 */
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}
