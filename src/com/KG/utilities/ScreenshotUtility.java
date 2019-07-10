package com.KG.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenshotUtility 
{
   public static void screenshot(String imageName,WebDriver d) throws IOException
   {
	   TakesScreenshot ts = (TakesScreenshot)d;
       File file = ts.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(file, new File("D:\\"+ imageName + ".png"));
   }
}
