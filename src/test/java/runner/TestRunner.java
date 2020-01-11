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
        tags = "@All",
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
        CucumberResultsOverview resultsOverview= new CucumberResultsOverview();
        results.setOutputDirectory("target/");
        results.setOutputName("cucumber-results");
        results.setSourceFile("target/report.json");
        results.setScreenShotLocation("target/cucumber-reports/cucumber-html-reports/embeddings/");
        results.setScreenShotWidth("500px");

        resultsOverview.setOutputDirectory("target/");
        resultsOverview.setOutputName("cucumber-OverviewResults");
        resultsOverview.setSourceFile("target/report.json");
        try {
            results.execute(true);
            resultsOverview.execute();
            System.out.println("Report generated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}