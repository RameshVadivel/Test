package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	
	public static void main (String args[]) throws InterruptedException
	{
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
	
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		driver.manage().window().maximize();
//		
//		WebElement link = driver.findElement(By.xpath("//a[@target=\"_blank\"]"));
//		
//		link.click();
//	
//		driver.close();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		WebElement gender = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		
		gender.click();
		
		WebElement cricket = driver.findElement(By.xpath("//input[@value=\"Cricket\"]"));
		
		cricket.click();
		
		WebElement movies = driver.findElement(By.xpath("//input[@value=\"Movies\"]"));
		
		movies.click();
		
		WebElement hockey = driver.findElement(By.xpath("//input[@value=\"Hockey\"]"));
		
		hockey.click();
		
		
		boolean box = gender.isSelected();
		System.out.println(box);
		
		boolean box2 = gender.isDisplayed();
		System.out.println(box2);
		
	}

}
