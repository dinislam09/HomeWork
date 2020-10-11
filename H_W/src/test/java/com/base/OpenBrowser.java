package com.base;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.log4j.logerDemo;

import FileRead.FileRead;

public class OpenBrowser {
	
static public Logger log=logerDemo.getLog(OpenBrowser.class);
	
	public static WebDriver Open() {
		log.info("Open Browser");
		Properties p=FileRead.Read("src/test/resources/properties/confic.properties");
		System.setProperty("webdriver.chrome.driver", p.getProperty("driver_path"));
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		
		
		
		
		return dr;
		
		
	}

}
