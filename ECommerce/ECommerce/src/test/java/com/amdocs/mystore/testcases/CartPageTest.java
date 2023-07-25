package com.amdocs.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.CartPage;

public class CartPageTest extends BaseClass 
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
	public void addProduct() throws Throwable
	{
		ProductPageTest product = new ProductPageTest();
		product.selectProduct();
		//Action.launchNewWindow(BaseClass.driver);
		CartPage cart = new CartPage();
		cart.addProduct();
	}
}
