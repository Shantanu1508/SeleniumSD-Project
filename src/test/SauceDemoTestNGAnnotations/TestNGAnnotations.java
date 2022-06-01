package SauceDemoTestNGAnnotations;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.POMClass.LoginPagePOMClass;
import com.SauceDemo.POMClass.UtilityPOMClass;

public class TestNGAnnotations  {
	
	private WebDriver driver;
	private static TakesScreenshot ts;
	private static File source, destination;
	private static String title, date, loginData[];
	private static Date dt;
	
	HomePagePOMClass hm;
	LoginPagePOMClass li;
	UtilityPOMClass utility;

	
	
	@BeforeSuite
	public void seetup() {
		
		System.out.println("Before suit");
		System.setProperty("webdriver.chrome.driver","D:\\JAVA Materials\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	@BeforeTest
	public void setDriver() {
		
		System.out.println("Before Test");	
		driver =  new ChromeDriver();	
		utility = new UtilityPOMClass();
		 driver = utility.setBrowserDriver();
		
		
		
	}
	
	@BeforeClass
	public void openBrowser() {
		
		System.out.println("Before Class");
		driver.get("https://www.saucedemo.com/");
		
		
		System.out.println("Login Page object is created");
	}
	
	@BeforeMethod
	public void logineMethod() throws IOException, InterruptedException {
			
		
		System.out.println("Before Method");
		//To open browser
				
				 //To Login SauceDemo
				 UtilityPOMClass.loginMethod();
		
		//To take screenshot of Home page
		UtilityPOMClass.screenshot();
	}
	
	@Test
	public void HemBurger() throws InterruptedException {
		
		System.out.println("Test");
		hm = new HomePagePOMClass(driver);
		hm.dropDownOpenMenu();
		
	}
	
	
	
	@AfterMethod
	public void logout() {
		
		
		System.out.println("After Method");
		
		hm.dropDownLogout();
				
	}
	
	@AfterClass
	public void closeBrowser() {
		
		System.out.println("After Class");
		driver.quit();
		
	}
	
	@AfterTest
	public void finalizeMethod() throws Throwable {
	
		System.out.println("After Test");
	finalize();
		
	}
	
	@AfterSuite
	public void programEnd() {
		
		System.out.println("Program is ended");
		
	}
	
	

}
