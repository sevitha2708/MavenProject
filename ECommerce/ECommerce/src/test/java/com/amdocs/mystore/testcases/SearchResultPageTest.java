package com.amdocs.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.IndexPage;
import com.amdocs.mystore.pageobjects.LoginPage;
import com.amdocs.mystore.pageobjects.SearchResultPage;

public class SearchResultPageTest extends BaseClass
{	
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
	public void searchProducts() throws Throwable 
	{
		LoginPageTest login = new LoginPageTest();
		login.loginTest();
		SearchResultPage search = new SearchResultPage();
		search.searchProduct(property.getProperty("searchproduct"));
		
	}
}
