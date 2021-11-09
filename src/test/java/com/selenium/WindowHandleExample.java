package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowHandleExample extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException 
	{
		driver = browserInit();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		
		String pTitle =driver.getTitle();
		System.out.println("Parent Title is :" +pTitle);
		
		String pID = driver.getWindowHandle();  // 
		System.out.println("Parent ID :" +pID);
		
		
		WebElement clickBtn = driver.findElement(By.xpath("//button[text()='click']"));
		clickBtn.click();  // child window  -- 2 window
		
		String childId = "";
		
		Set<String> allID = driver.getWindowHandles();  // A1 -- B1
		for( String  id:allID)
		{
			if(!id.equals(pID) )
				childId  = id;
			
		}
		
		System.out.println("Child  ID :" +childId);
		
		driver.switchTo().window(childId);
		
		String cTitle =driver.getTitle();
		System.out.println("After click -- Title is :" +cTitle);
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
