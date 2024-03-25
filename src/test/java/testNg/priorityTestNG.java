package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priorityTestNG {
		
		EdgeDriver driver;
		
		@BeforeMethod
		public void windowOpen()
		{
			 WebDriverManager.edgedriver().setup();
				
				driver = new EdgeDriver();
				
				driver.get("https://demo.automationtesting.in/Alerts.html");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
		}
		
		@Test(priority = 3)
		public void alertTask()
		
		{
			
	     
			
			WebElement box1 = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
			box1.click();
			
			Alert alert1 = driver.switchTo().alert();
			alert1.accept();
			
			System.out.println("789");
			
			
		}
		@Test(priority = 2)
		public void confirmalert()
		{
			
			driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
			WebElement box2 = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
			box2.click();
			
			Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			
			System.out.println("456");
		}
		
		@Test(priority = 1)
		public void promptbalert()
		{
			
			driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
			WebElement promptbox = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
			promptbox.click();
			
			Alert alertprompt = driver.switchTo().alert();
			alertprompt.sendKeys("ramesh001");
			alertprompt.accept();
			
			System.out.println("123");
			
		}
		
		
		
		
		
		
		
		
@AfterMethod
    public void closebrowser()
    
 {
	 
    	driver.close();
	 
 }
}
