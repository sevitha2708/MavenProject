package com.amdocs.mystore.base;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.model.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public static Properties property;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig()
	{
		try
		{
			property = new Properties();
			System.out.println("super constructor invoked");
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
			property.load(ip);
			//launchApp();
			System.out.println("driver :" +driver);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public static void launchApp()
	{
		WebDriverManager.chromedriver().setup();
		String browserName = property.getProperty("browser");
		if(browserName.contains("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.contains("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.contains("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(property.getProperty("implicitWait")), TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(property.getProperty("pageLoadTimeOut")), TimeUnit.SECONDS);
		driver.get(property.getProperty("url"));
	}
//	@AfterSuite(groups = { "Smoke", "Regression","Sanity" })
//	public void afterSuite() {
//		//ExtentManager.endReport();
//	}
//	
	
	
	
}
