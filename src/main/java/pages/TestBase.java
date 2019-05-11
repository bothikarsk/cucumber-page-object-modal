package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.PropertyFileReader;

public class TestBase {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected static Properties projectProperties = PropertyFileReader.readPropertyFile();


	public TestBase(WebDriver driver){
		this.driver = driver;
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,60);
		PageFactory.initElements(factory, this);
		wait = new WebDriverWait(driver, 30);
	}

}
