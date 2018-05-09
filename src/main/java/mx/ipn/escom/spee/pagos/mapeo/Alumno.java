package mx.ipn.escom.spee.pagos.mapeo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mx.ipn.escom.spee.controlacceso.mapeo.Usuario;
import mx.ipn.escom.spee.util.Constantes;
import mx.ipn.escom.spee.util.mapeo.Modelo;

@Entity
@Table(name = "ttu01_alumno")
public class Alumno implements Modelo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "", sequenceName = "")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
	private Integer id;

	@Column(name = "tx_curp")
	private String curp;

	@Column(name = "tx_boleta")
	private String boleta;

	@Column(name = "tx_nombre")
	private String nombre;

	@Column(name = "tx_primer_apellido")
	private String primerApellido;

	@Column(name = "tx_segundo_apellido")
	private String segundoApellido;

	@Column(name = "tx_celular")
	private String celular;

	@Column(name = "id_usuario")
	private Integer id_usuario;

	public Alumno() {
		super();
	}

	public Alumno(Integer id, String curp, String boleta, String nombre, String primerApellido, String segundoApellido,
			String celular, Integer id_usuario, Usuario usuario) {
		super();
		this.id = id;
		this.curp = curp;
		this.boleta = boleta;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.celular = celular;
		this.id_usuario = id_usuario;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getBoleta() {
		return boleta;
	}

	public void setBoleta(String boleta) {
		this.boleta = boleta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}


	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(nombre).append(Constantes.ESPACIO);
		buffer.append(primerApellido).append(Constantes.ESPACIO);
		if (segundoApellido != null && !segundoApellido.isEmpty()) {
			buffer.append(segundoApellido);
		}
		return buffer.toString();
	}

}
