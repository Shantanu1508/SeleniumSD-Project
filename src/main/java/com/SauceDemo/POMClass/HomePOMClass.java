package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass {
	
	private WebDriver driver;
	
public HomePOMClass(WebDriver driver) {
	  
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	  select = new Select(Filter);
	  
}
	
	

	//To select and add to cat, Home page products
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement addToCartBikeLight;
	
	public void clickaddToCartBikeLight() {
		
		addToCartBikeLight.click();
	}
	
	//To handle cart
		@FindBy(xpath="//div[@id='shopping_cart_container']")
		private WebElement cart;
		private String CartNum;
		public void selectCart() {
			
			 cart.click();
		}
		
		//To handle Open Menu DropDown List
		@FindBy(xpath="//button[text()='Open Menu']")
		private WebElement OpenMenu;
		
		public void dropDownOpenMenu() {
			
			OpenMenu.click();
			
		}
		
		@FindBy(xpath="(//a[@class='bm-item menu-item'])[1]")
		private WebElement AllItem;
		
		public void dropDownAllItem() {
			
			AllItem.click();
			
		}
		
		@FindBy(xpath="(//a[@class='bm-item menu-item'])[2]")
		private WebElement About;
		
		public void dropDownAbout() {
			
			About.click();
			
		}
		
		@FindBy(xpath="(//a[@class='bm-item menu-item'])[3]")
		private WebElement Logout;
		
		public void dropDownLogout() {
			
			Logout.click();
			
		}
		
		@FindBy(xpath="(//a[@class='bm-item menu-item'])[4]")
		private WebElement ResetAppState;
		
		public void dropDownResetAppState() {
			
			ResetAppState.click();
			
		}
	
	public String getCartText() {
		
		CartNum =cart.getText();
		
		return CartNum;
	
	}
	
		//To handle DropDown Filter List
		@FindBy(xpath="//select[@class='product_sort_container']")
		WebElement Filter;
		Select select;
		
		public void FilterByAtoZ() {
			
		select.selectByVisibleText("Name (A to Z)");	
			
		}
		
		public void FilterByZtoA() {
			
			select.selectByVisibleText("Name (Z to A)");		
				
			}
		
		public void FilterByLowToHigh() {
			
			
			select.selectByVisibleText("Price (low to high)");		
				
			}
		
		public void FilterByHighToLow() {
			
			select.selectByVisibleText("Price (high to low)");		
				
			}
	
	

}
	
	
