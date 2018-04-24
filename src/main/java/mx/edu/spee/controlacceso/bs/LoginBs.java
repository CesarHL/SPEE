package mx.edu.spee.controlacceso.bs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.spee.controlacceso.exception.UserNotFoundException;
import mx.ipn.escom.spee.action.NombreObjetosSesion;
import mx.ipn.escom.spee.action.SessionManager;
import mx.ipn.escom.spee.controlacceso.mapeo.Cuenta;
import mx.ipn.escom.spee.controlacceso.mapeo.Perfil;
import mx.ipn.escom.spee.controlacceso.mapeo.Usuario;
import mx.ipn.escom.spee.util.bs.GenericBs;

@Service("loginBs")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class LoginBs {

	/**
	 * Log de la clase
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(GenericBs.class);

	/*
	 * Lista de perfiles que contendra los elementos del catalogo tau01_perfil
	 */
	private List<Perfil> listaPerfiles;

	/*
	 * Lista de Usuarios que contendra los elementos del catalogo tau02_usuario
	 */
	private List<Usuario> listaUsuarios;

	/*
	 * Lista de Cuenta que contendra los elementos de catalogo tau03_cuenta
	 */
	private List<Cuenta> listaCuentas;

	/**
	 * LLena en codigo duro los periles que se encuentran en el catalogo de la
	 * tabla tau01_perfil
	 * 
	 * @return
	 */
	public List<Perfil> llenarPerfiles() {
		List<Perfil> listaPerfiles = new ArrayList<>();
		listaPerfiles
				.add(new Perfil(1, "Secretaria de adminisitración", "Secretaria de adminisitración", "S.A.", true));
		listaPerfiles.add(
				new Perfil(2, "Coordinación de control escolar", "Coordinación de control escolar", "C.C.E.", true));
		listaPerfiles.add(new Perfil(3, "Asistente para la secretaria de administración",
				"Asistente para la secretaria de administración", "A.S.A.", true));
		listaPerfiles.add(new Perfil(4, "Aspirante", "Aspirante", "AS", true));
		listaPerfiles.add(new Perfil(5, "Profesor", "Profesor", "PR", true));
		listaPerfiles
				.add(new Perfil(6, "Responsable de control escolar", "Responsable de control escolar", "R.C.E.", true));
		listaPerfiles.add(new Perfil(7, "Psicólogo", "Psicólogo", "PS", true));
		listaPerfiles.add(new Perfil(8, "Coordinador de psicólogos", "Coordinador de psicólogos", "C.P.", true));
		listaPerfiles.add(new Perfil(9, "Contador", "Contador", "C.", true));
		return listaPerfiles;
	}

	/**
	 * LLena en codigo duro los perfiles que se encuentran en el catalogo de la
	 * tabla tau02_usuario
	 * 
	 * @return
	 */
	public List<Usuario> llenarUsuarios() {
		List<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(new Usuario(1, "secretaria_administracion@eld.ipn.mx", "Passw0rd!"));
		listaUsuarios.add(new Usuario(2, "coordinacion_control_escolar@eld.ipn.mx", "Passw0rd!"));
		listaUsuarios.add(new Usuario(3, "asistente_secretaria_administracion@eld.ipn.mx", "Passw0rd!"));
		listaUsuarios.add(new Usuario(4, "aspirante@eld.ipn.mx", "Passw0rd!"));
		listaUsuarios.add(new Usuario(5, "profesor@eld.ipn.mx", "Passw0rd!"));
		listaUsuarios.add(new Usuario(6, "responsable_control_escolar@eld.ipn.mx", "Passw0rd!"));
		listaUsuarios.add(new Usuario(7, "psicologo@eld.ipn.mx", "Passw0rd!"));
		listaUsuarios.add(new Usuario(8, "coordinador_psicologos@eld.ipn.mx", "Passw0rd!"));
		listaUsuarios.add(new Usuario(9, "contador@eld.ipn.mx", "Passw0rd!"));
		return listaUsuarios;
	}

	/**
	 * Llena en codigo duro las cuentas que se encuentran en el catalogo de la
	 * tabla tau03_cuenta
	 * 
	 * @return
	 */
	public List<Cuenta> llenarCuentas() {
		List<Cuenta> listaCuentas = new ArrayList<>();
		listaCuentas.add(new Cuenta(1, 1, 1, new Date(), new Date()));
		listaCuentas.add(new Cuenta(9, 9, 1, new Date(), new Date()));
		return listaCuentas;
	}

	/**
	 * Brinda acceso a un usuario con base en su usuario. El login da como
	 * entrada el correo registrado a cierto tipo de usuario, este metodo pone
	 * en session el usuario dado, junto con el prefil correspondiente
	 * 
	 * @param login
	 * @param password
	 * @throws UserNotFoundException
	 */
	@Transactional
	public void ingresar(String login, String password) throws UserNotFoundException {
		setListaUsuarios(llenarUsuarios());
		setListaPerfiles(llenarPerfiles());
		boolean usuarioExistente = false;
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getLogin().equals(login)) {
				usuario.setPerfilActivo(listaPerfiles.get(usuario.getId() - 1));
				SessionManager.set(NombreObjetosSesion.USUARIO_SESION, usuario);
				usuarioExistente = true;
			}
		}
		
		if (!usuarioExistente) {
			LOGGER.trace("Usuario no encontrado");
			SessionManager.clear();
			throw new UserNotFoundException();
		}
	}

	/**
	 * @return the listaPerfiles
	 */
	public List<Perfil> getListaPerfiles() {
		return listaPerfiles;
	}

	/**
	 * @param listaPerfiles
	 *            the listaPerfiles to set
	 */
	public void setListaPerfiles(List<Perfil> listaPerfiles) {
		this.listaPerfiles = listaPerfiles;
	}

	/**
	 * @return the listaUsuarios
	 */
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	/**
	 * @param listaUsuarios
	 *            the listaUsuarios to set
	 */
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	/**
	 * @return the listaCuentas
	 */
	public List<Cuenta> getListaCuentas() {
		return listaCuentas;
	}

	/**
	 * @param listaCuentas
	 *            the listaCuentas to set
	 */
	public void setListaCuentas(List<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

}
