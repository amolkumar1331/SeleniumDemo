package com.listeners;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;


public class Test1 {
	
	@Test
	public void m1()
	{
		System.out.println("m1 call..");
	}
	@Test  //(enabled = false)
	public void m2()
	{
		System.out.println("m2 call..");
		
		String s = "ABC";
		
		//assertNull(s);
//		
//		assertNotSame("java", "selenium");
//		assertSame("java", "java");
//		
		assertEquals("Both value are not same", "java", "selenium");
	
		
	}

	@Test(dependsOnMethods = "m1")
	public void m3()
	{
		System.out.println("m3 call..");
	}
}
