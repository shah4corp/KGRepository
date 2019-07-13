package com.klougin.mobile.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeMakemyTrip {
	private static final Logger log = Logger.getLogger(ChromeMakemyTrip.class);
@Test
public void chromeTransactions() throws MalformedURLException, InterruptedException {
	 PropertyConfigurator.configure(System.getProperty("user.dir") + "\\capabilities&files\\log4j.properties");
    
	  log.debug("This is debug message");
	  log.info("**** INITIALIZING CAPABILITIES ***********");	  DesiredCapabilities capabs = new DesiredCapabilities();
	  capabs.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	  log.info(" DEVICE_NAME = Android Emulator");
	  capabs.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
	  log.info(" PLATFORM_VERSION = 9.0");
	  capabs.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  log.info(" PLATFORM_NAME = Android");
	  capabs.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
	  log.info(" APP_PACKAGE = com.android.chrome");
	  capabs.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
	  log.info(" APP_ACTIVITY = com.google.android.apps.chrome.Main");
      capabs.setCapability("noReset", true);
		
		AndroidDriver<MobileElement> appium = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabs);
		log.info("******** INITIATING IOS DRIVER ****************");
		log.info(" HOST: 0.0.0.0");
	    log.info(" PORT: 4723");
		log.info(" URL : http://0.0.0.0:4723/wd/hub");
		appium.get("https://m.makemytrip.com");
		log.info("Loading URL on chrome browser as : https://www.yatra.com/pwa/home.html?redirect=no");
		appium.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		log.info("Waiting to load the URL");

		
		Thread.sleep(10000);

		
//		System.out.println("*****Current view ****** : " + appium.getContext());		
//		Set<String> views = appium.getContextHandles();
//		for(String view : views){
//			if(view.contains("WEBVIEW"))
//			{
//				appium.context(view);
//				break;
//			}
//		}
//		System.out.println(" view : " + appium.getContext());
//		appium.findElement(By.xpath("//span[text()='Flights']")).click();
//        
//		Thread.sleep(10000);
}	

}
