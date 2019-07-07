package com.klougin.mobile.app;

import java.io.File;  
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahnawazm\\workspace\\MobileTest\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(60 , TimeUnit.SECONDS);
		d.get("https://www.youtube.com");
		
	    TakesScreenshot screenshot = (TakesScreenshot)d;
	    File file = screenshot.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("D:\\gmailHomepage.png"));
	    d.quit();
	   }

}
