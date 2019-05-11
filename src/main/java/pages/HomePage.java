package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class HomePage extends TestBase{
	
	public static Logger logger=LogManager.getLogger(HomePage.class.getName());
	
	@FindBy(css="a.btn.btn-primary.btn-xs-2.btn-shadow.btn-rect.btn-icon.btn-icon-left > span:nth-child(2)")
	protected WebElement btn_LogIn;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public LogInPage clickLogInButton() {
		wait.until(ExpectedConditions.elementToBeClickable(btn_LogIn)).click();
		logger.info("Home page log in button clicked");
		return new LogInPage(driver);
	}

}
