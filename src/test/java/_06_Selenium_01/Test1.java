package _06_Selenium_01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;


public class Test1 extends BaseDriver {

    // Olması gereken kod
    // String mail="testing@testing.com";

    // Test esnasında kullanılmak üzere oluşturulmuş random mail
    String mail = "testing" + ((int) (Math.random() * 10000)) + "@testing.com";
    String password = "abCD123456.";

    @Test
    public void scenerio1() {

        driver.get("https://demo.nopcommerce.com/");


        WebElement registerLink = driver.findElement(By.cssSelector("a[class='ico-register']"));
        registerLink.click();


        WebElement maleRadioButton = driver.findElement(By.cssSelector("input[value='M']"));
        maleRadioButton.click();


        WebElement firstName = driver.findElement(By.cssSelector("input[id='FirstName']"));
        firstName.sendKeys("Testing");


        WebElement lastName = driver.findElement(By.cssSelector("input[id='LastName']"));
        lastName.sendKeys("Project");


        WebElement eMail = driver.findElement(By.cssSelector("input[id='Email']"));
        eMail.sendKeys(mail);


        WebElement company = driver.findElement(By.cssSelector("input[id='Company']"));
        company.sendKeys("Test Company");


        WebElement password_ = driver.findElement(By.cssSelector("input[id='Password']"));
        password_.sendKeys(password);


        WebElement confirmPassword = driver.findElement(By.cssSelector("input[id='ConfirmPassword']"));
        confirmPassword.sendKeys(password);


        WebElement registerButton = driver.findElement(By.cssSelector("button[id='register-button']"));
        registerButton.click();


        WebElement successMessage = driver.findElement(By.cssSelector("div[class='result']"));
        String successMessageStr = successMessage.getText();


        Assert.assertTrue(successMessageStr.contains("completed"));


        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        login.click();


        WebElement eMailInputInLoginPage = driver.findElement(By.cssSelector("input[id='Email']"));
        eMailInputInLoginPage.sendKeys(mail);


        WebElement passwordInputInLoginPage = driver.findElement(By.cssSelector("input[class='password']"));
        passwordInputInLoginPage.sendKeys(password);


        WebElement loginButton = driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
        loginButton.click();


        WebElement logoutLink = driver.findElement(By.cssSelector("a[class='ico-logout']"));


        Assert.assertTrue(logoutLink.isDisplayed());

        waitAndClose();
    }
}
