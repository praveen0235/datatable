package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver=null;
	
	public static void setup()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\PRajendra\\Downloads\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.toolsqa.com/automation-practice-table/#");
	}
	Elements obj = new Elements(driver);
}
