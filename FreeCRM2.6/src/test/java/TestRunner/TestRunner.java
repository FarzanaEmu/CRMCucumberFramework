package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {  "src/test/resources/Features"}  ,
			glue= { "stepDefinitions" , "MyHooks"},
					plugin = {"pretty" ,"html:target/Destinatio.html"},
				
					dryRun = false
			
		

	)	
		
		public class TestRunner {
	
		
		
		
		
	}

