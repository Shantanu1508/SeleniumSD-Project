package com.SauceDemo.POMClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPagePOMClass {

	private WebDriver driver;
	
	//To fill checkout information
	@FindBy(xpath="//input[contains(@id,'first-name')]")
	private WebElement FirstName;
	
	public void FillFirstName() {
		
		FirstName.sendKeys("Shantanu");
		
	}
	
	@FindBy(xpath="//input[contains(@id,'last-name')]")
	private WebElement LastName;
	
	public void LastName() {
		
		LastName.sendKeys("Sharma");
		
	}
	
	
	@FindBy(xpath="//input[contains(@id,'postal-code')]")
	private WebElement PostalCode;
	
	public void fillPostalCode() {
		
		PostalCode.sendKeys("452001");
		
	}
	
	//To click Continue button
	@FindBy(xpath="//input[contains(@id,'continue')]")
	private WebElement Continue;
	
	public void clickContinue() {
		
		Continue.click();
		
	}
	
	//To click on cancel button
		@FindBy(xpath="//input[contains(@id,'cancel')]")
		private WebElement cancel;
		
		public void clickCancel() {
			
			cancel.click();
			
		}
		
public CheckOutPagePOMClass(WebDriver driver) {
			
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
	
}
