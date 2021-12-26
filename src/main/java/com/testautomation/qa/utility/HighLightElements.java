package com.testautomation.qa.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLightElements
{
	
		public static void flash(WebElement element, WebDriver driver) {
	        JavascriptExecutor js = ((JavascriptExecutor) driver);
	        String bgcolor  = element.getCssValue("backgroundColor");
	        for (int i = 0; i <  3; i++) {
	            changeColor("rgb(0,200,0)", element, js);
	            changeColor(bgcolor, element, js);
	        }
	    }
	    public static void changeColor(String color, WebElement element,  JavascriptExecutor js) {
	        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

	        try {
	            Thread.sleep(30);
	        }  catch (InterruptedException e) {
	        }
	     }
	}


