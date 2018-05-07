package mx.ipn.escom.spee.pagos.bs;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import mx.ipn.escom.spee.util.bs.GenericSearchBs;

@Service("pagoBs")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class PagoBs implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(PagoBs.class);

	@Autowired
	private GenericSearchBs genericSearchBs;
	
	public void registrarPago() {
		LOGGER.info("se ha registrado un pago");
	}

	public GenericSearchBs getGenericSearchBs() {
		return genericSearchBs;
	}

	public void setGenericSearchBs(GenericSearchBs genericSearchBs) {
		this.genericSearchBs = genericSearchBs;
	}

}
