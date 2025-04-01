package com.amazon.automation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ForgotPassword extends BaseTest {
	  @Test
	    public void testForgotPassword() {
	        driver.findElement(By.id("nav-link-accountList")).click();
	        driver.findElement(By.id("ap_email")).sendKeys("your-email@example.com");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("auth-fpp-link-bottom")).click();
	        driver.findElement(By.id("ap_email")).sendKeys("your-email@example.com");
	        driver.findElement(By.id("continue")).click();
	    }

}
