package _07_Selenium_02;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class Test2 extends BaseDriver {

    @Test
    public void test(){

        driver.get("http://demo.nopcommerce.com/");

        WebElement login= driver.findElement(By.xpath("//a[text()='Log in']"));
        login.click();

        WebElement eMail=driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("adminTechno@gmail.com");

        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("1qaz2wsx");

        WebElement loginButton= driver.findElement(By.xpath("//button[text()='Log in']"));
        loginButton.click();

        WebElement search= driver.findElement(By.xpath("//input[@id='small-searchterms' and @type='text']"));
        search.sendKeys("Beats Pill");

        WebElement searchButton= driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
        searchButton.click();

        WebElement itemTitle= driver.findElement(By.xpath("//a[text()='Beats Pill 2.0 Wireless Speaker']"));
        String text= itemTitle.getText();

        Assert.assertTrue(text.contains("Beats Pill"));

        WebElement addToCart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart.click();

        WebElement confirmation= driver.findElement(By.xpath("//p[@class='content']"));
        String confirmationStr=confirmation.getText();

        Assert.assertTrue(confirmationStr.contains("has been added"));

        WebElement close= driver.findElement(By.xpath("//span[@class='close']"));
        close.click();

    }
}
