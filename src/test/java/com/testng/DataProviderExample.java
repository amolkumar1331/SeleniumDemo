package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.AppConstant;

public class DataProviderExample extends BrowserInit{
	/*
	 * DataProvider :    Return Type : Object[][]
	 *   				use annoation : @dataProvider
	 */
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "username";
		obj[0][1] ="password";
		
		obj[1][0] = "Admin";
		obj[1][1] ="admin123";
		
		return obj;
	}
	
	
	
	@Test(dataProvider ="data" )
	public void loginTest(String uname , String pass) throws InterruptedException
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		
	
	}
	
	
	@DataProvider
	public Object[][] data12s()
	{
		Object[][] obj = new Object[2][5];
		
		obj[0][0] = "fanme";
		obj[0][1] ="lname";
		obj[0][2] = "mb";
		obj[0][3] ="city";
		obj[0][4] = "email";
		
		obj[1][0] = "Admin";
		obj[1][1] ="A";
		obj[1][2] = "9090909";
		obj[1][3] ="Pune";
		obj[1][4] = "a@gmail.com";
		
		
		return obj;
	}
	
	@Test(dataProvider ="data12s")
	public void regiTest(String s1 , String s2 , String s3 , String s4 , String s5)
	{
		System.out.println( s1 +"  " +s2+"  " +s3 +"  " +s4 +"  " +s5);
	}
	
	
	

}
