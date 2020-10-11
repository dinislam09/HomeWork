package com.utilities;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.log4j.logerDemo;

public class utility {
	
	
	
	
	WebDriver dr;
	public utility(WebDriver dr) {
		this.dr=dr;
	}
	
	static public Logger log=logerDemo.getLog(utility.class);
	
	public static void verify(String expected,String actual) {
		log.info("Varify Title");
		if(expected.equals(actual)) {
			System.out.println("Pass");
		
		}else {
			System.out.println("Fail");
			System.out.println("The expected: "+expected);
			System.out.println("The actual: "+actual);
			Assert.assertEquals(expected, actual);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
