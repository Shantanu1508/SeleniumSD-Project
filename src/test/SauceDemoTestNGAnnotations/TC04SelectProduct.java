package SauceDemoTestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.SauceDemo.POMClass.HomePagePOMClass;


public class TC04SelectProduct extends BaseTestClass {
	
	HomePagePOMClass hm;
	
	@Test 
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
