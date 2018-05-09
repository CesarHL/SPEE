package mx.ipn.escom.spee.pagos.bs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.ipn.escom.spee.action.Archivo;
import mx.ipn.escom.spee.controlacceso.mapeo.Usuario;
import mx.ipn.escom.spee.pagos.mapeo.Alumno;
import mx.ipn.escom.spee.pagos.mapeo.ArchivoPagoDia;
import mx.ipn.escom.spee.pagos.mapeo.EstadoPago.EstadoPagoEnum;
import mx.ipn.escom.spee.util.bs.GenericBs;
import mx.ipn.escom.spee.util.bs.GenericSearchBs;
import mx.ipn.escom.spee.util.mapeo.Modelo;

@Service("pagoBs")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class PagoBs extends GenericBs<Modelo> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(PagoBs.class);

	@Autowired
	private GenericSearchBs genericSearchBs;

	@Transactional
	public void registrarPago(Archivo archivo, Usuario usuario, Integer idServicio) {
		Date currentDate = new Date();
		ArchivoPagoDia archivoPago = new  ArchivoPagoDia();
		archivoPago.setIdUsuario(usuario.getId());
		archivoPago.setIdEstado(EstadoPagoEnum.REVISION.getIdEstatus());
		archivoPago.setFechaEnvio(currentDate);
		save(archivoPago);
		LOGGER.info("se ha registrado un pago");
	}

	@Transactional(rollbackFor = Exception.class)
	public void autorizarPago(Integer idSel) {
		ArchivoPagoDia archivoPagoDiaExample = new ArchivoPagoDia();
		archivoPagoDiaExample.setId(idSel);
		ArchivoPagoDia archivoPagoDia = genericSearchBs.findById(ArchivoPagoDia.class, idSel);
		archivoPagoDia.setIdEstado(EstadoPagoEnum.AUTORIZADO.getIdEstatus());
		update(archivoPagoDia);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void rechazarPago(Integer idSel) {
		ArchivoPagoDia archivoPagoDiaExample = new ArchivoPagoDia();
		archivoPagoDiaExample.setId(idSel);
		ArchivoPagoDia archivoPagoDia = genericSearchBs.findById(ArchivoPagoDia.class, idSel);
		archivoPagoDia.setIdEstado(EstadoPagoEnum.RECHAZADO.getIdEstatus());
		update(archivoPagoDia);
	}
	
	public Alumno obtenerAlumno(Integer idUsuario) {
		Alumno alumno = genericSearchBs.findById(Alumno.class, idUsuario);
		return alumno;
	}
	
	public List<ArchivoPagoDia> obtenerPagosPorAutorizar() {
		return genericSearchBs.findAll(ArchivoPagoDia.class);
	}

}
