package com.testautomation.qa.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotHanlde 
{
	
	public void screenShots(WebDriver driver,String filename)
	  {
		  //1. Take screen shot and store it as file
		  // Convert web driver object to TakeScreenshot
		  File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  //2. copy the screen shot to desired location
		  FileUtils.getFile(file, new File("C:\\Users\\52107971\\eclipse-workspace\\DAP\\src\\main\\java\\screenshots\\")+filename+".jpg");
	  }
}
