package com.klougin.mobile.app;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jExample {
	final static Logger log = Logger.getLogger(Log4jExample.class);
	 
	 public static void main(String[] args) {
	  
	  //PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "log4j.properties");
		 PropertyConfigurator.configure("C:\\Users\\shahnawazm\\workspace\\MobileTest\\capabilities\\log4j.properties");   
	  log.debug("This is DEBUG");
	  log.info("This is INFO");
	  log.warn("This is WARN");
	  log.error("This is ERROR");
	  log.fatal("This is FATAL");
	 }

}
