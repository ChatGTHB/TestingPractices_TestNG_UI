package _04_EnableDisableTests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EnableDisableTest {

    @Test(enabled = false)
    public void testCaseDisabled() {
        String str1 = "TestNG";
        String str2 = "Selenium";
        Assert.assertEquals(str1, str2, "Stringler ayni degil.");
        System.out.println("testCaseDisabled calistirilmadi.");
    }

    @Test
    public void testCaseEnabled() {
        String str1 = "Selenium";
        String str2 = "Selenium";
        Assert.assertEquals(str1, str2, "Stringler ayni degil.");
        System.out.println("testCaseEnabled calistirildi.");
    }

    @Test(priority = 1)
    public void testCaseOne() {
        String str1 = "Java";
        String str2 = "Java";
        Assert.assertEquals(str1, str2, "Stringler ayni degil.");
        System.out.println("testCaseOne calistirildi.");
    }

    @Test(priority = 2, enabled = false)
    public void testCaseTwo() {
        String str1 = "TestNG";
        String str2 = "Selenium";
        Assert.assertEquals(str1, str2, "Stringler ayni degil.");
        System.out.println("testCaseTwo calistirildi.");
    }

    @Test(priority = 3)
    public void testCaseThree() {
        String str1 = "Selenium WebDriver";
        String str2 = "Selenium WebDriver";
        Assert.assertEquals(str1, str2, "Stringler ayni degil.");
        System.out.println("testCaseThree calistirildi.");
    }

    @Ignore
    @Test(priority = 4)
    public void testCaseFour() {
        String str1 = "Selenium WebDriver";
        String str2 = "Selenium WebDriver";
        Assert.assertEquals(str1, str2, "Stringler ayni degil.");
        System.out.println("testCaseFour calistirilmadi.");
    }

}
