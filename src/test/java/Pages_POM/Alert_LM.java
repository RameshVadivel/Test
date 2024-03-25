package Pages_POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import Utility.BaseClass;

public class Alert_LM extends BaseClass {
	
	public static String alert = "//button[@class=\"btn btn-danger\"]";
	
	 public static String con ="//a[text()=\"Alert with OK & Cancel \"]";	
	
	public static String conf ="//button[@onclick=\"confirmbox()\"]";
	
	public static String pro = "//a[text()=\"Alert with Textbox \"]";
	
	public static String prompt = "//button[@onclick=\"promptbox()\"]";
	
	
	public void alert()
	{
		
		driver.findElement(By.xpath(trela.alert)).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
	}
	
	
	public void confirm()
	{
		
		driver.findElement(By.xpath(trela.con)).click();
		driver.findElement(By.xpath(trela.conf)).click();
		 
		 Alert conf = driver.switchTo().alert();
		 
		 conf.accept();
	}
	
	public void prompt()
	{
		driver.findElement(By.xpath(trela.pro)).click();
		driver.findElement(By.xpath(trela.prompt)).click();
		 
		 Alert promp = driver.switchTo().alert();
		 
		 System.out.println(promp.getText());
		 
		 promp.sendKeys("Yes");
		 
		 promp.accept();	
	}

}
