package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	
	
	@Parameters("url")
	@Test
	public void registrtionTest(String url)
	{
		System.out.println("url is :" +url);
	}

}
