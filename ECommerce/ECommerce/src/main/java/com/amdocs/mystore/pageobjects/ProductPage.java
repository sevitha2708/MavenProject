package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class ProductPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"item4df8be3ad3\"]/div/div[2]/a/div/span ")
	WebElement selectProduct;
	@FindBy(xpath = "//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a")
	WebElement Movetoelement;
	
	
	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public CartPage selectItem()
	{
		Action.click(driver, selectProduct);
		Action.launchNewWindow(BaseClass.driver);
		return new CartPage();
	}
	
}
