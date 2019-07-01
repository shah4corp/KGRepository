package com.klougin.mobile.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory; 

public class WriteDataExcelDemo {
	static FileInputStream fip;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		try {
			fip = new FileInputStream(System.getProperty("user.dir") + "\\Excel_sheets\\Leave Balances.xlsx");
		} catch (FileNotFoundException e) {
            System.out.println("check the dynamic path of file Please enter the valid path");
			e.printStackTrace();
		}
	Workbook workbook = WorkbookFactory.create(fip);	
	}

}
