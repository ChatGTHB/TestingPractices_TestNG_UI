package _14_TestNG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.GenelBaseDriver;

public class testNG_1_Task extends GenelBaseDriver {
    @Test
    public   void loginTest(){

        // URL adresini acmak icin
        driver.get("https://www.saucedemo.com/");

        // Browserin buyuk pencerede acilmasi icin
        driver.manage().window().maximize();

        // Login Islemi
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

    }
    @Test(dependsOnMethods="loginTest")
    public void addToCartTest(){
        WebElement product_1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        product_1.click();

//        WebElement product_2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
//        product_2.click();

        WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));
        shoppingCart.click();

    }
}
