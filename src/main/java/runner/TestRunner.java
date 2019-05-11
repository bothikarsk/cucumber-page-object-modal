package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features", 
glue = { "stepdef" }, 
plugin = {"junit:target/cucumber-reports/test-report.xml", 
		  "json:target/cucumber-reports/test-report.json",
		//"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" \
		"pretty", "html:target/cucumber-reports"
}, 
monochrome = true,
strict=true,
dryRun=false
		)
public class TestRunner {

}
