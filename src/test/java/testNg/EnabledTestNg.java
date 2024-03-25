package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnabledTestNg {
	
	EdgeDriver driver;
		
		@BeforeMethod
		public void windowOpen()
		{
			 WebDriverManager.edgedriver().setup();
				
				driver = new EdgeDriver();
				
				driver.get("https://practicetestautomation.com/practice-test-login/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				
		}
			
		@Test
		public void pagelogin()
		{
			
			WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
			username.sendKeys("student");
			
			WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
			pass.sendKeys("Password123");
			
			driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
			
		}
			
			@Test(dependsOnMethods = {"pagelogin"})
			public void pageenter()
			
			{
				driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
				
				WebElement retvtext = driver.findElement(By.xpath("//strong[text()=\"Welcome to Practice Test Automation!\"]"));
				
				System.out.println(retvtext.getText());
				
			}
			
			
			@Test(dependsOnMethods = {"pagelogin"},enabled = false)
			public void testcase()
			{
				
				System.out.println("run test case");
			}
			
			
			
			
		@AfterMethod
		public void closewindow()
		{
			
			driver.quit();
		
	    }

}

