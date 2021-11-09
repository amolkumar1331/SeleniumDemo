package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3 {
	
	
	@BeforeClass
	public void m5()
	{
		System.out.println(" @BeforeClass--- Test 3  ");
	}
	
	@Test
	public void m1()
	{
		System.out.println("m1 calll from---- Test3");
	}

}
