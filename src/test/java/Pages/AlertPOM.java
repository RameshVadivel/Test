package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Utility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class AlertPOM extends BaseClass {
	
	public void checkalert()
	{
	
	trela.alert();
	trela.confirm();
	trela.prompt();
	
	 
	 
	 

}
}
