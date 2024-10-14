package _07_XMLConfigurations.googleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.BaseDriver;

import java.util.List;

public class GoogleSearchTest extends BaseDriver {

    /**
        Task:
        Google Üzerinde Arama Yapma

        1. XML dosyasından gelen URL'ye gidin (https://www.google.com).
        2. Eğer çerez izni penceresi çıkarsa "Tümünü reddet" butonuna tıklayın.
        3. Başlığın "Google" içerdiğini doğrulayın.
        4. XML dosyasından gelen arama terimini arama kutusuna yazın ve arama yapın.
        5. Arama sonuçlarının görüntülendiğini doğrulayın.
     */

    @Test
    @Parameters({"url", "searchTerm"})  // XML'den url ve arama terimi parametre olarak alınır
    public void googleSearch(String url, String searchTerm) {
        // 1. Verilen URL'ye gidin
        driver.get(url);

        // 2. Çerez izni penceresini kontrol edin ve varsa "Tümünü reddet" butonuna tıklayın
        // Google, çerez izni penceresi çıkarabiliyor, bunu otomatik olarak reddetmek için buton kontrolü yapıyoruz.
        List<WebElement> rejectAll = driver.findElements(By.xpath("//button[@id='W0wltc']/div"));
        if (!rejectAll.isEmpty()) {
            rejectAll.get(0).click();  // Eğer buton mevcutsa tıklanır.
        }

        // 3. Sayfa başlığının "Google" içerdiğini doğrulayın
        // Bu adımda, Google ana sayfasının doğru şekilde yüklendiğini kontrol etmek için başlık doğrulaması yapıyoruz.
        String expectedTitle = "Google";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Başlık doğrulaması başarısız oldu!");

        // 4. Arama kutusuna XML'den gelen arama terimini yazın ve arama yapın
        // XML dosyasından alınan arama terimi kullanılarak arama yapılır.
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(searchTerm);  // Arama kutusuna terim yazılır
        searchInput.submit();  // Arama işlemi yapılır

        // 5. Arama sonuçlarının başarıyla görüntülendiğini doğrulayın
        // Arama sonuçları sayfasının yüklendiğini ve sonuçların gösterildiğini doğruluyoruz.
        WebElement searchResults = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
        Assert.assertTrue(searchResults.isDisplayed(), "Arama sonuçları görünmedi!");
    }
}
