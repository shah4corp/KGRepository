package com.KG.ScreenshotExcell;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.KG.utilities.DriverUtility;

public class GmailLogin {
	@Test
	public void LogIn() {
		DriverUtility.openBrowser("ie");
	    DriverUtility.getDriver().get("https://www.gmail.com");
	    DriverUtility.getDriver().findElement(By.id("identifierId")).sendKeys("shah4corp@gmail.com");
	    DriverUtility.getDriver().findElement(By.id("dentifierId")).sendKeys("shah4corp@gmail.com");


	}

}
