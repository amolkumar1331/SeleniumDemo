package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RobotExample extends AppConstant {

	public static void main(String[] args) throws InterruptedException, AWTException {

		driver = browserInit();
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(2000);
		

		WebElement selectfileBtn = driver.findElement(By.xpath("//span[text()=\"Choose Files\"]"));
		selectfileBtn.click();
		Thread.sleep(2000);

		StringSelection stringSelection = new StringSelection("Downloads\\PANCARD.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
