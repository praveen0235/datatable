package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements{
	
	public static WebDriver driver=null;
	
	@FindBy(xpath= ".//*[@class = 'tsc_table_s13']/tbody/tr[1]/td[1]")
	public static WebElement table;
	
	public Elements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
