package com.selenium;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHAndlingExample  extends AppConstant {

	public static void main(String[] args) throws InterruptedException, AWTException {

		driver = browserInit();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		
		List<WebElement> allcomp =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		for(WebElement e : allcomp)
		{
			System.out.println(e.getText());
		}
		
		
		
	/*	
		WebElement groupele =driver.findElement(By.xpath("//table/thead/tr/th[2]"));
		System.out.println(groupele.getText());
		
		List<WebElement> allhead =driver.findElements(By.xpath("//table/thead/tr/th"));
		// 5  --   4
		for(int i =0 ; i< allhead.size(); i++)
		{
			WebElement e = allhead.get(i);
			System.out.println(e.getText());
		}
		
		
		
		List<WebElement> alldata =driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		Iterator<WebElement> it =alldata.iterator();
		while(it.hasNext())
		{
			WebElement e	=it.next();
			System.out.println(e.getText());
		}*/
		
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
