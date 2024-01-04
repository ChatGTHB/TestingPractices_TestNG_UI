package _01_Exercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;
import utility.MyFunction;

public class RegisterUser extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://automationexercise.com/");

        String url = driver.getCurrentUrl();
        
        Assert.assertEquals("https://automationexercise.com/", url);

        WebElement signUpButton= driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signUpButton.click();

        WebElement confirmationNewUser= driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

        Assert.assertEquals(confirmationNewUser.getText(), "New User Signup!");

        WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("Cihan");

        WebElement email= driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        email.sendKeys("cihan@gmail.com");

        WebElement signupButton= driver.findElement(By.xpath("//button[text()='Signup']"));
        signupButton.click();

        WebElement verificationEnterAccount= driver.findElement(By.xpath("//b[text()='Enter Account Information']"));

        Assert.assertEquals(verificationEnterAccount.getText(), "ENTER ACCOUNT INFORMATION");

        WebElement titleEnterAccount= driver.findElement(By.id("id_gender1"));
        titleEnterAccount.click();

        WebElement passwordEnterAccount= driver.findElement(By.id("password"));
        passwordEnterAccount.sendKeys("password");

        WebElement day= driver.findElement(By.id("days"));
        Select daySelect=new Select(day);
        daySelect.selectByValue("1");

        WebElement month= driver.findElement(By.id("months"));
        Select monthSelect=new Select(month);
        monthSelect.selectByVisibleText("January");

        WebElement year= driver.findElement(By.id("years"));
        Select yearSelect=new Select(year);
        daySelect.selectByIndex(22);

        WebElement checkboxNewsletter= driver.findElement(By.id("newsletter"));
        checkboxNewsletter.click();

        WebElement checkoutOffers= driver.findElement(By.id("optin"));
        checkoutOffers.click();

        WebElement firstNameForAddress= driver.findElement(By.id("first_name"));
        firstNameForAddress.sendKeys("cihan");

        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(firstNameForAddress)
                .click()
                .keyDown(Keys.TAB)
                .keyUp(Keys.TAB)
                .sendKeys("lAST")
                .build();

        MyFunction.wait(2);
        action.perform();






    }
}
