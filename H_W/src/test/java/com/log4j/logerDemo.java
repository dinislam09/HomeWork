package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logerDemo {
	
	
	public static Logger getLog(Class c) {
		Logger log=Logger.getLogger(c);
		PropertyConfigurator.configure("src/test/java/com/log4j/log4j.properties");
		
		return log;
		
	}

}
