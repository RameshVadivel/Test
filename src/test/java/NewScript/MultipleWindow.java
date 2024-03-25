package NewScript;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {
	
	public static void main(String args[]) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]")).click();
		
		
		String parentid = driver.getWindowHandle();
		Set<String> childid = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList(childid);
		System.out.println(list.size());
		
		driver.switchTo().window(list.get(2));
		
		
	}
	
	

}
