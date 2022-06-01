package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass {
	
	private WebDriver driver;
	
	//To select continue_shopping button
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continue_shopping;
	
	public void selectContinue_shopping(){
		
		continue_shopping.click();
		
	}
	
	//To checkout the selected product
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	public void selectCheckout(){
		
		checkout.click();
		
	}
	
public CartPagePOMClass(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

}
