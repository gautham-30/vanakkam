package com.amazon.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
public class Search_Add_To_Cart extends BaseTest{
	@Test(priority = 1)
    public void searchProduct() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop" + Keys.ENTER);
	}

    @Test(priority = 2)
    public void addProductsToCart() {
        String[] categories = {"Laptops", "Mobile Phones", "Watches", "Headphones"};

        for (String category : categories) {
            driver.findElement(By.id("twotabsearchtextbox")).clear();
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(category + Keys.ENTER);

            List<WebElement> products = driver.findElements(By.cssSelector(".s-main-slot div[data-index] h2 a"));

            if (!products.isEmpty()) {
                products.get(0).click();
                driver.findElement(By.id("add-to-cart-button")).click();
                driver.navigate().back();
                driver.navigate().back();
            }

}}}
