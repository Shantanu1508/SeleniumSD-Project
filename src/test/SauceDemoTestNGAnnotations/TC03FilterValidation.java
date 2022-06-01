package SauceDemoTestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.POMClass.LoginPagePOMClass;
import com.SauceDemo.POMClass.UtilityPOMClass;

public class TC03FilterValidation extends BaseTestClass {
	
	
	LoginPagePOMClass li;
	UtilityPOMClass utility;
	HomePagePOMClass  home;
		
	@Test 
	public void filter() {
		
		home = new HomePagePOMClass(driver);
				
		home.FilterByLowToHigh();
				
		System.out.println(home.filterText());
		
		//To validate filter option		
		Assert.assertEquals("PRICE (LOW TO HIGH)", home.filterText());
		
//		if (home.filterText().equals("PRICE (LOW TO HIGH)")) {
//			
//			System.out.println("filter test case is pass");
//		}
//		else
//			System.out.println("Filter test case is fail");
		
		System.out.println("...............................................................................");
	}
	
}
