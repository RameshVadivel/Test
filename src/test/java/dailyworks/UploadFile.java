package dailyworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	
	public static void main (String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		WebElement upbox = driver.findElement(By.id("uploadFile"));
		Actions builder = new Actions(driver);
		builder.click(upbox).build().perform();
		upbox.sendKeys("C:\\Users\\USER\\Desktop\\mvn stru.png");
		
		System.out.println("file uploaded");
		
		
		
	}
	
	

}
