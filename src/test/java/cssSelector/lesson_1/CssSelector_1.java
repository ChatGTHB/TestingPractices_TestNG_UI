package cssSelector.lesson_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CssSelector_1 {
    @Test
    public void test() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        WebElement register = driver.findElement(By.cssSelector(".header-links a.ico-register"));
        register.click();

        WebElement gender = driver.findElement(By.cssSelector(".gender span:nth-child(2)>input"));
        gender.click();

        WebElement firstName = driver.findElement(By.cssSelector("[data-val-required^='First name']"));
        firstName.sendKeys("Ayşe");

        WebElement lastName = driver.findElement(By.cssSelector(".form-fields div:nth-child(3)>input"));
        lastName.sendKeys("Yıldız");

        WebElement day = driver.findElement(By.cssSelector("[name='DateOfBirthDay']"));
        day.sendKeys("2");

        WebElement month = driver.findElement(By.cssSelector("[name='DateOfBirthMonth'] :nth-child(12)"));
        month.click();

        WebElement year = driver.findElement(By.cssSelector("div[class='date-picker-wrapper'] [name='DateOfBirthYear']"));
        year.sendKeys("2000");

        WebElement email = driver.findElement(By.cssSelector("[data-val-email$='email']"));
        email.sendKeys("AyseYildiz@gmail.com");

        Thread.sleep(2000);
        WebElement companyName = driver.findElement(By.cssSelector("[id='Company']"));
        companyName.sendKeys("Techno Study");

        driver.quit();

    }

}
