package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sanitytest {
	
	WebDriver driver;
	@BeforeMethod
	public void testcasesanity()
	{
			   WebDriverManager.edgedriver().setup();
				
				driver = new EdgeDriver();
				
				driver.get("https://practicetestautomation.com/practice-test-login/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				
			
		}
	@Test(groups = {"sanity"})
	public void pagelogin()
	{
		
		
		 WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
		
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("student");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pass.sendKeys("Password123");
		
		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
		
	}
	@Test
	public void pagesetup()
	{
		
		WebElement contact = driver.findElement(By.xpath("//a[text()=\"Contact\"]"));
		contact.click();
		
	}
	}

