package SauceDemoTestNGAnnotations;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.SauceDemo.POMClass.HomePagePOMClass;

public class TC03FilterValidation extends BaseTestClass {
	
	
	HomePagePOMClass  home;
	
		
	@Test 
	public void filter() throws InterruptedException, IOException {
		
		
		home = new HomePagePOMClass(driver);
				
		home.FilterByLowToHigh();
				
		System.out.println(home.filterText());
		
		//To validate filter option		
		Assert.assertEquals("PRICE (LOW TO HIGH)", home.filterText());
		
		com.Utility.POMClass.UtilityPOMClass.screenshot(driver);
		
		System.out.println("...............................................................................");
	}
	
}
