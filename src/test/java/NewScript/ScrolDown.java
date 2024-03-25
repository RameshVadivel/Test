package NewScript;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrolDown {
	
	
	public static void main (String args[])
	{
		
	
	WebDriverManager.edgedriver().setup();
	
	EdgeDriver driver = new EdgeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	search.click();
	search.sendKeys("one plus Mobiles");
	search.sendKeys(Keys.ENTER);
	
	
	
	
//	JavascriptExecutor jse1 =(JavascriptExecutor)driver;
//	jse.executeScript("window.scrollBy(0,9000);","");
//	
	
	
WebElement nextbtn = driver.findElement(By.xpath("//a[text()='Next']"));

JavascriptExecutor jse2 = (JavascriptExecutor)driver;
jse2.executeScript("arguments[0].scrollIntoView()", nextbtn);
nextbtn.click();





	
	}
	
}
