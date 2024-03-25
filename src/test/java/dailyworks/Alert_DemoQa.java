package dailyworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_DemoQa {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
//		WebElement alert1 = driver.findElement(By.id("alertButton"));
//		alert1.click();
//		Alert alert11 = driver.switchTo().alert();
//		alert11.accept();
		
		
		WebElement alert2 = driver.findElement(By.id("timerAlertButton"));
		alert2.click();
		
	    Thread.sleep(6000);
		Alert alertwe = driver.switchTo().alert();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		alertwe.accept();
		
//
//		WebElement click3 = driver.findElement(By.id("confirmButton"));
//		click3.click();
//	
//		Alert alert3t = driver.switchTo().alert();
//		System.out.println(alert3t.getText());
//		alert3t.accept();
//	
//	WebElement prompt = driver.findElement(By.id("promtButton"));
//	prompt.click();
//	
//	Alert promttext = driver.switchTo().alert();
//	promttext.sendKeys("ramesh");
//	promttext.accept();
	
	
	}
	
	

}
