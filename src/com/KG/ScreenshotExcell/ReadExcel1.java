package com.KG.ScreenshotExcell;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\shahnawazm\\workspace\\MobileTest\\Excel_sheets\\Testing.xlsx");
		FileInputStream fis = new FileInputStream(file);
		//.xlsx file => XSSFWorkbook, .xls file => HSSFworkbook
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet1 = wb.getSheetAt(0);
	    int rowCount = sheet1.getLastRowNum();
	    System.out.println("The total rows " + rowCount);
	    
	    for(int i=0;i<=rowCount;i++)
	    {
	    	String data0 = sheet1.getRow(i).getCell(0).getStringCellValue(); 
	    	System.out.println("Test data from excel is "+data0);
	    }
	    
	    
	    //wb object need to be closed, so that object in memory is released to avoid MEMORY_LEAK
	    wb.close();
	    
	    
	    }

}
