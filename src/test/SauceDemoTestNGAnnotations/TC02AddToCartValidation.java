package SauceDemoTestNGAnnotations;

import org.testng.annotations.Test;
import java.io.IOException;


import org.testng.Assert;
import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.POMClass.LoginPagePOMClass;
import com.SauceDemo.POMClass.UtilityPOMClass;

public class TC02AddToCartValidation extends BaseTestClass{
	
	
	LoginPagePOMClass li;
	UtilityPOMClass utility;
	HomePagePOMClass  home;
	
	
		
	@Test 
	public void addToCart() throws InterruptedException, IOException {
		
		
	 home = new HomePagePOMClass(driver);	
			
	//To add any prodyct into the cart
	home.clickaddToCartBikeLight();
	
	System.out.println("Product is successfully added to the cart");
	
	UtilityPOMClass.screenshot(driver);
	
	//To validate add to cart test case	
	
	Assert.assertEquals("1", home.getCartText());
	
//	if(home.getCartText().equals("1")) {
//		
//		System.out.println("Add to cart test case is pass");
//		
//	}
//	else
//		System.out.println("Add to cart test case is fail");
	
	System.out.println("...............................................................................");
	
		
	}
	
	
	
	
}
