package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass {
	
	private WebDriver driver;
	
	//To get Home page text
	public String homeTitle() {
		
		return driver.getTitle();
		
	}
	
	//To select and add to cat, Home page products
		@FindBy(xpath="//div[contains(@class,'inventory_details_name large_size')]")
		private WebElement productText;
		
		public String getProductText() {
				
			System.out.println("Name of the selectd product = "+productText.getText());
			
		return	productText.getText();
		}	

	//To select and add to cat, Home page products
	@FindBy(xpath="(//img[contains(@class,'inventory_item_img')])[1]")
	private WebElement Backpack;
	
	public void selectBackpack() {
		
		Backpack.click();
		
	}	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addToCartBackpack;
	
	public void clickaddToCartBackpack() {
		
		addToCartBackpack.click();
		
	}
	
	@FindBy(xpath="//img[contains(@class,'inventory_item_img')])[2]")
	private WebElement BikeLight;
	
	public void selectBikeLight() {
		
	BikeLight.click();
		
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement addToCartBikeLight;
	
	public void clickaddToCartBikeLight() {
		
		addToCartBikeLight.click();
		
	}
	
	@FindBy(xpath="//img[contains(@class,'inventory_item_img')])[3]")
	private WebElement BoltTshirt;
		
	public void selectBoltTshirt() {
		
		BoltTshirt.click();
			
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement addToCartBoltTshirt;
	
	public void clickaddToCartBoltTshirt() {
		
		addToCartBoltTshirt.click();
		
	}
	
	@FindBy(xpath="//img[contains(@class,'inventory_item_img')])[4]")
	private WebElement FleeceJacket;
	
	public void selectFleeceJacket() {
		
		FleeceJacket.click();
			
		}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[4]")
	private WebElement addToCartFleeceJacket;
	
	public void clickaddToCartFleeceJacket() {
		
		addToCartFleeceJacket.click();
		
	}
	
	@FindBy(xpath="//img[contains(@class,'inventory_item_img')])[5]")
	private WebElement Onesie;
	
	public void selectOnesie() {
		
	Onesie.click();
			
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[5]")
	private WebElement addToCartOnesie;
	
	public void clickaddToCartOnesie() {
		
		addToCartOnesie.click();
		
	}
	
	@FindBy(xpath="(//img[contains(@class,'inventory_item_img')])[6]")
	private WebElement TshirtRed;

	public void selectTshirtRed() {
		
		TshirtRed.click();
				
	}
	
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement backButton;
	
	public void backToProduct() {
		
		backButton.click();
		
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[6]")
	private WebElement addToCartTshirtRed;
	
	public void clickaddToCartTshirtRed() {
		
		addToCartTshirtRed.click();
		
	}
	
	
	//To handle Open Menu DropDown List
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement OpenMenu;
	
	public void dropDownOpenMenu() throws InterruptedException {
		
		Thread.sleep(2000);
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
	
	//To handle DropDown Filter List
	@FindBy(xpath="//select[@class='product_sort_container']")
	 WebElement Filter;
	 Select select;
	
	public void FilterByAtoZ() {
		
	select.selectByIndex(0);	
		
	}
	
	public void FilterByZtoA() {
		
		select.selectByIndex(1);	
			
		}
	
	public void FilterByLowToHigh() {
		
		select.selectByIndex(2);	
			
		}
	
	public void FilterByHighToLow() {
		
		select.selectByIndex(3);	
			
		}
	
	
	@FindBy(xpath="//span[@class='active_option']")
	WebElement filterText;
	public String filterText(){
		
		
		String text = filterText.getText();
		
		return text;
		
		
	}
	
	
	//To handle cart
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	private WebElement cart;
	private String CartNum;
	public void selectCart() {
		
		 cart.click();
	}
	
	public String getCartText() {
		
		CartNum =cart.getText();
		
		return CartNum;
	}
	
	
	
	public HomePagePOMClass(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		 select = new Select(Filter);
	}
	
}
