package SauceDemoTestNGAnnotations;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import com.SauceDemo.POMClass.HomePagePOMClass;

public class TC02AddToCartValidation extends BaseTestClass{
	
	
	HomePagePOMClass  home;
	
	
		
	@Test 
	public void addToCart() throws InterruptedException, IOException {
		
		
	 home = new HomePagePOMClass(driver);	
			
	//To add any product into the cart
	home.clickaddToCartBikeLight();
	
	System.out.println("Product is successfully added to the cart");
	
	//To validate add to cart test case	
	
	Assert.assertEquals("1", home.getCartText());
	
	com.Utility.POMClass.UtilityPOMClass.screenshot(driver);
	
	System.out.println("...............................................................................");
	
		
	}
	
	
	
	
}
