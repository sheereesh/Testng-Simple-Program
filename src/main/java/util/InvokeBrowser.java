package util;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {
	private static Properties value;
	public void invokeBrowser() {
		PropertyReader obj_PropertyReader=new PropertyReader();
		  value=obj_PropertyReader.propertyReader();
		if(value.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get(value.getProperty("url"));
		}
		else {


			System.out.println("no appropiate driver found");
		}


	}
}