package com.listeners;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.testng.BrowserInit;

@Listeners(ListenExample.class)
public class OrmLogin  extends BrowserInit{
	
	@Test
	public void loginTest()  // pass
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority = 1)
	public void adminTest()  // fail
	{
		System.out.println("Admin Test");
		driver.get("https://www.google.com/");
		assertEquals("java", "javaselenium");
		
	}
	
	
	
	@Test(dependsOnMethods ="adminTest")
	public void dashboradTest()    // skip
	{
		System.out.println("dashborad Test");
	}

}
