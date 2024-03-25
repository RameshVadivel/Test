package Script;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTask {
	
	
	private static final String Male = null;

	public static void main (String args[]) throws InterruptedException
	
	{
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();		
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Ramesh");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Vadivel");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("7788994455");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("7788994455");
		
		
		
	
		WebElement day = driver.findElement(By.id("day"));
		
		Select key = new Select(day);
		
		key.selectByValue("1");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select key2 = new Select(month);
		
		key2.selectByIndex(1);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select key3 = new Select(year);
		
		key3.selectByValue("2000");
		
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
		
		male.click();
		
		WebElement signup = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		
		signup.click();
		
		
		
		
		
		
		
		
		
	}

}

