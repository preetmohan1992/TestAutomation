package com.testautomation.qa.pagebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageBase {
	
	public static WebDriver driver; // global variables
	public static Properties prop;
	public static WebDriverWait wait;
	//public static Wait wait1;
	 
	public PageBase()
	{
		try {
			prop =new Properties();
			// to read the data from the property file
			FileInputStream ip= new FileInputStream("C: ");
			
			prop.load(ip);
			
		} catch(FileNotFoundException e)

		{
			e.printStackTrace();
		} catch(IOException e)
		{	
			e.printStackTrace();
		}

	}
	
	
	  public static void initialization() throws InterruptedException
	  { 
		  String browserName =prop.getProperty("browser");
	  
	  if(browserName.equals("chrome")) 
	  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\52107971\\eclipse-workspace\\Test\\src\\main\\java\\com\\testautomation\\qa\\driver\\chromedriver.exe");
	  driver = new ChromeDriver(); 
	  }
	  
	  else
	  {
		  System.err.println("no browser value is given");
	   }
	  
	  driver.manage().window().maximize(); 
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
	  
	  }
	  

}
