package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pagebucket.PageBucket;
import pages.DashBoardPage;
import pages.HomePage;
import utils.PropertyFileReader;

import java.util.Properties;


public class CommonSteps extends PageBucket {
	
	private WebDriver driver;
	protected static Properties projectProperties=PropertyFileReader.readPropertyFile();
	private Logger logger = Logger.getLogger(CommonSteps.class);

	
	public CommonSteps() {
		driver=Hooks.driver;
	}

	@Given("User opens browser")
	public void User_opens_browser()throws Throwable {
		driver.get(projectProperties.getProperty("url"));
		logger.info("Opened URL");
	}

	@Then("user on home page")
	public void user_on_home_page() throws Throwable {
		
		homePage=new HomePage(driver);
		loginPage=homePage.clickLogInButton();
	}


	@Then("user log out")
	public void user_log_out()throws Throwable {
		Assert.assertEquals("Cogmento CRM",dashboardPage.getDashBoardPageTitle());
		Assert.assertEquals("Santosh Bothikar",dashboardPage.userTile.getText());
		loginPage=dashboardPage.logOut();
		logger.info("Logged out successfully");
		Assert.assertEquals("Cogmento CRM",loginPage.getLogInPageTitle());
	}

	@Then("user log in with valid credentials")
	public void userLogInWithValidCredentials() {
		Assert.assertEquals("Cogmento CRM",loginPage.getLogInPageTitle());
		dashboardPage=loginPage.logIn();
	}

	@Then("user log in invalid credentials")
	public void userLogInInvalidCredentials() {
		Assert.assertEquals("Cogmento CRM",loginPage.getLogInPageTitle());
		loginPage.InvalidlogIn();
		Assert.assertEquals("Something went wrong.",loginPage.getInvalidLogInValidationText());

	}
}
