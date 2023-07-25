package com.amdocs.mystore.testcases;

import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.IndexPage;
import com.amdocs.mystore.pageobjects.RegistrationPage;

public class RegistrationPageTest extends BaseClass
{
	IndexPage indexPage;
	RegistrationPage registrationPage;
	
//	@BeforeMethod
//	public void setup()
//	{
//		launchApp();
//	}
//	
//	@AfterMethod
//	public void tearDown()
//	{
//		//driver.quit();
//	}
	
	@Test
	public void loginTest() throws Throwable
	{
		launchApp();
		indexPage = new IndexPage();
		registrationPage = indexPage.clickOnRegister();
		registrationPage.register(property.getProperty("firstname"), property.getProperty("lastname"), property.getProperty("email"),property.getProperty("password1"));
	}
}
