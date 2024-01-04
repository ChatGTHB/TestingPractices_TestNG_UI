package _20_RobotClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RobotClass {
    /**
     * Robot Class Task:
     * <p>
     * 1)- Bilgisayarınızın masaüstünde içi herhangi bir şekilde dolu olan word ya da text belgesi oluşturunuz.
     * 2)- https://dosya.org/ isimli websitesine gidiniz.
     * 3)- Masaüstünüzde oluşturmuş olduğunuz word ya da text belgesini Robot Class kullanarak upload ediniz.
     * 4)- Belgenin upload edildiğini doğrulayınız.
     * <p>
     * ========================================================================================================
     * <p>
     * 5)- Upload edilen belgenizin download URL’sini Robot Class kullanarak yeni bir sekmede açınız.
     * 6)- Açılan sekmenin belgenize ait olduğunu belge adı ile doğrulayınız.
     */

    @Test
    public void robotClassTest() throws AWTException, InterruptedException {

        WebDriver driver;

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://dosya.org/");

        Robot robot = new Robot();

        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(500);
        }

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000);
        driver.findElement(By.className("internal")).click();

        Thread.sleep(1000);
        StringSelection filePath = new StringSelection("C:\\Users\\cihat\\Desktop\\RobotClass.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        Thread.sleep(1000);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
        }

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000);
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(1000);
        }

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(10000);
        Assert.assertTrue("Upload işlemi başarısız.", driver.findElement(By.xpath("(//div[@class='baseText'])[3]")).getText().contains("uploads completed"));

        WebElement downloadLink = driver.findElement(By.xpath("//td[@class='url urlOff']"));
        String downloadLinkStr = downloadLink.getText();

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);

        Set<String> windowsIDS = driver.getWindowHandles();
        Iterator iterator = windowsIDS.iterator();
        String firstTab = iterator.next().toString();
        String secondTab = iterator.next().toString();

        Thread.sleep(1000);
        driver.switchTo().window(secondTab);
        driver.get(downloadLinkStr);

        Thread.sleep(1000);
        WebElement fileName = driver.findElement(By.xpath("(//td[@class='responsiveInfoTable'])[1]"));
        String fileNameStr = "RobotClass.docx";

        Thread.sleep(5000);
        Assert.assertTrue(fileName.getText().contains(fileNameStr));

        driver.quit();
    }
}
