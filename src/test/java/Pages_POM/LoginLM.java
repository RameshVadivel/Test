package Pages_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;

public class LoginLM extends BaseClass {
	
	
		
   public static String Email = "//input[@placeholder=\"E mail\"]";
   
   public static String Pass = "//input[@placeholder=\"Password\"]";
   
   public static String Enter = "//img[@alt=\"Logo missing\"]";
   
   
   public void Email()
   {
	   WebElement email = driver.findElement(By.xpath(log.Email));
	   email.sendKeys("ramesh");
   }
   
   public void password()
   {
	   
	   WebElement pass = driver.findElement(By.xpath(log.Pass));
	   pass.click();
		pass.sendKeys("123456");
   }
public void enter()
{
	
	WebElement enter = driver.findElement(By.xpath(log.Enter));
	enter.click();
	
}


		
		
	}
	
	


