package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import Pages_POM.Alert_LM;
import Pages_POM.Amazon_LM;
import Pages_POM.LoginLM;
import Pages_POM.NinjaShort;
import Pages_POM.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static RegisterPage reg = new RegisterPage();
	
	public static NinjaShort nish = new NinjaShort();
	
	public static Amazon_LM amn = new Amazon_LM();
	
	public static Alert_LM trela = new Alert_LM();
	
	public static Sel_Comusewor keys = new Sel_Comusewor();
	
	public static LoginLM log = new LoginLM();
	
	 
	@BeforeMethod
	public void openbrowser()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get("https://demo.automationtesting.in/SignIn.html");
		//driver.get("https://www.amazon.in/");
		//driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
	}
	
@AfterClass
	public void closebrowser()
	{
		
		//driver.close();
	}
	

}
