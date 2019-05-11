package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DashBoardPage extends TestBase{
	
	public static Logger logger=LogManager.getLogger(DashBoardPage.class.getName());
	public WebDriverWait wait=new WebDriverWait(driver, 30);
	
	public DashBoardPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#top-header-menu > div.right.menu > span.user-display")
	public WebElement userTile;
	
	@FindBy(css="#top-header-menu > div.right.menu > div.ui.buttons > div > i")
	protected WebElement btn_SettingIcon;
	
	@FindBy(css="div.menu.transition.visible > a:nth-child(4)")
	protected WebElement btn_LogOut;
	
	public String getDashBoardPageTitle() {
		return driver.getTitle();
	}
	
	public LogInPage logOut() {
		wait.until(ExpectedConditions.elementToBeClickable(btn_SettingIcon)).click();
		logger.info("Setting icon button clicked");
		wait.until(ExpectedConditions.elementToBeClickable(btn_LogOut)).click();
		logger.info("Log out button clicked");
		return new LogInPage(driver);
	}
}
