package com.amazon.automation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Automate_Checkout_Review extends BaseTest{
	 @Test(priority = 1)
	    public void proceedToCheckout() {
	        driver.findElement(By.id("nav-cart")).click();
	        driver.findElement(By.name("proceedToRetailCheckout")).click();
	    }

	    @Test(priority = 2)
	    public void reviewProduct() {
	        driver.findElement(By.xpath("//span[text()='Write a review']")).click();
	        driver.findElement(By.id("review-textarea")).sendKeys("Great product! Highly recommend.");
	        driver.findElement(By.id("submit-review-button")).click();
	    }

}
