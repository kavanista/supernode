package com.bitsofproof.supernode.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Supernode {
    private static final Logger log = LoggerFactory.getLogger(Supernode.class);


	public static void main(String[] args) {
		try {
			log.info("Authorisation");
			Setup.setup();
			log.info("Spring context setup");
			ApplicationContext context = 
		            new ClassPathXmlApplicationContext("app-context.xml");
			Application application = context.getBean (Application.class);
			application.start (context);
		} catch (Exception e) {
			log.error("Application", e);
		}
	}

}