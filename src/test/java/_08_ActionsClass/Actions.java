package _08_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.GenelBaseDriver;
import java.util.List;

public class Actions extends GenelBaseDriver {

    @Test
    public void senaryo1() {
        driver.get("https://www.browserstack.com/");
        org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);
        WebElement element = driver.findElement(By.linkText("Get started free"));
        action.moveToElement(element).click().build().perform();
    }

    @Test
    public void senaryo2() throws InterruptedException {
        driver.get("https://www.browserstack.com/");
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
        WebElement live = driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='Live']"));
        ac.moveToElement(live).build().perform();
        Thread.sleep(3000);
        WebElement automate = driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='App Automate']"));
        automate.click();

    }

    @Test
    public void senaryo3() {
        driver.get("https://www.browserstack.com/");
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
        actions.doubleClick(trialaction).perform();
    }

    @Test
    public void senaryo4() throws InterruptedException {
        String URL = "https://www.globalsqa.com/demo-site/draganddrop/";
        driver.get(URL);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
        driver.switchTo().frame(iframe);
        List<WebElement> images = driver.findElements(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
        WebElement trash = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
        for (WebElement image : images) {
            org.openqa.selenium.interactions.Actions builder = new org.openqa.selenium.interactions.Actions(driver);
            builder.dragAndDrop(image, trash).build().perform();
            Thread.sleep(2000);
        }
        BekleVeKapat();
    }

}
