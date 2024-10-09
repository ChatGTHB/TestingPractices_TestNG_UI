package _05_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utility.BaseDriver;

import java.util.List;

public class GoogleHardAndSoftAssertTest extends BaseDriver {

    /**
       Task:

       Google Üzerinde Hard ve Soft Assert Kullanımı

       1- "https://google.com/" sitesine gidiniz.
       2- URL'in "google.com" ibaresini içerdiğini doğrulayınız.
       3- Title'ın "google" kelimesini içerdiğini doğrulayınız.
       4- Search kısmına "Selenium" yazıp Enter'a basınız.
       5- Search işlemi sonucundaki ilk sonucun "selenium" kelimesini içerdiğini doğrulayınız.
     */

    // Bu metot Hard Assert kullanarak işlemleri doğrular
    @Test
    public void hardAssertTesting() {
        // 1. Google.com'a gidin
        driver.get("https://google.com/");

        // 2. "Tümünü reddet" butonunu bulun ve tıklayın (çerez izni)
        List<WebElement> rejectAll = driver.findElements(By.xpath("//button[@id='W0wltc']/div"));
        if (!rejectAll.isEmpty()) {
            rejectAll.get(0).click();
        }

        // 3. URL'in "google.com" ibaresini içerdiğini doğruluyoruz (Hard Assert ile)
        String currentUrl = driver.getCurrentUrl().toLowerCase();
        Assert.assertTrue(currentUrl.contains("google.com"), "URL doğrulama hatası");

        // 4. Başlığın "Google" kelimesini içerdiğini doğruluyoruz (Hard Assert ile)
        String title = driver.getTitle().toLowerCase();
        Assert.assertTrue(title.contains("google"), "Title doğrulama hatası");

        // 5. Arama kutusuna "Selenium" yazıp Enter'a basıyoruz
        WebElement searchInput = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        Actions actions = new Actions(driver);
        Action action = actions
                .moveToElement(searchInput)
                .click()
                .sendKeys("selenium" + Keys.ENTER)
                .build();
        action.perform();

        // 6. İlk sonucun "Selenium" kelimesini içerip içermediğini doğruluyoruz
        WebElement theFirstLink = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        wait.until(ExpectedConditions.elementToBeClickable(theFirstLink)); // İlk sonucun görünür ve tıklanabilir olmasını bekler

        // İlk yöntem: Tam eşleşme kontrolü
        String firstLinkText = theFirstLink.getText().toLowerCase();
        Assert.assertTrue(firstLinkText.contains("selenium"), "İlk sonuç doğrulama hatası");
    }

    // Bu metot Soft Assert kullanarak işlemleri doğrular
    @Test
    public void softAssertTesting() {
        // 1. Google.com'a gidin
        driver.get("https://google.com/");

        // 2. "Tümünü reddet" butonunu bulun ve tıklayın (çerez izni)
        List<WebElement> rejectAll = driver.findElements(By.xpath("//button[@id='W0wltc']/div"));
        if (!rejectAll.isEmpty()) {
            rejectAll.get(0).click();
        }

        // SoftAssert objesi oluşturuyoruz
        SoftAssert softAssert = new SoftAssert();

        // 3. URL'in "google.com" ibaresini içerdiğini doğruluyoruz (Soft Assert ile)
        String currentUrl = driver.getCurrentUrl().toLowerCase();
        softAssert.assertTrue(currentUrl.contains("google.com"), "URL doğrulama hatası");

        // 4. Başlığın "Google" kelimesini içerdiğini doğruluyoruz (Soft Assert ile)
        String title = driver.getTitle().toLowerCase();
        softAssert.assertTrue(title.contains("google"), "Title doğrulama hatası");

        // 5. Arama kutusuna "Selenium" yazıp Enter'a basıyoruz
        WebElement searchInput = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        Actions actions = new Actions(driver);
        Action action = actions
                .moveToElement(searchInput)
                .click()
                .sendKeys("selenium" + Keys.ENTER)
                .build();
        action.perform();

        // 6. İlk sonucun "Selenium" kelimesini içerip içermediğini doğruluyoruz (Soft Assert ile)
        WebElement theFirstLink = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        wait.until(ExpectedConditions.elementToBeClickable(theFirstLink)); // İlk sonucun görünür ve tıklanabilir olmasını bekler

        String firstLinkText = theFirstLink.getText().toLowerCase();
        softAssert.assertTrue(firstLinkText.contains("selenium"), "İlk sonuç doğrulama hatası");

        // 7. Soft Assert kullanıldığında, hatalar olsa bile kod çalışmaya devam eder.
        // Bu yüzden bu satır, test başarılı olsa da olmasa da her zaman çalışacaktır.
        System.out.println("Soft Assert kullanıldığı için hatalar olsa da kod çalışmaya devam edecek.");
        System.out.println("Ancak hatalar assertAll() çağrılana kadar raporlanmayacak.");

        // 8. assertAll çağrısına kadar softAssert doğrulama sonuçları kontrol edilmez.
        softAssert.assertAll(); // Tüm SoftAssert sonuçları burada raporlanır.
    }
}

/**
 Bu taskte hem Hard Assert hem de Soft Assert kavramları gösterilmektedir.

   Hard Assert:
 - Google üzerinde çeşitli doğrulama adımları uygulanır ve eğer bir assert başarısız olursa, test o noktada durur.
 - İlk doğrulama URL'in "google.com" içerdiği, ikinci doğrulama sayfa başlığının "Google" kelimesini içerdiği üzerine.
 - Sonrasında ise arama yapılıp, ilk sonucun doğrulaması yapılır.

   Soft Assert:
 - Soft Assert kullanılarak tüm doğrulamalar gerçekleştirilir.
 - Eğer bir doğrulama başarısız olursa bile diğer adımlar çalışmaya devam eder.
 - En sonunda `assertAll()` metodu ile tüm hatalar toplanır ve topluca raporlanır.
 - Bu sayede test sonuna kadar çalıştırılmış olur ve hata olup olmadığını görebiliriz.

 Soft Assert kullanıldığında, kod çalışmaya devam edeceğinden dolayı
 hata olsa bile "assertAll" metoduna kadar kod çalışmaya devam eder.
 Bu yüzden `assertAll()` çağrıldığında tüm hatalar topluca raporlanır.
 */
