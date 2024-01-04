package _02_Selenium_CssSelector_22_02_2023;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunction;

public class Tests extends BaseDriver {

    @Test
    public void test1() {
        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullName.sendKeys("Automation");

        WebElement eMail = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        eMail.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector("[id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.cssSelector("[id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        MyFunction.wait(2);
        WebElement submitButton = driver.findElement(By.cssSelector("[id='submit']"));
        submitButton.click();

        //Assert.assertTrue(fullName.getText().contains(automation));
        Assert.assertTrue(fullName.getAttribute("value").contains("Automation"));
        Assert.assertTrue(eMail.getAttribute("value").contains("Testing"));

    }

    @Test
    public void test2() {

        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("[id='username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id='password']"));
        password.sendKeys("techno123.");

        MyFunction.wait(2);
        WebElement signInButton = driver.findElement(By.cssSelector("[id='log-in']"));
        signInButton.click();

        WebElement verificationMessage = driver.findElement(By.cssSelector("h6[id='time']"));
        Assert.assertEquals("Your nearest branch closes in: 30m 5s", verificationMessage.getText());

    }

    @Test
    public void test3() {

        driver.get("https://www.snapdeal.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("[id='inputValEnter']"));
        searchBox.sendKeys("teddy bear");

        MyFunction.wait(2);
        WebElement searchButton = driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        searchButton.click();

        WebElement confirmation = driver.findElement(By.cssSelector("[id='searchMessageContainer']"));

        Assert.assertTrue(confirmation.getText().contains("results for teddy bear"));
    }

    @Test
    public void test4() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunction.wait(2);
        WebElement calculatorButton = driver.findElement(By.cssSelector("[id='calculatetest']"));
        calculatorButton.click();

        WebElement input1Box = driver.findElement(By.cssSelector("[id='number1']"));
        input1Box.sendKeys("7");

        WebElement input2Box = driver.findElement(By.cssSelector("[id='number2']"));
        input2Box.sendKeys("6");

        MyFunction.wait(2);
        WebElement calculator2Button = driver.findElement(By.cssSelector("[id='calculate']"));
        calculator2Button.click();

        WebElement result = driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println(result.getText());

    }

    @Test
    public void test5() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunction.wait(2);
        WebElement fakeAlertButton = driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAlertButton.click();

        MyFunction.wait(2);
        WebElement showAlertButton = driver.findElement(By.cssSelector("[id='fakealert']"));
        showAlertButton.click();

        MyFunction.wait(2);
        WebElement okButton = driver.findElement(By.cssSelector("[id='dialog-ok']"));
        okButton.click();
    }

    @Test
    public void test6() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunction.wait(2);
        WebElement fakeAlertButton = driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAlertButton.click();

        MyFunction.wait(2);
        WebElement showModalButton = driver.findElement(By.cssSelector("[id='modaldialog']"));
        showModalButton.click();

        MyFunction.wait(2);
        WebElement okButton = driver.findElement(By.cssSelector("[id='dialog-ok']"));
        okButton.click();

        waitAndClose();
    }
}
