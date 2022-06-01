package SauceDemoTestNGAnnotations;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.POMClass.UtilityPOMClass;

public class SauceDemoRegressionSuit extends BaseTestClass {
	
	@Test 
	public void loginFunction() throws InterruptedException, IOException {
		
		System.out.println("Test class");	
		//To validate login functionality
		String expected = "Swag Labs";
					
		Assert.assertEquals(expected, driver.getTitle());
				
		System.out.println("...............................................................................");
			
	}
	
	HomePagePOMClass  home;
	
	@Test (dependsOnMethods={"loginFunction"}, priority =3)
	public void addToCart() throws InterruptedException, IOException {
		
		
	 home = new HomePagePOMClass(driver);	
			
	//To add any product into the cart
	home.clickaddToCartBikeLight();
	
	System.out.println("Product is successfully added to the cart");
	
	UtilityPOMClass.screenshot(driver);
	
	//To validate add to cart test case	
	
	Assert.assertEquals("1", home.getCartText());
	
	System.out.println("...............................................................................");
	
		
	}
	
	@Test (priority =1)
	public void filter() {
		
		home = new HomePagePOMClass(driver);
				
		home.FilterByLowToHigh();
				
		System.out.println(home.filterText());
		
		//To validate filter option		
		Assert.assertEquals("PRICE (LOW TO HIGH)", home.filterText());
				
		System.out.println("...............................................................................");
	}
	
	@Test (priority=2)
	public void selectProduct() throws InterruptedException	{
		
		System.out.println("Test class");
		hm = new HomePagePOMClass(driver);
		hm.selectTshirtRed();
		Thread.sleep(3000);
		
		Assert.assertEquals(hm.getProductText(), "Test.allTheThings() T-Shirt (Red)");
		
		hm.backToProduct();
		
		System.out.println("Product is successfully selected");
		
		System.out.println("...............................................................................");
	}

}
