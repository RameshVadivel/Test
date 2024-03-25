package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSite {
	
	public static void main (String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
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
		
		driver.quit();
		
		// complted

		
		
		
		
	}

}
