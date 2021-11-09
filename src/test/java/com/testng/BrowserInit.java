package com.testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInit {

	public static WebDriver driver = null;

	@BeforeSuite
	public void browserInit() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void closeDriver() {
		driver.close();
	}
	

	public static void getScreenShot(String name) throws IOException {
		TakesScreenshot src = (TakesScreenshot) driver;
		File srcFile = src.getScreenshotAs(OutputType.FILE);

		String path = "F:\\ScreenShot\\" + name + ".png";
		System.out.println(path);

		File destfile = new File(path);

		FileUtils.copyFile(srcFile, destfile);


	}

}
