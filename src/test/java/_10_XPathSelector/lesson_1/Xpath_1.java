package _10_XPathSelector.lesson_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1 {

    public static void main(String[] args) throws InterruptedException {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"gLFyf gsfi\"]")).sendKeys("Media Markt");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@class=\"gNO89b\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"https://www.mediamarkt.com.tr/\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()=\"Anladım\"]")).click();

        driver.findElement(By.xpath("//span[@class=\"ms-dropdown__trigger\"]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//ul[@class=\"ms-list\"]/li)[1]")).click();
        driver.findElement(By.xpath("//*[@name=\"firstName\"]")).sendKeys("ahmet");
        driver.findElement(By.xpath("//*[contains(@name, \"lastName\")]")).sendKeys("aslan");
        driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"Mr\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"phone2\" or @id=\"phone2\"]")).sendKeys("5422566368");
        driver.findElement(By.xpath("//input[@id=\"register-email\"]")).sendKeys("eda25@gmail.com");
        driver.findElement(By.xpath("//li[@class=\"password\"]/input")).sendKeys("Asd142535");
        driver.findElement(By.xpath("(//li[@class=\"password\"]//following-sibling::li)[1]/input")).sendKeys("Asd142535");
        driver.findElement(By.xpath("//input[@type=\"checkbox\" and @id=\"register-newsletter\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"Hemen Üye Ol\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name=\"query\"]")).sendKeys("Laptop");
        driver.findElement(By.xpath("//button[@data-identifier=\"searchButton\"]")).click();
        driver.findElement(By.xpath("(//a[@class=\"to-details button block arrow clickable\"])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//ul[@class=\"thumbs\"]/li)[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\"pdp-add-to-cart\"]")).click();

        driver.quit();
    }

}
