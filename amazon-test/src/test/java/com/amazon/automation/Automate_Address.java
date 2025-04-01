package com.amazon.automation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Automate_Address extends BaseTest {
	 @Test
	    public void addAddress() {
	        driver.findElement(By.id("nav-link-accountList")).click();
	        driver.findElement(By.xpath("//span[text()='Your addresses']")).click();
	        driver.findElement(By.id("ya-myab-address-add-link")).click();

	        driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("John Doe");
	        driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("123 Test Street");
	        driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("New York");
	        driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion")).sendKeys("NY");
	        driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("10001");
	        driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("1234567890");

	        driver.findElement(By.id("address-ui-widgets-form-submit-button")).click();
	    }

}
