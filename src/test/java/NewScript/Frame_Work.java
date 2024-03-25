package NewScript;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Work {
	
	public static void main (String args[])
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
       WebElement outerframe = driver.findElement(By.id("singleframe"));
       driver.switchTo().frame(outerframe);
       
       List<WebElement> fram = driver.findElements(By.tagName("iframe"));
      System.out.println(fram.size());
       
       WebElement textbox = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
       textbox.sendKeys("Oranium Tech ");
       
       WebElement iframebut = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
       iframebut.click();
       
       List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
       System.out.println(totalframe.size());
       
       WebElement ifouter = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
       driver.switchTo().frame(ifouter);
       
       driver.switchTo().frame(0);
       
       WebElement textkey = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
       
       textkey.sendKeys("741852963");
       
       
       List<WebElement> ifinner = driver.findElements(By.tagName("iframe"));
      System.out.println(ifinner.size());
      
      
       
       
		
		System.out.println("completed");
	}

}
