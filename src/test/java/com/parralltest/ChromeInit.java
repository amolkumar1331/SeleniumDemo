package com.parralltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeInit {
	
	@Test
	public void browserInit() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	
	@Test
	public void m1()
	{
		System.out.println("m1 from Chrome");
	}

}
