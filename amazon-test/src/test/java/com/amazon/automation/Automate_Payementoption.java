package com.amazon.automation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Automate_Payementoption extends BaseTest {
	  @Test(priority = 1)
	    public void addPaymentMethod() {
	        // Navigate to account section
	        driver.findElement(By.id("nav-link-accountList")).click();

	        // Click on "Your Payments"
	        driver.findElement(By.xpath("//span[text()='Your Payments']")).click();

	        // Click on "Add a payment method"
	        driver.findElement(By.xpath("//span[text()='Add a payment method']")).click();

	        // Select "Credit or debit card"
	        driver.findElement(By.xpath("//span[text()='Credit or debit card']")).click();

	        // Enter Card Details
	        driver.findElement(By.id("pp-QW6LGS-18")).sendKeys("4111111111111111"); // Dummy Visa Card Number
	        driver.findElement(By.id("pp-QW6LGS-22")).sendKeys("John Doe"); // Cardholder Name
	        driver.findElement(By.id("pp-QW6LGS-24")).sendKeys("12"); // Expiry Month
	        driver.findElement(By.id("pp-QW6LGS-26")).sendKeys("2025"); // Expiry Year
	        driver.findElement(By.id("pp-QW6LGS-28")).sendKeys("123"); // CVV Code

	        // Click Save
	        driver.findElement(By.xpath("//span[text()='Add your card']")).click();
	    }

	    @Test(priority = 2)
	    public void selectPaymentAtCheckout() {
	        // Proceed to checkout
	        driver.findElement(By.id("nav-cart")).click();
	        driver.findElement(By.name("proceedToRetailCheckout")).click();

	        // Select the saved credit card
	        driver.findElement(By.xpath("//span[contains(text(),'Use this payment method')]")).click();
	    }

}
