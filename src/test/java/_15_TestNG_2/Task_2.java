package _15_TestNG_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.GenelBaseDriver;

public class Task_2 extends GenelBaseDriver {
    @Test(groups = "smoke")
    public void login() {
        driver.get("http://admin-demo.nopcommerce.com/");
        WebElement loginBtn = driver.findElement(By.cssSelector("button[type=submit]"));
        loginBtn.click();
    }

    @Test(groups = "regression", dependsOnMethods = "login", enabled = false)
    public void logout() {
        WebElement logOutBtn = driver.findElement(By.xpath("//a[text()=\"Logout\"]"));
        logOutBtn.click();
    }

    @Parameters("search")
    @Test(dependsOnMethods = "login")
    public void searchTest(String srch) {
        WebElement search = driver.findElement(By.xpath("//div[@id=\"search-box\"]/span/input"));
        search.click();
        search.sendKeys(srch);
    }

}
