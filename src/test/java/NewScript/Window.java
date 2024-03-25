package NewScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	
	public static void main (String args[])
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		driver.manage().window().maximize();
		
		String parentid = driver.getWindowHandle();
		Set<String> childids = driver.getWindowHandles();
		
		Iterator<String> names = childids.iterator();
		
		while(names.hasNext())
		{
			
			String id = names.next();
			if(parentid.equalsIgnoreCase(id))
			{
		     driver.switchTo().window(id);
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		driver.switchTo().window(parentid);
		
		
		
	}

}
