package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogInPage extends TestBase{
	
	public static Logger logger=LogManager.getLogger(LogInPage.class.getName());
	public WebDriverWait wait=new WebDriverWait(driver, 30);
	
	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="div.ui.left.icon.input > input[placeholder='E-mail address']")
	protected WebElement txtbx_Username;
	
	@FindBy(css="div.ui.left.icon.input > input[placeholder='Password']")
	protected WebElement txtbx_Password;
	
	@FindBy(css="div.ui.fluid.large.blue.submit.button")
	protected WebElement btn_LogIn;
	
	public String getLogInPageTitle() {
		
		return driver.getTitle();
	}
	
	public DashBoardPage logIn() {
		
		wait.until(ExpectedConditions.elementToBeClickable(txtbx_Username)).clear();
		txtbx_Username.sendKeys(projectProperties.getProperty("username"));
		logger.info("Username text entered");
		
		wait.until(ExpectedConditions.elementToBeClickable(txtbx_Password)).clear();
		txtbx_Password.sendKeys(projectProperties.getProperty("password"));
		logger.info("Password text entered");
		
		btn_LogIn.click();
		logger.info("LoginPage page log in button clicked");
		
		return new DashBoardPage(driver);
	}

}
