package SauceDemoTestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class TC1LoginFunctionality extends BaseTestClass {
			
	@Test 
	public void loginFunction() throws InterruptedException, IOException {
		
		System.out.println("Test class");	
		//To validate login functionality
		String expected = "Swag Labs";
					
		Assert.assertEquals(expected, driver.getTitle());
		
		//com.Utility.POMClass.UtilityPOMClass.screenshot(driver);
		
		log.info("Successfully Login");
		System.out.println("...............................................................................");
			
	}
			
}
