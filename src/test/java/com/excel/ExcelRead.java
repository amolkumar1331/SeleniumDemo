package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		File f = new File("F:\\ExcelRead\\Login.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet sh = wb.getSheet("Sheet1");
		int lastRowNo = sh.getLastRowNum();
		System.out.println(lastRowNo);
		
		int lastCellNo =sh.getRow(0).getLastCellNum();
		
		
		for(int i = 0 ; i <=lastRowNo ; i++)  // row
		{
			for(int j =0 ; j < lastCellNo ;j++)
			{
			  String value =sh.getRow(i).getCell(j).getStringCellValue();
		
			  System.out.print(value + " ");
			}
			System.out.println();
		
		}
		
		
		
		//-------------------Iteartor----------------
		
/*
		Iterator<Row> it = sh.iterator();
		while (it.hasNext()) //
		{
			Row r = it.next();
			Iterator<Cell> itcell = r.iterator();
			while (itcell.hasNext()) {
				Cell c = itcell.next();
				if (c.getCellType() == Cell.CELL_TYPE_STRING) {
					System.out.print(c.getStringCellValue() + " ");
				} else if (c.getCellType() == Cell.CELL_TYPE_NUMERIC) {

					System.out.println(c.getNumericCellValue());

				}

			}
			System.out.println();
		}*/
//----------------------------------------------------------
		/*
		 * String v1 =sh.getRow(1).getCell(1).getStringCellValue();
		 * System.out.println("" +v1);
		 */
//---------------------------------------------------------------------
		/*
		 * Row rw = sh.getRow(3);
		 * 
		 * Cell cell = rw.getCell(0);
		 * 
		 * String value = cell.getStringCellValue(); System.out.println("value is :"
		 * +value);
		 */

	}

}
