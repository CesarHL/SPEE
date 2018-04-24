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

/**
 * Las personas registradas catalogadas como Usuarios son aquellas personas que
 * podrán ingresar al sistema mediante un mecanismo de autenticación basado en
 * usuario y contraseña.
 * 
 * @author CDT-ESCOM
 *
 */

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
	 * Información de acceso del usuario
	 */
	@OneToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
	private Acceso acceso;

	/**
	 * Contiene las cuentas asociadas al usuario
	 */
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
	private List<Cuenta> cuentas;

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

	/**
	 * @return the login @TODO Verificar cómo trabajar con validación de Login
	 *         para cuando se quiera hacer un update de las clases a las que
	 *         hereda.
	 */
	@Validations(requiredStrings = { @RequiredStringValidator(message = "${getText('MSG26')}") }, emails = {
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
	 * @return the acceso
	 */
	public Acceso getAcceso() {
		return acceso;
	}

	/**
	 * @param acceso
	 *            the acceso to set
	 */
	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
	}

	/**
	 * @return el atributo cuentas
	 */
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	/**
	 * @param cuentas
	 *            Es el atributo cuentas a asignar
	 */
	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
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
