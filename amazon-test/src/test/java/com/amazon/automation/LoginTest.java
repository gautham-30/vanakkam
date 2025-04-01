package com.amazon.automation;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	  @Test(priority = 1)
	    public void testLogin() {
	        driver.findElement(By.id("nav-link-accountList")).click();
	        driver.findElement(By.id("ap_email")).sendKeys("your-email@example.com");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("ap_password")).sendKeys("yourpassword");
	        driver.findElement(By.id("signInSubmit")).click();

	        String accountText = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	        Assert.assertTrue(accountText.contains("Hello"), "Login failed!");
	    }

	    @Test(priority = 2)
	    public void testLogout() {
	        driver.findElement(By.id("nav-link-accountList")).click();
	        driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
	    }
	
	   
}
