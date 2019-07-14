package com.KG.ScreenshotExcell;

import java.io.File;
import java.io.FileInputStream;	
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static void main(String[] args) throws Exception {
	File file = new File("C:\\Users\\shahnawazm\\workspace\\MobileTest\\Excel_sheets\\Leave Balances.xlsx");
	FileInputStream fis = new FileInputStream(file);
	//.xlsx file => XSSFWorkbook, .xls file => HSSFworkbook
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet1 = wb.getSheet("myData");
    //XSSFSheet sheet1 = wb.getSheetAt(0);
    String data00 = sheet1.getRow(0).getCell(0).getStringCellValue();
    System.out.println("the data at 00 is "+ data00);
    //wb object need to be closed, so that object in memory is released to avoid MEMORY_LEAK
    wb.close();
    
    
    }
}
