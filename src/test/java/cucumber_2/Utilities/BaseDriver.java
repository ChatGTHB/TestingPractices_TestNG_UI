package cucumber_2.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void DriverQuit() throws InterruptedException {

       Thread.sleep(2000);
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
