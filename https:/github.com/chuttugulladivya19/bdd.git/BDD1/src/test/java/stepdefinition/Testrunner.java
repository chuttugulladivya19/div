package stepdefinition;

import org.junit.runner.RunWith;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import io.cucumber.junit.Cucumber;


	@SuppressWarnings("deprecation")
	@RunWith(Cucumber.class)
	@CucumberOptions(
	          features="src/test/resources/feature"
	          ,glue= {"slipdefinition"},
		    monochrome=true,
		    plugin= {"pretty","html:target/HtmlRepots.html","json:target/JSONReports.xml"}
		   )
	public class Testrunner extends AbstractTestNGCucumberTests {
	}





