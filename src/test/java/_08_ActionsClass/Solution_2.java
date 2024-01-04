package _08_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.MyFunction;

import java.time.Duration;
import java.util.List;

public class Solution_2 extends BaseDriver {
    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));  // ihtiyaç olursa diye eklendi
    Action action;

    @Test
    public void test1() {
        driver.get("https://www.browserstack.com/");
        actions.click(driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")));
        actions.click(driver.findElement(By.id("signupModalButton")));
        actions.perform();
//        WebElement getStartedFree = driver.findElement(By.id("signupModalButton"));
//        action = actions.moveToElement(getStartedFree).build();
//        action.perform();
    }

    @Test
    public void test2() {
        driver.get("https://www.browserstack.com/");
        actions.moveToElement(driver.findElement(By.xpath("(//a[@title='Live'])[2]")));
        WebElement automate = driver.findElement(By.xpath("(//a[@title='App Automate'])[3]"));
        actions.click(automate).perform();
    }

    @Test
    public void test3() {
        driver.get("https://www.browserstack.com/");
        actions.doubleClick(driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']")));
        actions.perform();

    }

    @Test
    public void test4() {
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);

        List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
        WebElement trash = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));

        for (WebElement i : list) {
            actions.dragAndDrop(i, trash).build().perform();
            MyFunction.wait(1);
        }
        waitAndClose();
    }
}
