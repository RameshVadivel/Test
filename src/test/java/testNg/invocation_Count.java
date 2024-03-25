package testNg;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invocation_Count {
		
		EdgeDriver driver;
						
		@BeforeMethod
		public void windowOpen()
		{
			 WebDriverManager.edgedriver().setup();
				
				driver = new EdgeDriver();
				
				driver.get("https://demo.automationtesting.in/Alerts.html");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
		}
		
		
		
		@Test(invocationCount = 2)   // To run the Testcase for the number of times given in " invocation count"
		public void testcase()
		{
			
			System.out.println("1246789");
			
		}

	}
