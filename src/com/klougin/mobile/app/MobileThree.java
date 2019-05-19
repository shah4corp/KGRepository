package com.klougin.mobile.app;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.KG.utilities.BaseEngine;

public class MobileThree extends BaseEngine{
	
	@Test
	public void testSampleTest() throws MalformedURLException, InterruptedException{
		
		getAppium().findElement(By.xpath("//*[contains(@text,'Accessibility')]")).click();
		Thread.sleep(7899);
		getAppium().navigate().back();
		Thread.sleep(7899);
	}

}