package com.amdocs.mystore.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.CheckOutPage;

public class CheckOutPageTest extends BaseClass
{
	@BeforeMethod
	public void setUp()
	{
		launchApp();
	}
	
	@Test
	public void checkOutTest() throws Throwable
	{
		CartPageTest test = new CartPageTest();
		test.addProduct();
		CheckOutPage checkOut = new CheckOutPage();
		checkOut.checkOut();
	}
}
