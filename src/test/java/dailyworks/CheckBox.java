package dailyworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	
	public static void main (String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
		WebElement tog = driver.findElement(By.xpath("//button[@title=\"Toggle\"]"));
		tog.click();
		
		WebElement logs = driver.findElement(By.xpath("//span[@class=\"rct-title\"]"));
	     logs.click();
	     
	     String content = logs.getText();
	     System.out.println(content);
	    
	}

}
