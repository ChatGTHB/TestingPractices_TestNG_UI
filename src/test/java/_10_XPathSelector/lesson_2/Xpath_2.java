package _10_XPathSelector.lesson_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;

public class Xpath_2 extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://demo.nopcommerce.com/");

        WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
        login.click();
        WebElement email = driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input"));
        email.sendKeys("adminTechno@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));
        password.sendKeys("Admin123");
        WebElement loginButton = driver.findElement(By.xpath("(//*[contains(@class,'button-1')])[3]"));
        loginButton.click();
        WebElement search = driver.findElement(By.xpath("//*[contains(@id,'small-search-box-form')]/input"));
        search.sendKeys("Beats Pill");
        WebElement serchButton = driver.findElement(By.xpath("//*[text()='Search']"));
        serchButton.click();
        WebElement urunBasligi = driver.findElement(By.xpath("//*[text()='Beats Pill 2.0 Wireless Speaker']"));
        Assert.assertTrue(urunBasligi.getText().contains("Beats Pill"));
        urunBasligi.click();
        WebElement addToCard = driver.findElement(By.xpath("//button[contains(@id,'add-to-cart')]"));
        addToCard.click();
        WebElement shoppingCard = driver.findElement(By.xpath("//*[text()='shopping cart']"));
        shoppingCard.click();
        WebElement urunSepetiDogrulama = driver.findElement(By.xpath("(//*[text()='Beats Pill 2.0 Wireless Speaker'])[2]"));
        Assert.assertTrue(urunSepetiDogrulama.isEnabled());
        waitAndClose();
    }
}


