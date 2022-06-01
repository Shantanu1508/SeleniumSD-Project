package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePagePOMClass {
	
	private WebDriver driver;
	
	//To fill checkout information
		@FindBy(xpath="//input[contains(@id,'back-to-products')]")
		private WebElement BackHome;
		
		public void clickBackHome() {
			
			BackHome.click();
			
		}
		
		public CheckoutCompletePagePOMClass(WebDriver driver) {
			
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}

}
