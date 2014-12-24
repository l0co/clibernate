package com.blogspot.lifeinide.clibernate;

import com.blogspot.lifeinide.clibernate.services.ICliService;
import org.apache.commons.cli.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main command line interface class.
 *
 * @author l0co@wp.pl
 */
public class Clibernate {

	public static final String APPLICATION_CONTEXT_XML = "applicationContext.xml";

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML);

		Options options = new Options();
		options.addOption("s", "service", true, "select service");

		CommandLineParser parser = new PosixParser();
		CommandLine cmd = parser.parse(options, args);

		if (cmd.hasOption("s")) {

		} else {
			HelpFormatter helpFormatter = new HelpFormatter();
			helpFormatter.printHelp("clibernate", options);

			System.out.println("\navailable services:");
			for (String beanName: ctx.getBeansOfType(ICliService.class).keySet()) {
				System.out.println(" "+beanName);
			}
		}
	}

}
