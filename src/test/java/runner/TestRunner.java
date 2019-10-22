package runner;

import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"stepdef"},
        plugin = {"pretty",
                /*"html:target/html-report",*/
                "json:target/report.json",
                "junit:target/report.xml"
        },
        monochrome = true,
        strict = true,
        dryRun = false
)
public class TestRunner {

    @AfterClass
    public static void afterClass() {
        CucumberDetailedResults results = new CucumberDetailedResults();
        results.setOutputDirectory("target/");
        results.setOutputName("cucumber-results");
        results.setSourceFile("target/report.json");
        try {
            results.execute(true, true);
            System.out.println("Report generated");
        } catch (Exception e) {
            e.printStackTrace();
        }

        CucumberResultsOverview resultsOverviewe =new CucumberResultsOverview();
        resultsOverviewe.setOutputDirectory("target/");
        resultsOverviewe.setOutputName("result-overview");
        resultsOverviewe.setSourceFile("target/report.json");
        try {
            resultsOverviewe.execute(true,true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}