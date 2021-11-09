package com.testng;

import org.testng.annotations.Test;

public class Test6 {
	
	@Test
	public void m1()
	{
		System.out.println("m1");
	}

	@Test(groups= {"Smoke"})
	public void m2()
	{
		System.out.println("Smoke -- Test6");
	}
	
	@Test
	public void m3()
	{
		System.out.println("m3");
	}
	
	@Test(groups= {"Regression"})
	public void m4()
	{
		System.out.println("Regression -- Test6");
	}
}
