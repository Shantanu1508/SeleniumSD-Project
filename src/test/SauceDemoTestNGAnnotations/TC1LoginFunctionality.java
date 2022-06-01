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
		
//		if(actualTitle.equals(driver.getTitle()))
//		{
//			System.out.println("Login test case is pass");
//		}
//		else
//			System.out.println("Login test case is failed");
		
		System.out.println("...............................................................................");
			
	}
			
}
