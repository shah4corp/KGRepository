package com.klougin.mobile.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeMakemyTrip {
@Test
public void chromeTransactions() throws MalformedURLException, InterruptedException {
	DesiredCapabilities capabs = new DesiredCapabilities();
	capabs.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	capabs.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
	capabs.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	capabs.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
	capabs.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
    capabs.setCapability("noReset", true);
		
		AndroidDriver<MobileElement> appium = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabs);
		appium.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		appium.get("https://m.makemytrip.com");
		
		Thread.sleep(10000);

		
		System.out.println("*****Current view ****** : " + appium.getContext());		
		Set<String> views = appium.getContextHandles();
		for(String view : views){
			if(view.contains("WEBVIEW"))
			{
				appium.context(view);
				break;
			}
		}
		System.out.println(" view : " + appium.getContext());
		appium.findElement(By.xpath("//span[text()='Flights']")).click();
        
		Thread.sleep(10000);
}	

}
