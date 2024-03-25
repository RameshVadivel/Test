package NewScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElements {
	
	public static void main (String args[])
	
	{
		
		WebDriverManager.edgedriver().setup();  // for without finding the elements to run the page
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement one = driver.switchTo().activeElement();
		
		one.sendKeys("123456789",Keys.TAB,"password",Keys.ENTER);
		
		
		
		
		
	}

}
