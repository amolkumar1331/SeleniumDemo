package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {

		File f = new File("F:\\ExcelRead\\Login.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet sh = wb.getSheet("Sheet2");
		
		sh.createRow(5).createCell(1).setCellValue("Selenium");
		
		sh.getRow(5).createCell(2).setCellValue("Java");
		sh.createRow(6).createCell(1).setCellValue("Admi123");
		
		
		FileOutputStream fio = new FileOutputStream(f);
		wb.write(fio);
		System.out.println("******************8");
		
		
		
		
		
		
	}

}
