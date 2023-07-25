package com.amdocs.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.IndexPage;
import com.amdocs.mystore.pageobjects.LoginPage;

public class LoginPageTest extends BaseClass 
{
	IndexPage indexPage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	@Test
	public void loginTest() throws Throwable
	{
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		loginPage.login(property.getProperty("username"),property.getProperty("password"));
	}
}
