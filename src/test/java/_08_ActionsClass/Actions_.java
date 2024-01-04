package _08_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;
import utility.MyFunction;

import java.time.Duration;
import java.util.List;

public class Actions_ extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://www.browserstack.com/");
        Actions actions = new Actions(driver);
        WebElement getStartedFreeButton = driver.findElement(By.xpath("//*[@id='signupModalButton']"));
        Action action = actions.moveToElement(getStartedFreeButton).click().build();
        action.perform();
    }

    @Test
    public void test2() {
        driver.get("https://www.browserstack.com/");
        Actions actions = new Actions(driver);
        WebElement automate = driver.findElement(By.xpath("(//a[@href='/automate'])[3]"));
        Action action = actions.moveToElement(automate).click().build();
        action.perform();
    }

    @Test
    public void test3() {
        driver.get("https://www.browserstack.com/");
        Actions actions = new Actions(driver);
        WebElement automate = driver.findElement(By.xpath("(//a[@href='/automate'])[3]"));
        Action action = actions.moveToElement(automate).click().build();
        action.perform();
        WebElement freeTrial = driver.findElement(By.id("free-trial-link-anchor"));
        action = actions.moveToElement(freeTrial).doubleClick().build();
        action.perform();
    }

    @Test
    public void test4() {

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        Actions actions = new Actions(driver);

        WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iFrame);
        List<WebElement> images = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
        WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
        for (WebElement image : images) {
            Action action = actions.clickAndHold(image).build();
            action.perform();
            action = actions.moveToElement(trash).release().build();
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']")));
            action.perform();
            MyFunction.wait(2);
        }
        waitAndClose();
    }
}


