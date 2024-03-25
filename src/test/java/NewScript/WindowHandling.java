package NewScript;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[text()='    click   ']"));
		clickbtn.click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String> childid = driver.getWindowHandles();
		
		Iterator<String> id = childid.iterator();
		
		while(id.hasNext())
		{
			String values = id.next();
			
			if(parentwindow.equalsIgnoreCase(values));
			
			driver.switchTo().window(values);	
		}
		Thread.sleep(3000);
		
		WebElement downloadbutton = driver.findElementByXPath("//a[@href=\"/downloads\"]");
		downloadbutton.click();
		
		
		
		
			
		}

	}


