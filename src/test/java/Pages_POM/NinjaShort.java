package Pages_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.BaseClass;


public class NinjaShort extends BaseClass {
	
	public static String searchbox = "//input[@placeholder=\"Search\"]";
	
	public static String cartbutton = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]";
	
	public static String cart = "(//button[@data-toggle=\"dropdown\"])[2]";
	
	public static String checkout = "//strong[text()='Checkout']";
	

	public void searchbox()
	{
		WebElement searchbox = driver.findElement(By.xpath(nish.searchbox));
		searchbox.sendKeys("IPhone");
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	public void cartbutton()
	{
		WebElement cartbutton = driver.findElement(By.xpath(nish.cartbutton));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",cartbutton);
		cartbutton.click();
		
	}
	
	public void cartclick()
	{
		WebElement cart = driver.findElement(By.xpath(nish.cart));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].scrollIntoView()",cart);
		
		cart.click();
	}
	
	public void checkout()
	{
		WebElement checkout = driver.findElement(By.xpath(nish.checkout));
		checkout.click();
	}
	
}
