package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;


public class PaymentPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"payment-selection-fieldset\"]/div[4]/div[1]/label")
	WebElement selectPayment;
	
	@FindBy(xpath = "//*[@id=\"google-pay-button\"]/div/button/div/div[1]")
	WebElement paymentButton;
	
	public PaymentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void payment()
	{
		Action.click(driver, selectPayment);
		Action.click(driver, paymentButton);
	}
	
}
