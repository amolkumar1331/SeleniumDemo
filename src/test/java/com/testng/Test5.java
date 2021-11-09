package com.testng;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test5 {
	
	
	@Parameters("username")
	@Test  //  (invocationCount = 4)                 
	public void m1(String uname)
	{
		System.out.println("Call m1" +uname );
	}

	@Test   //(priority = 1)
	public void m2()
	{
		System.out.println("Call m2");
	}
	
	@Test //(enabled = false)
	public void loginTest()
	{
		System.out.println("Call Login Test");
		
		String actualTitle = "OrangeHRM";
		String exptedTitle = "OrangeHRMPage";
		
		//assertEquals(actualTitle, exptedTitle);
	//	assertNotEquals(actualTitle, exptedTitle);
		
		//assertTrue(true); // pass     false : fail
		
	//	assertFalse(false); // pass  true : fail
		
		
	//	assertEquals("JAVA", "Java-Selenium");
		
	}
	
	@Test(dependsOnMethods ="loginTest" )
	public void adminTest()
	{
		System.out.println("adminTest ");
	}
	
	@Test(dependsOnMethods ="loginTest", alwaysRun = true )
	public void newTest()
	{
		System.out.println("newTest ");
	}
	
	@Test
	public void m5()
	{
		System.out.println("call m5");
	}
	

}
