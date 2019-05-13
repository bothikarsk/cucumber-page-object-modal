package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", 
		glue = {"stepdef"}, 
		plugin = {"pretty",
				"html:target/cucumber-reports",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml"
		}, 
		monochrome = true,
		strict=true,
		dryRun=false
		)
public class TestRunner {

}
