package SauceDemoTestNGAnnotations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.POMClass.LoginPagePOMClass;

@Listeners(com.Utility.POMClass.Listener.class)
public class BaseTestClass {
	
	Logger log = Logger.getLogger("SauceDemoProject12FebBatchv1");
	
	public WebDriver driver;
	HomePagePOMClass hm;
	LoginPagePOMClass li;
	com.Utility.POMClass.UtilityPOMClass utility;
	String[] loginData;
	

	
	@BeforeClass
	public void setBrowser() throws InterruptedException, IOException {
		
		System.out.println("Before suit");
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		log.info("browser is open");
		System.out.println("Before Test");
		driver =  new ChromeDriver();
		
		PropertyConfigurator.configure("log4j.properties");
		System.out.println("Before Class");
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("URL is open");
		log.info("Browser is open");
		driver.manage().window().maximize();
		System.out.println("Browser is open successfully");
		com.Utility.POMClass.UtilityPOMClass.screenshot(driver);
		
	}
	
	@BeforeMethod
	public void logineMethod() throws IOException, InterruptedException {
			
		System.out.println("Before Method");
			 		 		 
			//To enter user name
		 	li = new LoginPagePOMClass(driver);
			li.sendUsername();
			log.info("username is enterd");
			
			
			//To enter password
			li.sendPassword();
			log.info("password is enterd");
			
			

			//To click login button
			li.clickLoginButton();
			log.info("login button is pressed");
			
			//To take screenshot of Home page
			com.Utility.POMClass.UtilityPOMClass.screenshot(driver);
	}

	
	@AfterMethod
	public void logout() throws InterruptedException {
		
		
		System.out.println("After Method");
		hm = new HomePagePOMClass(driver);
		hm.dropDownOpenMenu();
		Thread.sleep(2000);
		hm.dropDownLogout();
				
	}
	
	@SuppressWarnings("deprecation")
	@AfterClass
	public void closeBrowser() throws Throwable {
		
		System.out.println("After Class");
		driver.quit();
		
		System.out.println("After Test");
		finalize();
		
	}
	

	

}
