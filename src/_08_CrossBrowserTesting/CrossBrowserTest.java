package _08_CrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseDriverParameter;

import java.util.List;

public class CrossBrowserTest extends BaseDriverParameter {
    /**
     Task: Cross Browser Testing - Google Arama Testi

     1. Google'ın anasayfasına gidin. (https://www.google.com)
     2. Çerez izni penceresindeki "Tümünü reddet" butonunu bulun ve tıklayın (varsa).
     3. Google başlığını doğrulayın.
     4. Arama kutusuna "Cross Browser Testing" yazın ve arama yapın.
     5. Arama sonuçlarının yüklendiğini doğrulayın.
     */

    @Test
    public void crossBrowserTest(){
        // 1. Google'a gidin
        driver.get("https://www.google.com");

        // 2. Çerez izni penceresindeki "Tümünü reddet" butonunu bulun ve tıklayın (çıkarsa)
        // Google çerez izinlerini kabul etmeyi ya da reddetmeyi isteyebilir.
        List<WebElement> rejectAll = driver.findElements(By.xpath("//button[@id='W0wltc']/div"));
        if (!rejectAll.isEmpty()) {
            rejectAll.get(0).click();
        }

        // 3. Google başlığını doğrulayın
        String expectedTitle="Google";
        Assert.assertEquals(driver.getTitle(),expectedTitle,"Baslik dogrulamasi basarisiz oldu!");

        // 4. Arama kutusuna "Cross Browser Testing" yazın ve arama yapın.
        WebElement searchInput= driver.findElement(By.name("q"));
        searchInput.sendKeys("Cross Browser Testing");
        searchInput.submit();

        // 5. Arama sonuçlarının yüklendiğini doğrulayın.
        WebElement searchResult=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
        Assert.assertTrue(searchResult.isDisplayed(),"Arama sonucu sayfasi gorunmedi!");
    }
}
