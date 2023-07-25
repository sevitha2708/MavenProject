package com.amdocs.mystore.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;
public class SearchResultPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"gh-ac\"]")
	WebElement search;
	
	@FindBy(xpath = "//*[@id=\"gh-btn\"]")
	WebElement searchButton;
	
	public SearchResultPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct(String search1)
	{
		System.out.println("Inside searchProduct ... before type");
		Action.type(search, search1);
		System.out.println("Inside searchProduct ... before click");
		Action.click(driver, searchButton);
		//Action.scrollByVisibilityOfElement(driver, search);
	}
	
}
