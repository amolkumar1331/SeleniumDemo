package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotExample extends AppConstant {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		driver = browserInit();
		
		driver.get("https://www.google.com/");
		getScreenShot("googleImg");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		getScreenShot("amazonImg");
		Thread.sleep(2000);
		driver.close();
	}

	public static void getScreenShot(String name) throws IOException 
	{
		TakesScreenshot src = (TakesScreenshot) driver;
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		

		String path = "F:\\ScreenShot\\" + name + ".png";
		System.out.println(path);

		File destfile = new File(path);
		
		FileUtils.copyFile(srcFile, destfile);
		
		
		//    google-hr-mm -ss
		// google-05-43-12.png
		// data formate -- date

	}

}
