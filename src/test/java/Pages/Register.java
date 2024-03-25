package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Pages_POM.RegisterPage;
import Utility.BaseClass;


@Test
public class Register extends BaseClass{
	
	public void registerform()
	
	{
		
		reg.firstname();
		reg.lastname();
		reg.adress();
		reg.phone();
		reg.email();
		
		
	}
	
	

}
