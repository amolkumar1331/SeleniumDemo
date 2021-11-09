package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample  extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException {
		driver = browserInit();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
		
		
		Wait wait1 = new FluentWait(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS);
				
		
		
		
	}

}
