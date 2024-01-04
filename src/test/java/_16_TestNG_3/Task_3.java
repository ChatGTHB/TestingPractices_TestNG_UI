package _16_TestNG_3;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.GenelBaseDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_3 extends GenelBaseDriver {

    @Test(dataProvider = "getData")
    public void loginTest(String username, String password) {

        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys(username);

        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        if (username.equals("standard_user") && password.equals("secret_sauce")) {
            WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenu.click();
            WebElement logOut = driver.findElement(By.cssSelector("#logout_sidebar_link"));
            logOut.click();

        }
//        else if (username.equals("locked_out_user") && password.equals("secret_sauce")){
//
//            WebElement burgerMenu=driver.findElement(By.id("react-burger-menu-btn"));
//            burgerMenu.click();
//            WebElement logOut=driver.findElement(By.cssSelector("#logout_sidebar_link"));
//            logOut.click();
//
//        }
        else if (username.equals("problem_user") && password.equals("secret_sauce")) {
            WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenu.click();
            WebElement logOut = driver.findElement(By.cssSelector("#logout_sidebar_link"));
            logOut.click();

        } else if (username.equals("performance_glitch_user") && password.equals("secret_sauce")) {
            WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenu.click();
            WebElement logOut = driver.findElement(By.cssSelector("#logout_sidebar_link"));
            logOut.click();

        } else {
            WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
            Assert.assertTrue(errorMessage.isDisplayed());
            driver.findElement(By.cssSelector(".error-button")).click();
            userName.clear();
            password1.clear();
        }

    }

    @DataProvider
    public Object[][] credentials() {

        Object[][] credentialList = new Object[9][2];

        credentialList[0] = new Object[]{"standard_user", "secret_sauce"};
        credentialList[1] = new Object[]{randomString(), "secret_sauce"};
        credentialList[2] = new Object[]{"standard_user", randomString()};
        credentialList[3] = new Object[]{"locked_out_user", "secret_sauce"};
        credentialList[4] = new Object[]{"problem_user", "secret_sauce"};
        credentialList[5] = new Object[]{"problem_user", randomString()};
        credentialList[6] = new Object[]{"performance_glitch_user", "secret_sauce"};
        credentialList[7] = new Object[]{"performance_glitch_user", randomString()};
        credentialList[8] = new Object[]{"problem_user", randomString()};

        return credentialList;
    }

    @DataProvider
    private Iterator<Object[]> getData() {
        List<Object[]> credentialList = new ArrayList<>();
        credentialList.add(new Object[]{"standard_user", "secret_sauce"});
        credentialList.add(new Object[]{randomString(), "secret_sauce"});
        credentialList.add(new Object[]{"standard_user", randomString()});
        credentialList.add(new Object[]{"locked_out_user", "secret_sauce"});
        credentialList.add(new Object[]{"problem_user", "secret_sauce"});
        credentialList.add(new Object[]{"problem_user", randomString()});
        credentialList.add(new Object[]{"performance_glitch_user", "secret_sauce"});
        credentialList.add(new Object[]{"performance_glitch_user", randomString()});
        credentialList.add(new Object[]{"problem_user", randomString()});

        return credentialList.iterator();
    }

    public static String randomString() {
        return RandomStringUtils.randomAlphanumeric(8);
    }
}
