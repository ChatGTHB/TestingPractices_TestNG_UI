package _11_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.BaseDriver;

import java.util.List;
import java.util.Set;

public class Iframe extends BaseDriver {
    @Test
    public void test1() {

        driver.get("https://demoqa.com/frames");

        List<WebElement> iframes = driver.findElements(By.tagName("testNg_2/iframe"));
        System.out.println("sitedeki iframler:" + iframes.size());
    }

    @Test
    public void test2() {

        driver.get("https://demoqa.com/frames");

        WebElement iframe = driver.findElement(By.cssSelector("#frame1"));
        driver.switchTo().frame(iframe);  // webelement ile iframe
//        driver.switchTo().frame("frame1");  //  id ile iframe
//        driver.switchTo().frame(2);   // index ile iframe

        WebElement text = driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
        System.out.println(text.getText());
    }

    @Test
    public void test3() {

        driver.get("https://demoqa.com/browser-windows");

        String url = driver.getWindowHandle();

        WebElement newTab = driver.findElement(By.xpath("//button[text()='New Tab']"));  //#tabButtonWrapper>button
        newTab.click();

        Set<String> windowID = driver.getWindowHandles();
        for (String i : windowID) {
            if (i.equals(url)) {
                continue;
            }
            driver.switchTo().window(i);
        }

        WebElement text = driver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println(text.getText());

        waitAndClose();
    }
}
