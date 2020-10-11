package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



	@CucumberOptions(features="src/test/java/com/features/H_W.feature",
	glue= {"com.steps"},
	tags= {"@homepage"},
	plugin = {"json:target/cucumber.json" } )
	

	public class Runner extends AbstractTestNGCucumberTests{

	




}
