package testNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {
	
	WebDriver driver;
	
	@Test (enabled = false)
	public void hardassertequal()
	{
		
		int num = 500;
		String data = "Ramesh";
		
		
		org.testng.Assert.assertEquals(num, 500);
		org.testng.Assert.assertNotEquals("Ramesh", "Ramesh","data are equal,so its fail");
		
		
	}
	
	@Test
	public void hardassertnull()
	{
		
		String a = "poiuyt";
		String b = "0";
		
		//org.testng.Assert.assertNull(b);
		org.testng.Assert.assertNotNull(a);
		
	}
	
	public void hardassertboolean()
	
	{
		
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement malebutton = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		malebutton.click();
		
		boolean selected = malebutton.isSelected();
		
		System.out.println(selected);
		
		org.testng.Assert.assertEquals(selected, "True");
		
		System.out.println("12346");
		
		
	}
	
	
	

}
