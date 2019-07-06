package com.klougin.mobile.app;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
public class YatraWithLog4j {

	private static final Logger log = Logger.getLogger(YatraWithLog4j.class);
	 
	 @Test
	 public void testYatraTest() throws MalformedURLException, InterruptedException {

	  DOMConfigurator.configure(System.getProperty("user.dir") + "\\capabilities&files\\log4j.properties");
	  
	  log.debug("This is debug message");
	  log.info("**** INITIALIZING CAPABILITIES ***********");
	  DesiredCapabilities capabs = new DesiredCapabilities();
	    capabs.setCapability(MobileCapabilityType.AUTOMATION_NAME, "ChromeMakemyTrip");
	  log.info(" AUTOMATION_NAME = ChromeMakemyTrip");
    	capabs.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  log.info(" PLATFORM_NAME = Android");
		capabs.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	  log.info(" DEVICE_NAME = Android Emulator");
		capabs.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
	  log.info(" PLATFORM_VERSION = 9.0");
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
	  
	  appium.get("https://www.yatra.com/pwa/home.html?redirect=no");
	  log.info("Loading URL on chrome browser as : https://www.yatra.com/pwa/home.html?redirect=no");
	  appium.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  log.info("Waiting to load the URL");
	  
	  appium.findElement(By.xpath("//span[text()='Flights']")).click();
	  log.info("Clicked on 'Flights' option.");
	  
	  log.info("Waiting for 10 seconds");
	  Thread.sleep(10000);
	  
	  appium.quit();
	  log.info("Quit driver");
	  
	 }
	 
	}
