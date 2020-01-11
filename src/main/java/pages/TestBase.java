package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utils.PropertyFileReader;

public class TestBase {
	
	protected WebDriver driver;
	protected static Properties projectProperties = PropertyFileReader.readPropertyFile();


	public TestBase(WebDriver driver){
		this.driver = driver;
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,30);
		PageFactory.initElements(factory, this);
	}

}
