package com.SauceDemo.POMClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SetDriverPOMClass {
	private static WebDriver driver;
	private static TakesScreenshot ts;
	private static File source, destination;
	private static String title, date, loginData[];
	private static Date dt;
	private static FileInputStream file;
	private static HSSFWorkbook book;
	
	public WebDriver setBrowserDriver() {
	
		
		System.setProperty("webdriver.chrome.driver","D:\\JAVA Materials\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is open");
		driver.manage().window().maximize();
		System.out.println("Browser is open successfully");
		
		return driver;
	}
	
	public static void screenshot() throws InterruptedException, IOException {
				
		Thread.sleep(5000);
		dt = new Date();
		date = new SimpleDateFormat("MM-dd-yy & HH-mm-ss").format(dt);
		
		//To get Title of the current page		
		  title = driver.getTitle();
		 
		 ts = (TakesScreenshot)driver;
		 source = ts.getScreenshotAs(OutputType.FILE);
		 destination = new File("D:\\Java Testing Project\\Java Screenshots\\SauceDemo");
		 FileHandler.copy(source, destination);
		
		System.out.println("Screenshot if taken from "+title+" page");
		System.out.println(title);
	}
	
	public static String[] parameterization() throws FileNotFoundException {
		
		file = new FileInputStream("D:\\\\Java Testing Project\\\\Excel Sheet Project\\\\Java Excel Sheet.xlsx");
		loginData[0]=book.getSheet("Java Excel").getRow(2).getCell(4).getStringCellValue();
		loginData[1]=book.getSheet("Java Excel").getRow(3).getCell(4).getStringCellValue();
		
		return loginData;
	}

}
