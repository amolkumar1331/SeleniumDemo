package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.SeleniumJune.App;

public class AlertExample extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = browserInit();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alBtn =driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alBtn.click();
		
		WebElement alBtn1= driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		alBtn1.click(); 
		
		Alert al =driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.sendKeys("ABCD");
		Thread.sleep(3000);
		al.accept();
		
		
		
		
		
		
		// ************************ Alert with Ok and Cancel Button ****************88888
		
		/*driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		Thread.sleep(2000);
		
		WebElement btn1 =driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		btn1.click(); // open alert
		
		Alert a =driver.switchTo().alert();
		String altitle =a.getText();
		System.out.println(altitle);
		Thread.sleep(2000);

		//	a.accept();  // ok 
		
		a.dismiss(); // cancel
//		a.sendKeys("Hello");  // text data
//		
*/		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
