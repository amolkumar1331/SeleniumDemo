package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FramesExample extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException {

		
		driver = browserInit();
		driver.get("https://www.myntra.com/");
		
		
		
		WebElement txt1 =driver.findElement(By.xpath("//a[text()='Women']"));
	
		Actions act = new Actions(driver);
		act.moveToElement(txt1).build().perform();
		Thread.sleep(1000);
		
		List<WebElement> alldata= driver.findElements(By.xpath("//div[@data-group=\"women\"]/li/ul/li/a"));
		System.out.println(alldata.size());
		
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
