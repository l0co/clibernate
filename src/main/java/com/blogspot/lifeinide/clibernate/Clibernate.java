package com.blogspot.lifeinide.clibernate;

import com.blogspot.lifeinide.clibernate.services.ICliService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main command line interface class.
 *
 * @author l0co@wp.pl
 */
public class Clibernate {

	public static Logger logger = LoggerFactory.getLogger(Clibernate.class);

	public static void main(String [] args) {
		logger.debug("Starting Spring application context");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// TODOLF remove
		ICliService cliService = ctx.getBean("testCliService", ICliService.class);
		cliService.main(args);
	}

}
