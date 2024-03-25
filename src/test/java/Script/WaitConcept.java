package Script;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcept {
	
public static void main (String args[]) throws InterruptedException
	
	{
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();		
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // implicit wait
	
	WebDriverWait wait = new WebDriverWait(driver,30);  // Explicit wait
	wait.until(ExpectedConditions.alertIsPresent());
	
}}