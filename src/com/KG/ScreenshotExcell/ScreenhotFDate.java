package com.KG.ScreenshotExcell;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScreenhotFDate {
	static AndroidDriver<MobileElement> appium = null;
public static void main(String[] args) throws IOException {
		DesiredCapabilities capabs = new DesiredCapabilities();
		capabs.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabs.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
		capabs.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabs.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\Apps\\KloudGin_v19.2.apk");
			
			appium = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabs);
			appium.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			//appium.findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
			//appium.findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
			//appium.findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
			//appium.findElement(By.id("com.es.kloudgin:id/chooseProfile")).click();
			SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			Date date = new Date();
			String dateTime = sdf.format(date);
			TakesScreenshot ts = (TakesScreenshot)appium;
	        File file = ts.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"//Screenshots//"+ dateTime +".png"));
			
		
	}

}
