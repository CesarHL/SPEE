package mx.edu.spee.controlacceso.mapeo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CuentaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Identificador del {@link Usuario} al que pertenece la {@link Cuenta}
	 */
	@Column(name = "id_usuario", nullable = false)
	private Integer idUsuario;

	/**
	 * Identificador del {@link Perfil} al que pertenece la {@link Cuenta}
	 */
	@Column(name = "id_perfil", nullable = false)
	private Integer idPerfil;

	/**
	 * Identificador del {@link Cuenta}
	 */
	@Column(name = "id_cuenta", nullable = false)
	private Integer idCuenta;

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
}
