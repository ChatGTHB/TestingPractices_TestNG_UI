package _11_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utility.BaseDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Iframe extends BaseDriver {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @Test
    public void test1() {

        driver.get("https://demoqa.com/frames");

        List<WebElement> consent = driver.findElements(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']//p"));
        if (!consent.isEmpty()) {
            consent.get(0).click();
        }

        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of iframes on the site: " + iframes.size());

        waitAndClose();
    }

    @Test
    public void test2() {

        driver.get("https://demoqa.com/frames");

        List<WebElement> consent = driver.findElements(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']//p"));
        if (!consent.isEmpty()) {
            consent.get(0).click();
        }

        WebElement iframe = driver.findElement(By.xpath("//*[@id='frame1']"));
        driver.switchTo().frame(iframe);  // web element ile iframe
//        driver.switchTo().frame("frame1");  //  id ile iframe
//        driver.switchTo().frame(2);   // index ile iframe

        WebElement text = driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
        System.out.println(text.getText());

        waitAndClose();
    }

    @Test
    public void test3() {
// 1. Sayfayı açmak için gerekli URL'yi kullanın
        driver.get("https://the-internet.herokuapp.com/iframe");

// 2. Iframe'e geçmek için iframe'in id, name veya index özelliğini kullanın

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        // driver.switchTo().frame("mce_0_ifr");
        // driver.switchTo().frame(0);

// 3. Iframe'in içindeki metin kutusunu bulmak için xpath kullanın
        WebElement textArea = driver.findElement(By.xpath("//body[@id='tinymce']"));

// 4. Metin kutusunun içeriğini temizlemek için clear() metodunu kullanın
        textArea.clear();

// 5. Metin kutusuna yeni bir metin yazmak için sendKeys() metodunu kullanın
        textArea.sendKeys("Bu metin Selenium ile değiştirildi!");

// 6. Iframe'den çıkmak parentFrame() metodunu kullanın
        driver.switchTo().parentFrame();

// 7. Tüm iframelerden çıkıp direkt ana sayfaya dönmek için defaultContent() metodunu kullanın
        driver.switchTo().defaultContent();

        waitAndClose();
    }

    @Test
    public void test4() {

        driver.get("https://demoqa.com/browser-windows");

        List<WebElement> consent = driver.findElements(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']//p"));
        if (!consent.isEmpty()) {
            consent.get(0).click();
        }

        String url = driver.getWindowHandle();

        WebElement newTab = driver.findElement(By.xpath("//button[text()='New Tab']"));  //#tabButtonWrapper>button
        newTab.click();

        Set<String> windowIDs = driver.getWindowHandles();
        for (String windowID : windowIDs) {
            if (windowID.equals(url)) {
                continue;
            }
            driver.switchTo().window(windowID);
        }

        WebElement text = driver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println(text.getText());

        waitAndClose();
    }
}
