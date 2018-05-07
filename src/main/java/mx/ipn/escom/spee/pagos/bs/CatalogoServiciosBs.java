package mx.ipn.escom.spee.pagos.bs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import mx.ipn.escom.spee.pagos.mapeo.CatalogoArea.AreaEnum;
import mx.ipn.escom.spee.pagos.mapeo.CatalogoServicio;
import mx.ipn.escom.spee.util.bs.GenericSearchBs;

@Service("catalogoServiciosBs")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class CatalogoServiciosBs {

	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogoServiciosBs.class);

	@Autowired
	private GenericSearchBs genericSearchBs;

	public List<CatalogoServicio> obtenerServiciosTipo() {
		CatalogoServicio catalogoServicioExample = new CatalogoServicio();
		LOGGER.info("Se ha creado una lista de servicios celex");
		return genericSearchBs.findByExample(catalogoServicioExample);
	}

	public GenericSearchBs getGenericSearchBs() {
		return genericSearchBs;
	}

	public void setGenericSearchBs(GenericSearchBs genericSearchBs) {
		this.genericSearchBs = genericSearchBs;
	}

}
