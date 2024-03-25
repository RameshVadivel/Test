package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sel_Comusewor extends BaseClass {
	
	public void clickElement(By locator)
	{
		WebElement element = driver.findElement(locator);
		element.click();
		
	}
	
	public void entervalue(By locator,String text)
	{
		WebElement elementkey = driver.findElement(locator);
		elementkey.sendKeys(text);
		
	}
	
	
	

}
