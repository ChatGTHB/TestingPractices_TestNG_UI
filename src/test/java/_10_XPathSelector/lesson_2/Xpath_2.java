package _10_XPathSelector.lesson_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Xpath_2 {

    @Test
    public void test() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://demo.nopcommerce.com/ ");

        WebElement login = driver.findElement(By.xpath("//a[contains(@href,'login')]"));
        //(//div[@class='header-links']/ul/li/a)[2]   veya   //a[contains(@class,'login')]
        login.click();

        WebElement email = driver.findElement(By.xpath("(//input[starts-with(@id,Email)])[3]"));
        //label[text()='Email:']/following-sibling::input
        Thread.sleep(2000);
        email.sendKeys("test@test.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password' and @type='password']"));
        //(//div[@class='inputs'])[2]//input     veya
        password.sendKeys("123456");

        WebElement Login = driver.findElement(By.xpath("//*[@type='submit' and contains(@class,'1 login')]"));
        Login.click();

        WebElement searchBox = driver.findElement(By.xpath("//*[contains(@class,'search')]//form//input"));
        searchBox.sendKeys("Beats Pill");
        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.xpath("//*[contains(@class,'button') and @type='submit']"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement product = driver.findElement(By.xpath("//*[@class='product-title']"));
        Assert.assertTrue(product.getText().toLowerCase().contains("beats pill"));

        WebElement actualPrice = driver.findElement(By.xpath("//*[@class='price actual-price']"));

        String doubleStrPrice = actualPrice.getText().replaceAll("[^\\d+\\.\\d+]", "");
        Double AcPrice = Double.parseDouble(doubleStrPrice);
        System.out.println(AcPrice);

        WebElement addToCard = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCard.click();

        WebElement shoppingCard = driver.findElement(By.xpath("//*[@id='topcartlink']"));
        shoppingCard.click();
        Thread.sleep(2000);

        WebElement nameInCard = driver.findElement(By.xpath("//*[@class='product-name']"));

        WebElement priceCard = driver.findElement(By.xpath("//*[@class='product-unit-price']"));
        Double PriceCard = Double.parseDouble(priceCard.getText().replaceAll("[^\\d+\\.\\+]", ""));
        System.out.println(PriceCard);

        Assert.assertTrue(nameInCard.getText().toLowerCase().contains("beats pill")
                && AcPrice.equals(PriceCard));
        driver.quit();

    }

}


// Extra
//        WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
//        login.click();
//        WebElement email = driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input"));
//        email.sendKeys("adminTechno@gmail.com");
//        WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));
//        password.sendKeys("Admin123");
//        WebElement loginButton = driver.findElement(By.xpath("(//*[contains(@class,'button-1')])[3]"));
//        loginButton.click();
//        WebElement search = driver.findElement(By.xpath("//*[contains(@id,'small-search-box-form')]/input"));
//        search.sendKeys("Beats Pill");
//        WebElement serchButton = driver.findElement(By.xpath("//*[text()='Search']"));
//        serchButton.click();
//        WebElement urunBasligi = driver.findElement(By.xpath("//*[text()='Beats Pill 2.0 Wireless Speaker']"));
//        Assert.assertTrue(urunBasligi.getText().contains("Beats Pill"));
//        urunBasligi.click();
//        WebElement addToCard = driver.findElement(By.xpath("//button[contains(@id,'add-to-cart')]"));
//        addToCard.click();
//        WebElement shoppingCard = driver.findElement(By.xpath("//*[text()='shopping cart']"));
//        shoppingCard.click();
//        WebElement urunSepetiDogrulama = driver.findElement(By.xpath("(//*[text()='Beats Pill 2.0 Wireless Speaker'])[2]"));
//        Assert.assertTrue(urunSepetiDogrulama.isEnabled());
//        BekleKapat();
