package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertss {
	
	
	public static void main (String args[]) throws InterruptedException
	{
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
		 driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]")).click();
		 
		 Alert conf = driver.switchTo().alert();
		 
		 conf.accept();
		 
		 driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		 
		 Alert promp = driver.switchTo().alert();
		 
		 System.out.println(promp.getText());
		 
		 promp.sendKeys("Yes");
		 
		 promp.accept();		 
		
	}

}
