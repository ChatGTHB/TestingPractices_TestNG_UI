package cucumber_2.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void DriverQuit() {



        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
