package com.testng;

import org.testng.annotations.Test;

public class Test7 {
	
	@Test
	public void m5()
	{
		System.out.println("m5");
	}

	@Test(groups= {"Smoke"})
	public void m6()
	{
		System.out.println("Smoke -- Test7");
	}
	
	@Test(groups= {"Regression"})
	public void m4()
	{
		System.out.println("Regression -- Test7");
	}
	
	
}
