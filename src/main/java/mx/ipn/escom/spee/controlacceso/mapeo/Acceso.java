package mx.ipn.escom.spee.controlacceso.mapeo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import mx.ipn.escom.spee.util.Numeros;
import mx.ipn.escom.spee.util.mapeo.Modelo;

/**
 * Contiene la información de acceso de un {@link Usuario} con base en la cual
 * se determina si la cuenta está bloqueada por intentos fallidos.
 * 
 * @author hermes
 *
 */
@Entity
@Table(name = "tau04_acceso")
public class Acceso implements Modelo {
	/**
	 * Identificador del {@Link Usuario}
	 */
	@Id
	@Column(name = "id_usuario")
	private Integer idUsuario;

	/**
	 * Número de intentos fallidos consecutivos del usuario
	 */
	@Column(name = "nu_intento")
	private Integer numeroIntentos;

	/**
	 * Fecha y hora del último intento fallido
	 */
	@Column(name = "fh_intento")
	private Date ultimoIntento;

	/**
	 * Fecha de bloqueo
	 */
	@Column(name = "fh_bloqueo")
	private Date fechaBloqueo;

	/**
	 * 
	 */
	public Acceso() {
		super();
	}

	/**
	 * 
	 * @param idUsuario
	 * @param numeroIntentos
	 * @param ultimoIntento
	 * @param fechaBloqueo
	 */
	public Acceso(Integer idUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.numeroIntentos = Numeros.CERO.getValorInteger();
		this.ultimoIntento = null;
		this.fechaBloqueo = null;
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
	 * @return the numeroIntentos
	 */
	public Integer getNumeroIntentos() {
		return numeroIntentos;
	}

	/**
	 * @param numeroIntentos
	 *            the numeroIntentos to set
	 */
	public void setNumeroIntentos(Integer numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}

	/**
	 * @return the ultimoIntento
	 */
	public Date getUltimoIntento() {
		return ultimoIntento;
	}

	/**
	 * @param ultimoIntento
	 *            the ultimoIntento to set
	 */
	public void setUltimoIntento(Date ultimoIntento) {
		this.ultimoIntento = ultimoIntento;
	}

	/**
	 * @return the fechaBloqueo
	 */
	public Date getFechaBloqueo() {
		return fechaBloqueo;
	}

	/**
	 * @param fechaBloqueo
	 *            the fechaBloqueo to set
	 */
	public void setFechaBloqueo(Date fechaBloqueo) {
		this.fechaBloqueo = fechaBloqueo;
	}

	public void reset() {
		this.fechaBloqueo = null;
		this.ultimoIntento = null;
		this.numeroIntentos = 0;
	}
}
