package mx.ipn.escom.spee.controlacceso.mapeo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

import mx.ipn.escom.spee.util.mapeo.Modelo;

@Entity
@Table(name = "tau02_usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Modelo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "tau02_usuario_id_usuario_seq", sequenceName = "tau02_usuario_id_usuario_seq", allocationSize = 1)
	@GeneratedValue(generator = "tau02_usuario_id_usuario_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_usuario")
	protected Integer id;

	/**
	 * Correo electrónico designado como lógin del usuario.
	 */
	@Column(name = "tx_login")
	protected String login;

	/**
	 * Contraseña de acceso para el usuario
	 */
	@Column(name = "tx_password")
	protected String password;

	/**
	 * Propiedad que permite la verificación de la contraseña de un usuario
	 */
	@Transient
	protected String confirmPassword;

	/**
	 * Perfil actual de un usuario
	 */
	@Transient
	private Perfil PerfilActivo;

	/**
	 * Constructor por defecto de un usuario
	 */
	public Usuario() {
		super();
	}

	/**
	 * Constructor de un usuario con base en un login
	 * 
	 * @param login
	 */
	public Usuario(String login) {
		super();
		this.login = login;
	}

	/**
	 * Constructor de un usuario con base en su login y su contraseña
	 * 
	 * @param login
	 * @param password
	 */
	public Usuario(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	/**
	 * 
	 * @param id
	 * @param login
	 * @param password
	 */
	public Usuario(Integer id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}

	@Validations(requiredStrings = { @RequiredStringValidator(message = "Campo Obligatorio") }, emails = {
			@EmailValidator(type = ValidatorType.FIELD, message = "%{getText('MSG27')}") }, stringLengthFields = {
					@StringLengthFieldValidator(maxLength = "50", message = "%{getText('MSG57', {getText('CO_MENOR'), '50', 'caracteres'})}", trim = true, type = ValidatorType.FIELD) })
	public String getLogin() {
		return login;
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
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	@Validations(requiredStrings = { @RequiredStringValidator(message = "Campo Obligatorio") }, stringLengthFields = {
			@StringLengthFieldValidator(maxLength = "10", message = "Debe ser menor que 10 caracteres", trim = true, type = ValidatorType.FIELD) })
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword
	 *            the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @return the perfilActivo
	 */
	public Perfil getPerfilActivo() {
		return PerfilActivo;
	}

	/**
	 * @param perfilActivo
	 *            the perfilActivo to set
	 */
	public void setPerfilActivo(Perfil perfilActivo) {
		PerfilActivo = perfilActivo;
	}

}
