package com.amazon.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 protected static WebDriver driver;

	    public static void setup() {
	        WebDriverManager.chromedriver().setup(); // Auto-download ChromeDriver
	        driver = new ChromeDriver(); // Launch Chrome browser
	        driver.manage().window().maximize(); // Maximize window
	        driver.get("https://www.amazon.com/"); // Open Amazon
	    }

	    public static void teardown() {
	        if (driver != null) {
	            driver.quit(); // Close browser
	        }
	    }
}
