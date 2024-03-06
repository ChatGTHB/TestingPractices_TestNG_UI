package _13_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;

import java.time.Duration;
import java.util.List;


public class Wait extends BaseDriver {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @Test
    public void test1() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement clickMe = driver.findElement(By.xpath("//*[text()='Click me to start timer']"));
        clickMe.click();

        // The first method
        WebElement webDriverText = driver.findElement(By.xpath("//p[text()='WebDriver']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        // The second method
        // WebElement webDriverText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        Assert.assertTrue(webDriverText.getText().contains("WebDriver"));

        waitAndClose();
    }

    @Test
    public void test2() {

        driver.get(" https://qatest.twoplugs.com/");

        WebElement improved = driver.findElement(By.xpath("//*[@id='details-button']"));
        improved.click();

        WebElement moveOn = driver.findElement(By.xpath("//*[@id='proceed-link']"));
        moveOn.click();

        WebElement element = driver.findElement(By.xpath("//span[text()='What do I need to sign up?']"));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        WebElement text = driver.findElement(By.xpath("//p[text()='You need a facebook account or a valid email address to sign up.']"));
        wait.until(ExpectedConditions.visibilityOf(text));

        // The first method
        Assert.assertEquals("You need a facebook account or a valid email address to sign up.", text.getText());
        // The second method
        Assert.assertTrue(text.isDisplayed());

        waitAndClose();
    }

    @Test
    public void test3() {

        driver.get("https://www.google.com/");

        List<WebElement> rejectAll = driver.findElements(By.xpath("//*[@id='W0wltc']/div"));
        if (!rejectAll.isEmpty()) {
            rejectAll.get(0).click();
        }

        WebElement searchInput = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        Actions actions = new Actions(driver);
        Action action = actions
                .moveToElement(searchInput)
                .click()
                .sendKeys("selenium"+ Keys.ENTER)
                .build();
        action.perform();

        WebElement theFirstLink = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        wait.until(ExpectedConditions.elementToBeClickable(theFirstLink));

        Assert.assertEquals("Selenium", theFirstLink.getText());

        waitAndClose();
    }
}
