package dailyworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSites {
	
	public static void main (String args[]) throws InterruptedException
	{
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement one = driver.findElement(By.xpath("//li[@class=\"btn btn-light active\"]"));
		one.click();
		
		WebElement name = driver.findElement(By.id("userName"));
		name.sendKeys("Ramesh Vadivel");
		
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("rameshvrs0111@gmail.com");
	
		WebElement addr = driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
		
	    addr.sendKeys("123456789");
			
	WebElement pmtaddr = driver.findElement(By.id("permanentAddress"));
	
	pmtaddr.sendKeys("**************************");
	
  WebElement button= driver.findElement(By.xpath("//button[text()='Submit']"));
  button.sendKeys(Keys.TAB);
  button.sendKeys(Keys.ENTER);
  System.out.println("complted");
   
	
	}

}
