package Pages_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;


public class RegisterPage extends BaseClass {
	
	public static String fname = "//input[@placeholder=\"First Name\"]";
	
	public static String lname = "//input[@placeholder=\"Last Name\"]";
	
	public static String adress = "//textarea[@ng-model=\"Adress\"]";
	
	public static String mail = "//input[@ng-model=\"EmailAdress\"]";
	
	public static String phone = "//input[@ng-model=\"Phone\"]";
	
		
	public void firstname()
	{
		WebElement fname = driver.findElement(By.xpath(reg.fname));
		fname.sendKeys("Ramesh");
	}
	
	
	public void lastname()
	{
		WebElement lname = driver.findElement(By.xpath(reg.lname));
		lname.sendKeys("Vadivel");
	}

	public void adress()
	{
	WebElement adress = driver.findElement(By.xpath(reg.adress));
	adress.sendKeys("Marai Malai Nagar");
	}
	
	
	public void email()
	{
	WebElement mail = driver.findElement(By.xpath(reg.mail));
	mail.sendKeys("rameshvrs0111@gmail.com");
	}
	
	public void phone()
	{
		WebElement phone = driver.findElement(By.xpath(reg.phone));
		phone.sendKeys("7358927998");
		
	}
}
