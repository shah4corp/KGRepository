package com.klougin.mobile.app;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jExample {
	
	//initializing logger object for current class
	private static Logger logger = Logger.getLogger(Log4jExample.class);
	 
    public static void main(String[] args) {
		 
	  //{1}-Using BasicConfiguration - only we are using to show output on console
      //BasicConfigurator.configure();
           
    	//{2}-initialize log4j
		 PropertyConfigurator.configure(System.getProperty("user.dir") + "\\capabilities&files\\log4j.properties");
	      
		  logger.trace("This is Trace");    //trace level- minute level information
	      logger.debug("This is DEBUG");    //trace level- minute level information
		  logger.info("This is INFO");      //info level- high level information    
		  logger.warn("This is WARN");      //warn level- harmful issue  
		  logger.error("This is ERROR");    //error level-critical issue
		  logger.fatal("This is FATAL");    //fatal level-blocker issue   
	 }

}
