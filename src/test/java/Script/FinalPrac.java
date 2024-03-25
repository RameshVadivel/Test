package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FinalPrac {
	
	public static void main (String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		
	EdgeDriver driver = new EdgeDriver();
	
	Thread.sleep(5000);
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	
	WebElement name = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	
	name.sendKeys("********");
	
	WebElement lastname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	
	lastname.sendKeys("Vadivel");
	
	WebElement Address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	
	Address.sendKeys("************************");
	
   WebElement mail = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
	
	mail.sendKeys("rameshvrs0111@gmail.com");
	
	WebElement Mobile = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	
	Mobile.sendKeys("7358927998");
	
	WebElement male = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
	
	male.click();
	
	WebElement cric = driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
	
	cric.click();;
	
	
	
	}
	

}
