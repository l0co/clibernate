package com.blogspot.lifeinide.clibernate;

import com.blogspot.lifeinide.clibernate.services.ICliService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main command line interface class.
 *
 * @author l0co@wp.pl
 */
public class Clibernate {

	public static void main(String [] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// TODOLF remove
		ICliService cliService = ctx.getBean("testCliService", ICliService.class);
		cliService.main(args);
	}

}
