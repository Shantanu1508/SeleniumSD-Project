package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewPagePOMClass {
	
	private WebDriver driver;
	
	//To clock on finish button
	@FindBy(xpath="//input[contains(@id,'finish')]")
	private WebElement Finish;
	
	public void clickFinish() {
		
		Finish.click();
		
	}
	
	//To click on cancel button
		@FindBy(xpath="//input[contains(@id,'cancel')]")
		private WebElement cancel;
		
		public void clickCancel() {
			
			cancel.click();
			
		}
		
public CheckOutOverViewPagePOMClass(WebDriver driver) {
			
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}

}
