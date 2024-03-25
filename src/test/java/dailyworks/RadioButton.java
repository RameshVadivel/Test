package dailyworks;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	
	public static void main (String args[])
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
	
	WebElement yesbtn = driver.findElement(By.id("yesRadio"));
	
	Actions builder = new Actions(driver);
	builder.click(yesbtn).build().perform();
	
	String text = yesbtn.getText();
	System.out.println(text);
	
	}

}
