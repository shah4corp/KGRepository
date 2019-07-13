package com.klougin.mobile.app;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import com.KG.utilities.BaseEngine;

public class MobileThree extends BaseEngine{
	
	@Test
	public void testSampleTest() throws InterruptedException, IOException{
		
		//getAppium().findElement(By.xpath("//*[contains(@text,'Accessibility')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
		getAppium().findElement(By.id("com.es.kloudgin:id/chooseProfile")).click();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date = new Date();
		String fileName = sdf.format(date);
		TakesScreenshot ts = (TakesScreenshot)getAppium();
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"//Screenshots//"+ fileName +".png"));
		/*getAppium().findElement(By.xpath("//*[contains(@text,'UAT')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'Usernamae')]")).sendKeys("treno");
		getAppium().findElement(By.xpath("//*[contains(@text,'Cloud Instance')]")).sendKeys("ht-sc");
		getAppium().findElement(By.xpath("//*[contains(@text,'Login to UAT')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'Password')]")).sendKeys("Welcome@2019");
		getAppium().findElement(By.xpath("//*[contains(@text,'Login')]")).click();*/

	}

}