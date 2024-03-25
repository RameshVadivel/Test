package NewScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	
	public static void main (String args[]) throws IOException
	{
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		File screen = tss.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\USER\\eclipse-workspace\\Mvndemosec\\src\\Screen//image"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(screen, dest);
	}


	
	

}
    
