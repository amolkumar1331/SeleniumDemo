package com.registration;

import java.sql.Driver;

import org.openqa.selenium.By;

import com.selenium.AppConstant;

public class RegisMethods extends AppConstant {
	
	public void fillform()
	{
		driver.findElement(By.xpath(RegiElements.fname)).sendKeys("ABC");
	}

}
