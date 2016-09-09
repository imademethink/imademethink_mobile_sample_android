package com.imademethink_androidAppAutomation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features 		= {"src/feature/App_SimplestReminder.feature"},
		//features 		= {"src/test/resource/TktTravel_redBus.feature"},
		
		tags 			= { 
				            // "@redBus",
				            "@simplest_reminder"
						  },

		dryRun 			= false,
		strict 			= false,
		monochrome 		= true,
		
		format 			= {"pretty", "json:target/json/testreport.json", 
                                     "html:target/html/index.html",
                                    "junit:target/junit/testreport.xml"},

		glue 			= "com.imademethink_androidAppAutomation"
	)
public class JUnitPagefactoryRunnerTest {

}
