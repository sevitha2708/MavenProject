package com.amdocs.mystore.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.PaymentPage;

public class PaymentPageTest extends BaseClass
{
	@BeforeMethod
	public void setUp()
	{
		launchApp();
	}
	
	@Test
	public void paymentTest() throws Throwable
	{
		CheckOutPageTest check = new CheckOutPageTest();
		check.checkOutTest();
		PaymentPage payment = new PaymentPage();
		payment.payment();
	}
}
