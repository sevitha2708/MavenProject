package com.amdocs.mystore.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class CartPage extends BaseClass
{
//	@FindBy(xpath = "//*[@id=\"x-msku__select-box-1000\"]")
//	WebElement selectColor;
//	
//	@FindBy(xpath = "//*[@id=\"x-msku__select-box-1001\"]")
//	WebElement selectSize;
//	
	@FindBy(xpath = "//*[@id=\"binBtn_btn_1\"]")
WebElement addItem;
	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a")
	WebElement viewCart;
	
	public static Select getSelect(WebElement element)
	{
		Select select = new Select(element);
		return select;
	}
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public OrderPage addProduct() throws Throwable
	{
	
		//Action.submit(selectColor);
		//Action.submit(selectColor);
		
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(property.getProperty("implicitWait")), TimeUnit.SECONDS);
		//getSelect(selectColor).selectByVisibleText(property.getProperty("color"));
		//Action.submit(selectSize);
		//getSelect(selectSize).selectByVisibleText(property.getProperty("size"));
		
		Action.submit(addItem);
		return new OrderPage();
		
	}
}
