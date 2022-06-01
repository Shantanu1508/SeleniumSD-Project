package com.SauceDemo.POMClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuySauceDemoProduct extends SauceDemoLogin {

	WebElement checkout;
	String CheckoutTitle;
	BuySauceDemoProduct() throws InterruptedException {
		super();
		
		
	}
	
	public void buyProduct() throws InterruptedException {
		

		//To select any product
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
		System.out.println("Product is selected");
		Thread.sleep(1000);
		
		//To add to cart
		driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-sauce-labs-backpack')]")).click();
		System.out.println("Product is added to the cart");
		Thread.sleep(1000);
		
		// To get no. of products in cart
		String count = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
		System.out.println("no. of products in cart = "+count);
					
		//To verify product successfully added to cart or not
		if(count.equals("1")) {
			
		System.out.println("element is succefully added to the cart. Hence test case is pass");	
		}
		else
			System.out.println("Product is didn't add to the cart. Hence is failed");
		}
	
	public void checkoutProduct() throws InterruptedException {
		
				//To open the cart
				driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]")).click();
				System.out.println("cart is open");
				Thread.sleep(2000);
				
				//To check out the product
				driver.findElement(By.xpath("//button[contains(@id,'checkout')]")).click();
				System.out.println("selected product is checked out");
				Thread.sleep(2000);
				
				//To fill checkout information
				driver.findElement(By.xpath("//input[contains(@id,'first-name')]")).sendKeys("Shantanu");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[contains(@id,'last-name')]")).sendKeys("Sharma");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[contains(@id,'postal-code')]")).sendKeys("452001");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
				System.out.println("Check out information is filled");
				Thread.sleep(1000);
				
				//To fish your Order process
				checkout = driver.findElement(By.xpath("//button[contains(@id,'finish')]"));
				CheckoutTitle= checkout.getText();
				checkout.click();
				
				
				//To verify product successfully checkout or not
				if(CheckoutTitle.equals("FINISH")) {
					
					System.out.println("Product checkout test case is pass");
					
				}
				else
					
					System.out.println("Product checkout test case is failed");

		
	}

	public static void main(String[] args) throws InterruptedException {

		BuySauceDemoProductDOMClass buy = new BuySauceDemoProductDOMClass();
		
		buy.buyProduct();
		
		buy.checkoutProduct();

	}

}
