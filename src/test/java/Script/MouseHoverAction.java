package Script;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	
public static void main (String args[])
{
	
	WebDriverManager.edgedriver().setup();
	
	EdgeDriver driver = new EdgeDriver();
	
    driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement ele = driver.findElement(By.xpath("//a[text()=\" Electronics \"]"));
	
	Actions builder = new Actions(driver);
	
	builder.moveToElement(ele);
	
	ele.click();
	
	WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]"));
	
    Actions builder0 = new Actions(driver);
	
	builder.moveToElement(ele);
	
	mobiles.click();
	
}
}
