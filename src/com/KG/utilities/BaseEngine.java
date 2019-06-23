package com.KG.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseEngine{
	
	private AndroidDriver<MobileElement> appium = null;
    
@org.testng.annotations.BeforeClass	
	public void launchApp() throws MalformedURLException{
		
	DesiredCapabilities capabs = new DesiredCapabilities();
	capabs.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	capabs.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
	capabs.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	capabs.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\Apps\\KloudGin_v19.2.apk");
		
		appium = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabs);
		appium.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
public AndroidDriver<MobileElement> getAppium() {
	return appium;
}

@AfterClass
   public void AfterClass(){
    	appium.quit();
}
@BeforeMethod
public void beforeMethod(Method m) {
     System.out.println("Executing the test case : " +m.getName());	
}

@AfterMethod
public void afterMethod(ITestResult result) throws IOException {
     if(ITestResult.FAILURE==result.getStatus()){
    	 TakesScreenshot ts = (TakesScreenshot)appium;
    	 File file = ts.getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(file, new File("D:\\KloudGin.jpeg"));   	 
     }
}

}