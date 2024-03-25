package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextandGetAttribute {

	public static void main(String args[]) {

		WebDriverManager.edgedriver().setup();

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://letcode.in/edit");

		driver.manage().window().maximize();

		
		  WebElement label = driver.findElement(By.xpath("//p[.=\" Insight \"]"));
		  
		  String text = label.getText();
		  
		  System.out.println(text);
		

		WebElement box = driver.findElement(By.id("dontwrite"));

		String atty = box.getAttribute("value");

		System.out.println(atty);

	}

}
