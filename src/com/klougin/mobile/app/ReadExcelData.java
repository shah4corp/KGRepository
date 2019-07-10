package com.klougin.mobile.app;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fip = new FileInputStream("C:\\Users\\shahnawazm\\workspace\\MobileTest\\Excel_sheets\\Testing.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet1 = workbook.getSheet("myData");
		Row row0 = sheet1.getRow(0);
		Cell cell00 = row0.getCell(0);
		String cellvalue00= cell00.getStringCellValue();
		System.out.println("Cell value is : " + cellvalue00);
	}

}
