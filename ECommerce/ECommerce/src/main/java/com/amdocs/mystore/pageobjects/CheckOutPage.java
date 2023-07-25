package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class CheckOutPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[2]/div[2]/div/div[1]/button")
	WebElement checkOut;
	
	public CheckOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkOut()
	{
		Action.click(driver, checkOut);
	}
}
