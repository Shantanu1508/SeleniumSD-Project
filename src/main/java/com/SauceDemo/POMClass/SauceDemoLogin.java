package com.SauceDemo.POMClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {
		
	static WebDriver driver;
	WebElement userName;
	
	//To check login test case
			String title;
			String actual_title;
			String url;
			String actual_url;
						
			FileInputStream file;
			HSSFWorkbook book;
			String loginData[];
			
			Date dt;
			DateFormat d;
			String date;
			TakesScreenshot ts;
			File source;
			File destinetion;
			
			static {
				
				System.setProperty("webdriver.chrome.driver","D:\\JAVA Materials\\chromedriver_win32\\chromedriver.exe");
				driver =  new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				System.out.println("Browser is open successfully");
				
			}
			
	public void Parameterization() throws FileNotFoundException {
		
	file = new FileInputStream("D:\\Java Testing Project\\Java Screenshots\\SauceDemo\\Page"+date+".jpg");	
	
	}
			
	SauceDemoLogin() throws InterruptedException{
		
		//Date formate creation
		dt = new Date();
		d = new SimpleDateFormat("MM-dd-yy && HH-mm-ss");
		date = d.format(dt);
		
		//To call login method
		this.login();
		
		//To check login test case
				title = "Swag Labs";
				actual_title = driver.getTitle();
				url = "https://www.saucedemo.com/inventory.html";
				actual_url= driver.getCurrentUrl();
				
		//To verify login test case
		if(url.equals(actual_url)&&title.equals(actual_title)){
			
			System.out.println("URL = "+actual_url);
			System.out.println("Title"+actual_title);
			System.out.println("Login Successfully");
			System.out.println("Login test case is pass");
					
					
		}else
		
			System.out.println("Login test case is fail");
					
		}
	
	public void login() throws InterruptedException {
		
		
		
		
		//webElement is the method of of WebDriver, it returns webElement so that we need to store it in WebElemt ref variable
				userName= driver.findElement(By.id("user-name"));
				userName.sendKeys("standard_user");
				System.out.println("User name is entered");
				Thread.sleep(1000);
				
				// for password element
				WebElement password= driver.findElement(By.id("password"));
				password.sendKeys("secret_sauce");
				System.out.println("Password is entered");
				Thread.sleep(1000);
						
				//Login Button
				WebElement loginButton= driver.findElement(By.id("login-button"));
				loginButton.click();
				Thread.sleep(1000);
									
	}

	public static void main(String[] args) throws InterruptedException {
						
		SauceDemoLogin sDemo = new SauceDemoLogin();
				
	}		
}
