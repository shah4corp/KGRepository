package com.KG.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseEngine {
	private AndroidDriver<MobileElement> appium = null;
    @org.testng.annotations.BeforeClass	
	public void BeforeClass() throws MalformedURLException{
		DesiredCapabilities capabs = new DesiredCapabilities();
		capabs.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabs.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
		capabs.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabs.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\Apps\\ApiDemos-debug.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		appium = new AndroidDriver<MobileElement>(url,capabs);
		appium.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
public AndroidDriver<MobileElement> getAppium() {
	return appium;
}

@AfterClass
public void AfterClass(){
	appium.quit();
}
}