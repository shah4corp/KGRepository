package com.KG.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtility 
{
	private static WebDriver driver;
	static public void openBrowser(String browser) 
	{
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\shahnawazm\\workspace\\MobileTest\\Drivers\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahnawazm\\workspace\\MobileTest\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\shahnawazm\\workspace\\MobileTest\\Drivers\\IEDriverServer.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		}
        
	}
	public static WebDriver getDriver() {
		return driver;
	}

}
