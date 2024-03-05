package _12_Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.MyFunction;

import java.time.Duration;
import java.util.ArrayList;

public class Scroll extends BaseDriver {

    @Test
    public void scrollDownUp() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement user = driver.findElement(By.cssSelector("[name='username']"));
        WebElement pass = driver.findElement(By.cssSelector("[name='password']"));
        WebElement login = driver.findElement(By.cssSelector("[type='submit']"));
        user.sendKeys("Admin");
        pass.sendKeys("admin123");
        login.click();

        WebElement topBar = driver.findElement(By.cssSelector("[class='oxd-topbar']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(topBar));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        MyFunction.wait(3);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    }

    @Test
    public void dynamicScroll() {

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        ArrayList<String> arrayList = new ArrayList<>();
        WebElement texts;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 1; i < 11; i++) {
            MyFunction.wait(1);
            texts = driver.findElement(By.xpath("(//*[@class='jscroll-added'])[" + i + "]"));
            arrayList.add(i - 1, texts.getText());
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            System.out.println(i+"." + ".Paragraf : " + arrayList.get(i-1));
        }
        waitAndClose();
    }
}
