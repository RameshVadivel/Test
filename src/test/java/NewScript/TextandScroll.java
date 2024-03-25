package NewScript;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextandScroll {
	
	public static void main(String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search.click();
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);
		
	List<WebElement> names = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	System.out.println(names.size());
	
	Iterator<WebElement> getnames = names.iterator();
	while(getnames.hasNext())
	{
		WebElement namess = getnames.next();
		System.out.println(namess.getText());
	}
	
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	WebElement nextbutton = driver.findElement(By.xpath("//a[text()=\"Next\"]"));
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView();", nextbutton);
	nextbutton.click();
	
	System.out.println("*********************************************************************************************************************************************************");
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	List<WebElement> page2 = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	System.out.println(page2.size());
	
	
	
//	WebElement nextbtn_p3 = driver.findElement(By.xpath("//a[text()='Next']"));
//	
//	JavascriptExecutor scroll = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].scrollIntoView();", nextbtn_p3);
//	nextbtn_p3.click();
    
    	
    }
    		
	
	}
	
	

	
	


