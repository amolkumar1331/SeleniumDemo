package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;

public class OpenTab extends AppConstant
{
	
	public static void main(String[] args) throws AWTException {
		
		driver = browserInit();
		driver.get("https://www.google.com/");
		
		// Open new  Tab--- JavaScript
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.open()");
		
		// Open new Tab-- using Robot class
		
		Robot r = new Robot();                 
		r.keyPress(KeyEvent.VK_CONTROL);         
		r.keyPress(KeyEvent.VK_T);        
		r.keyRelease(KeyEvent.VK_CONTROL);         
		r.keyRelease(KeyEvent.VK_T);
		
		
		
		// Windowhandle  : google --amazon  .. flipkart--- -- facbook
		
		
		driver.get("https://www.amazon.in/");
		
		
		JavascriptExecutor e1 = (JavascriptExecutor)driver;
		e1.executeScript("window.scrollBy(0,950)");
		
		
	}

}
