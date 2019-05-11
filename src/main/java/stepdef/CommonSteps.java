package stepdef;



import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LogInPage;
import utils.PropertyFileReader;


public class CommonSteps {
	HomePage homePage;
	LogInPage loginPage;
	DashBoardPage dashboardPage;
	public WebDriver driver;
	protected static Properties projectProperties=PropertyFileReader.readPropertyFile();
	public static Logger logger=LogManager.getLogger(DashBoardPage.class.getName());
	
	public  CommonSteps() {
		// TODO Auto-generated constructor stub
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

	@Then("user log in")
	public void user_log_in() throws Throwable{
	
		Assert.assertEquals("CRM",loginPage.getLogInPageTitle());
		dashboardPage=loginPage.logIn();
	}

	@Then("user log out")
	public void user_log_out()throws Throwable {
		Assert.assertEquals("CRM",dashboardPage.getDashBoardPageTitle());
		Assert.assertEquals("Santosh Bothikar",dashboardPage.userTile.getText());
		loginPage=dashboardPage.logOut();
		logger.info("Logged out successfully");
		Assert.assertEquals("CRM",loginPage.getLogInPageTitle());

	}

}
