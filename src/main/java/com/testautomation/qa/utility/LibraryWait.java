package com.testautomation.qa.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibraryWait 
{
	
	public static WebElement waitForElemrent(WebDriver driver, WebElement webElement, int seconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}
	
	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement webElement, int seconds)
		
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;
	}
	
	
	
}
