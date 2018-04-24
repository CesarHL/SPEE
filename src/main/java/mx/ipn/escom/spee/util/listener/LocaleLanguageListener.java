package mx.ipn.escom.spee.util.listener;

import java.util.Locale;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class LocaleLanguageListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		Locale.setDefault(new Locale("es", "MX"));
		System.out.println("Lenguaje localizado a Español de México");
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("aplicacion web detenida");
	}

}
