package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages_POM.NinjaShort;
import Utility.BaseClass;


@Test
public class NinjaPage extends BaseClass{
	
	
	public void pagesource()
	{
		
		nish.searchbox();
		nish.cartbutton();
		nish.cartclick();
		nish.checkout();
		
		
	}

}
