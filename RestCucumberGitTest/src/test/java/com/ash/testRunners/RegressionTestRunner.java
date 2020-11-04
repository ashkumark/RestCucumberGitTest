package com.ash.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true, 
		features = "classpath:features", 
		glue = { "com.ash.stepsDefinition" }, 
	    plugin = {"html:target/cucumber-pretty-report/regression-tests" }, 
        tags = { "@Regression" }
)
public class RegressionTestRunner {

}
