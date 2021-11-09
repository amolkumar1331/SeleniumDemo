package com.selenium;

import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExmple  extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException {

		
		driver = browserInit();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,950)");
		
		Thread.sleep(6000);

		driver.close();
	}

}
