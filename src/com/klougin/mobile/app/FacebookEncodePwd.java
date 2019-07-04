package com.klougin.mobile.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class FacebookEncodePwd {
	@Test
		public void launchApp() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabs = new DesiredCapabilities();
		capabs.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabs.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
		capabs.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabs.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
		capabs.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
	    capabs.setCapability("noReset", true);
			
			AndroidDriver<MobileElement> appium = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabs);
			appium.get("https://mbasic.faccebook.com");
			appium.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			
			appium.findElement(By.id("m_login_email")).sendKeys("myemail@gmail.com");
			appium.findElement(By.name("pass")).sendKeys(decodePassword("u2hh"));
			appium.findElement(By.name("login")).click();
			
			Thread.sleep(10000);
			
			appium.quit();
	}
	
	public static String encodePassword(String pass) {
		return new String(Base64.encodeBase64(pass.getBytes()));
	}
	public static String decodePassword(String pass) {
		return new String(Base64.decodeBase64(pass.getBytes()));
	}

}
