package stepdef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.PropertyFileReader;
import utils.TestUtils;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;
    protected static String browserName;
    protected static Properties projectProperties = PropertyFileReader.readPropertyFile();

    @Before
    public void startUp() {

        browserName = projectProperties.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/main/java/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.geco.driver", System.getProperty("user.dir") + "/src/main/java/drivers/gecodriver.exe");
            driver = new FirefoxDriver();

        } else {
            System.out.println("Default browser");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtils.WAIT_FOR_ELEMENT, TimeUnit.SECONDS);

    }

    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");

            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        driver.quit();

    }


}
