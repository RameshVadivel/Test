package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNgAnnotation {
	
	EdgeDriver driver;
	
	
	
	
	@BeforeClass
	public void beforeClass()
	
	{
		System.out.println("123456789");
		
	}
	
	@BeforeMethod
	public void windowOpen()
	{
		 WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}
	
	
	
	@Test
	public void alertTask()
	{
		
     
		
		WebElement box1 = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		box1.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		
		
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		WebElement box2 = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		box2.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		WebElement promptbox = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		promptbox.click();
		
		Alert alertprompt = driver.switchTo().alert();
		alertprompt.sendKeys("ramesh");
		alertprompt.accept();
		
	}
		@Test
     public void formFill()
     {
		
		driver.findElement(By.xpath("//a[@href=\"Register.html\"]")).click();
			
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
						
		firstname.sendKeys("Ramesh");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		
		lastname.sendKeys("Vadivel");
		
		WebElement adress = driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		
		adress.sendKeys("*********************");
		
		WebElement mail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		
		mail.sendKeys("rameshvrs0111@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		
		phone.sendKeys("7358927998");
		
		WebElement male = driver.findElement(By.name("radiooptions"));
		
		male.click();
		
		WebElement cricket = driver.findElement(By.xpath("//input[@id=\"checkbox1\"]"));
		
		cricket.click();
		
		
		WebElement skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		Select box = new Select(skills);
		
		box.selectByValue("APIs");
		
		
		WebElement Year = driver.findElement(By.xpath("//select[@placeholder=\"Year\"]"));
		
		Select year = new Select(Year);
		
		year.selectByValue("1995");
		
		WebElement Month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		
		Select month = new Select(Month);
		
		month.selectByValue("February");
		
		WebElement Day = driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
		
		Select day = new Select(Day);
		
		day.selectByValue("1");
		
		WebElement pass = driver.findElement(By.id("firstpassword"));
		
		//pass.click();
		
		pass.sendKeys("123456789");
		
       WebElement confpass = driver.findElement(By.id("secondpassword"));
       
   	    //confpass.click();
		
		confpass.sendKeys("123456789");
		
		WebElement submit = driver.findElement(By.id("submitbtn"));
		
		submit.click();
		
		
	}
		
		@AfterMethod
		public void closeBrowswer()
		{
			driver.quit();
			
		}
		
		@AfterClass
		public void afterClass()
		{
			
			System.out.println("*************");
		}

}
