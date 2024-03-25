package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class dataprovider {
	
	
	EdgeDriver driver;
	
	@Test(dataProvider = "datastorage")
public void dataprovid(String email,String Password)
{
	
	WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();
	driver.get("https://demo.automationtesting.in/SignIn.html");
	driver.manage().window().maximize();
	
	WebElement mail = driver.findElement(By.xpath("//input[@placeholder=\"E mail\"]"));
	mail.sendKeys(email);
	
	WebElement password1 = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	password1.sendKeys(Password);
		
	
}
	
	@DataProvider
	public Object[][] datastorage()
	{
		Object[][] data =new Object[2][2];
	
		data[0][0] = "ramesh123@test.com";
		data[0][1] ="pass123";
		
		data[1][0] = "ramesh456@test.com";
		data[1][1] ="pass456";
		
		
		
		return data;
		
	}
	
	
}