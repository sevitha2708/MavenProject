package com.amdocs.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.ProductPage;
import com.amdocs.mystore.pageobjects.SearchResultPage;

public class ProductPageTest extends BaseClass
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
	public void selectProduct() throws Throwable
	{
		SearchResultPageTest product = new SearchResultPageTest();
		product.searchProducts();
		ProductPage item = new ProductPage();
		item.selectItem();
	}
}
