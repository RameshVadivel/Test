package NewScript;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class List_WebElemets {
	
	public static void main(String args[])
	
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement textbox = driver.findElement(By.xpath("//input[@name=\"field-keywords\"]"));
		textbox.sendKeys("mobiles");
		textbox.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		List<WebElement> textretr = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		System.out.println(textretr.size());
		
		Iterator<WebElement> value = textretr.iterator();
		while(value.hasNext())
		{
			
			WebElement text2 = value.next();
			System.out.println(text2.getText());
			
		}
		
		
		
		
	}
	
		
		
	}


