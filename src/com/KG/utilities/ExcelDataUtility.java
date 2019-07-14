package com.KG.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataUtility {
	//GLOBAL variables
		 XSSFWorkbook wb;
		 XSSFSheet sheet1;
		 
		public ExcelDataUtility(String excelpath)
		{
			try {
				File file = new File(excelpath);
				FileInputStream fis = new FileInputStream(file);
				wb = new XSSFWorkbook(fis);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
		
		public String getData(String sheetName, int row, int column) 
		{
			sheet1 = wb.getSheet(sheetName);
			String data = sheet1.getRow(row).getCell(column).getStringCellValue();
			return data;
		}

}
