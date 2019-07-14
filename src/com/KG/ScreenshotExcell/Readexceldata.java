package com.KG.ScreenshotExcell;

import com.KG.utilities.ExcelDataUtility;

public class Readexceldata {
	public static void main(String[] args) {
		
		ExcelDataUtility excel = new ExcelDataUtility("C:\\Users\\shahnawazm\\workspace\\MobileTest\\Excel_sheets\\KG.xlsx");
		
		System.out.println(excel.getData("myData", 2, 4));
		
	}

}
