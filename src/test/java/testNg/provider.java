package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
@Parameters({"Email","Password"})
public class provider {
	
	public void testngprovider(String email,String Password)
	
	{
		
		WebDriverManager.edgedriver().setup();
	    EdgeDriver driver = new EdgeDriver();
	    driver.get("https://demo.automationtesting.in/SignIn.html");
	    driver.manage().window().maximize();
	    
	    WebElement mailidbox = driver.findElement(By.xpath("//input[@placeholder=\"E mail\"]"));
	    mailidbox.sendKeys(email);
	    
	    WebElement passbox = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	    mailidbox.sendKeys(Password);
	    
	    
	}
	

}
