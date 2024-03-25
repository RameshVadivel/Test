package NewScript;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {
	
	public static void main (String args[])
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
		List<WebElement> col_count = driver.findElements(By.xpath("//table//tr[1]//td"));
	    System.out.println(col_count.size());
	    
	    Iterator<WebElement> iterator_text = col_count.iterator();
	    while(iterator_text.hasNext())
	    {
	    	
	    	WebElement values = iterator_text.next();
	    	String printnames = values.getText();
	    	System.out.println(printnames);
	    }
	    
	    
	    List<WebElement> rowcount = driver.findElements(By.xpath("//table//tr[2]//td"));
	    System.out.println(rowcount.size());
	    
	    Iterator<WebElement> iterator_1 = rowcount.iterator();
	    while(iterator_1.hasNext())
	    {
	    	
	    	WebElement getnames = iterator_1.next();
	    	String fnames = getnames.getText();
	    	System.out.println(fnames);
	    }
		
		
	}

}
