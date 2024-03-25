package Pages_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;

public class Amazon_LM extends BaseClass {
	
	   public static String one  = "//input[@aria-label=\"Search Amazon.in\"]";
		
		public static String two = "//a[text()='Next']";
		
		
		
		

	public void pageclass()
	{
		
		WebElement search = driver.findElement(By.xpath(amn.one));
		search.click();
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);
	}
	
	public void nextbutton()
	{
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	
	WebElement next = driver.findElement(By.xpath(amn.two));
	JavascriptExecutor jsea = (JavascriptExecutor)driver;
	
	jsea.executeScript("arguments[0].scrollIntoView()", next);
	
	next.click();
	}

}
