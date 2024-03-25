package NewScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	
	public static void main (String args[])
	{
		
	WebDriverManager.edgedriver().setup();
	
	EdgeDriver driver = new EdgeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement xmark = driver.findElement(By.xpath("//span[@role=\"button\"]"));
	
	xmark.click();
	
	WebElement Elect = driver.findElement(By.xpath("//span[.='Electronics']"));
	
	Actions builder = new Actions(driver);
	
	builder.moveToElement(Elect);
	
	builder.build().perform();
	
			
	}
}
