package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReadUtil {
	
	
	
	@Test(dataProvider = "data")
	public void test1(String str1 , String str2)
	{
		System.out.println(""+str1 +" "+str2);
		
	}
	
	@DataProvider
	public Object[][] data() throws IOException
	{
		Object[][] obj =  readExcel();
		return obj;
	}
	
	
	public Object[][] readExcel() throws IOException
	{

		File f = new File("F:\\ExcelRead\\Login.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet sh = wb.getSheet("Sheet1");
		int lastRowNo = sh.getLastRowNum();
		System.out.println(lastRowNo);
		
		int lastCellNo =sh.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRowNo+1][lastCellNo];
		
		
		for(int i = 1 ; i <=lastRowNo ; i++)  // row
		{
			for(int j =0 ; j < lastCellNo ;j++)
			{
			  obj[i][j] =sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		
		return obj;
		
	}

}
