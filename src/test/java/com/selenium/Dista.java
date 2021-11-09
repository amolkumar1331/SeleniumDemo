package com.selenium;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dista  {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.dista.ai/");
		WebElement productele = driver.findElement(By.xpath("(//a[text()=\"Products \"])[1]"));

		Actions act = new Actions(driver);
		act.moveToElement(productele).build().perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Dista Food')] )[1]")).click();
		WebElement branches = driver.findElement(By.xpath("(//div[@class='elementor-counter'])[3]/div/span[2]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", branches);
		Thread.sleep(3000);
		String value = branches.getText();
		System.out.println(value);
		assertEquals("Element not found", value, "200");

	}

}
