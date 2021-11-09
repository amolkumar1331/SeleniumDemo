package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 extends Test1 {
	

	private static final CharSequence address = null;
	private static final CharSequence phone = null;
	private CharSequence eaddress;

	@Test(dataProvider = "Testdata")
	public void register(String firstname, String lastname, String address, String eaddress, String phone, String gen,
			String hobbi, String lang, String skill, String coun, String year, String Mon, String Birth,
			String password, String cpass) throws InterruptedException {

		WebElement fname = driver.findElement(By.xpath("//input[@placeholder=\'First Name\']"));
		fname.clear();
		fname.sendKeys(firstname);
		Thread.sleep(2000);

		WebElement lname = driver.findElement(By.xpath("//input[@placeholder=\'Last Name\']"));
		lname.sendKeys(lastname);
		Thread.sleep(2000);

		WebElement add = driver.findElement(By.xpath("//textarea[@ng-model=\'Adress\']"));
		add.sendKeys(address);
		Thread.sleep(1000);

		WebElement emailaddress = driver.findElement(By.xpath("//input[@ng-model=\'EmailAdress\']"));
		emailaddress.sendKeys(eaddress);
		Thread.sleep(2000);

		WebElement pno = driver.findElement(By.xpath("//input[@type=\'tel\']"));
		pno.sendKeys(phone);
		Thread.sleep(2000);

		WebElement gender = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		gender.click();
		Thread.sleep(2000);

		WebElement hobbies = driver.findElement(By.xpath("//label[@class=\"checks\"]"));
		hobbies.click();
		Thread.sleep(2000);

		WebElement languages = driver.findElement(By.id("msdd"));

		WebElement Skills = driver.findElement(By.id("Skills"));

		WebElement countries = driver.findElement(By.id("countries"));

		WebElement dateofyear = driver.findElement(By.id("yearbox"));

		WebElement Month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Month.click();
		Thread.sleep(2000);

		WebElement dateofbirth = driver.findElement(By.id("daybox"));
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.xpath("//input[@type=\'password']"));
		pass.sendKeys(password);
		Thread.sleep(2000);

		WebElement passcon = driver.findElement(By.xpath("//input[@type=\'password']"));
		pass.sendKeys(password);
		Thread.sleep(2000);

		WebElement submitBtn =driver.findElement(By.xpath("//button[@type=\'submit\']"));

		submitBtn.click();
		
		//driver.findElement(By.xpath("//button[@type=\'button\']")).click();

		/*
		 * driver.findElement(By.xpath("")).click(); Thread.sleep(10000);
		 * 
		 * driver.findElement(By.xpath("")).click(); Thread.sleep(1000);
		 * 
		 * driver.findElement(By.xpath("")).click();
		 */

	}

	@DataProvider(name = "Testdata")
	public Object[][] data() {
		Object[][] obj = new Object[1][15];

		obj[0][0] = "nilesh";
		obj[0][1] = "jadhav  ";
		obj[0][2] = "sangli ";
		obj[0][3] = " nilam@123 ";
		obj[0][4] = "8483859366";
		obj[0][5] = "male";
		obj[0][6] = "cricket";
		obj[0][7] = " english ";
		obj[0][8] = " skill ";
		obj[0][9] = " india ";
		obj[0][10] = " 1995 ";
		obj[0][11] = " november ";
		obj[0][12] = " 26";
		obj[0][13] = " mail ";
		obj[0][14] = " mail ";

		/*obj[1][0] = "priyush";
		obj[1][1] = "jadhav  ";
		obj[1][2] = "sangli ";
		obj[1][3] = " nilam@122 ";
		obj[1][4] = "8483859364";
		obj[1][5] = "male";
		obj[1][6] = "cricket";
		obj[1][7] = " english ";
		obj[1][8] = " skill ";
		obj[1][9] = " india ";
		obj[1][10] = " 1994 ";
		obj[1][11] = " dcember ";
		obj[1][12] = " 26";
		obj[1][13] = " xyz ";
		obj[1][14] = "xyz";

		obj[2][0] = "raj";
		obj[2][1] = "patil  ";
		obj[2][2] = "pune";
		obj[2][3] = " nilam@123 ";
		obj[2][4] = "8483859366";
		obj[2][5] = "male";
		obj[2][6] = "cricket";
		obj[2][7] = " english ";
		obj[2][8] = " skill ";
		obj[2][9] = " india ";
		obj[2][10] = " 1995 ";
		obj[2][11] = " november ";
		obj[2][12] = " 26";
		obj[2][13] = " Femail ";
		obj[2][14] = " Femail ";*/

		return obj;
	}

	

}
