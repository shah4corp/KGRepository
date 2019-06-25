package com.klougin.mobile.app;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.KG.utilities.BaseEngine;

public class MobileThree extends BaseEngine{
	
	@Test
	public void testSampleTest() throws MalformedURLException, InterruptedException{
		
		//getAppium().findElement(By.xpath("//*[contains(@text,'Accessibility')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
		//getAppium().findElement(By.xpath("//*[contains(@text,'ALLOW')]")).click();
		//getAppium().findElement(By.id("com.es.kloudgin:id/chooseProfile")).click();
		/*getAppium().findElement(By.xpath("//*[contains(@text,'UAT')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'Usernamae')]")).sendKeys("treno");
		getAppium().findElement(By.xpath("//*[contains(@text,'Cloud Instance')]")).sendKeys("ht-sc");
		getAppium().findElement(By.xpath("//*[contains(@text,'Login to UAT')]")).click();
		getAppium().findElement(By.xpath("//*[contains(@text,'Password')]")).sendKeys("Welcome@2019");
		getAppium().findElement(By.xpath("//*[contains(@text,'Login')]")).click();*/

	}

}