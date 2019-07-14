package com.KG.ScreenshotExcell;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;  
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotOne {
	WebDriver d;
	public void screenshot(String imagename, String methodName) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date = new Date();
		String fileName = sdf.format(date);
		TakesScreenshot ts = (TakesScreenshot)d;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(System.getProperty("user.dir")+ "//Screenshots//"+ methodName + fileName +".png"));
	}
	@Test
	public void logIn() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahnawazm\\workspace\\MobileTest\\Drivers\\chromedriver.exe");
	    d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		d.get("https://www.gmail.com");
		d.findElement(By.id("identifierId")).sendKeys("shah4corp@gmail.com");
		d.findElement(By.id("identifierI")).sendKeys("shah4corp@gmail.com");

		
	}
	@BeforeMethod
    public void beforeMethod(Method m) {
		System.out.println("Executing the test case : " + m.getName());
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			screenshot(result.getName(), result.getName());	
		}
	}

}
