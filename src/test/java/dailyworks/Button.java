package dailyworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	
	public static void main (String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement douclick = driver.findElement(By.id("doubleClickBtn"));
		Actions builder = new Actions(driver);
	
		builder.doubleClick(douclick).build().perform();
		
		WebElement right = driver.findElement(By.id("rightClickBtn"));
		Actions builder1 = new Actions(driver);
		
		builder1.contextClick(right).build().perform();
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions builder2 = new Actions(driver);
		builder2.click(clickbtn).build().perform();
		
		
		String print3 = clickbtn.getText();
		System.out.println(print3);
		
		
	}

}
