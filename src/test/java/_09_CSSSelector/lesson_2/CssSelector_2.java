package _09_CSSSelector.lesson_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class CssSelector_2 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.akakce.com/");

        WebElement anasayfaBtn = driver.findElement(By.cssSelector("div[class=\"g-4_v8\"]>a"));
        Assert.assertEquals("Akakce.com", anasayfaBtn.getText());

        WebElement hesapAc = driver.findElement(By.cssSelector("div[id=\"H_rl_v8\"] a:first-child"));
        hesapAc.click();

        WebElement name = driver.findElement(By.cssSelector("form input[name=\"rnufn\"]"));
        name.sendKeys("Techno");

        WebElement lastname = driver.findElement(By.cssSelector("span>[name=\"rnufs\"]"));
        lastname.sendKeys("Study");

        WebElement eposta = driver.findElement(By.cssSelector("form[id=\"FrmRnuS\"]>span:nth-of-type(3)>input"));
        eposta.sendKeys("techno21@gmail.com");

        WebElement epostaT = driver.findElement(By.cssSelector("form[id=\"FrmRnuS\"]>span:nth-of-type(4)>input"));
        epostaT.sendKeys("techno21@gmail.com");

        WebElement sifre = driver.findElement(By.cssSelector("label[for=\"rnufp1\"]+span>input"));
        sifre.sendKeys("Techno1234567");

        WebElement sifreT = driver.findElement(By.cssSelector("label[for=\"rnufp2\"]+span>input"));
        sifreT.sendKeys("Techno1234567");

        WebElement cinsiyet = driver.findElement(By.cssSelector("span[class=\"radio_v8\"]>:nth-child(2)"));
        cinsiyet.click();

        WebElement ilSelect = driver.findElement(By.cssSelector("select[id=\"locpr\"]"));
        ilSelect.click();

        WebElement il = driver.findElement(By.cssSelector("select[name=\"locpr\"]>:nth-child(4)"));
        il.click();

        WebElement ilceSelect = driver.findElement(By.cssSelector("select[id=\"locds\"]"));
        ilceSelect.click();

        WebElement ilce = driver.findElement(By.cssSelector("select[name=\"locds\"]>:nth-child(9)"));
        ilce.click();

        WebElement gunSelect = driver.findElement(By.cssSelector("select[name=\"bd\"]"));
        gunSelect.click();

        WebElement gun = driver.findElement(By.cssSelector("select[name=\"bd\"]>:nth-child(10)"));
        gun.click();

        WebElement aySelect = driver.findElement(By.cssSelector("select[name=\"bm\"]"));
        aySelect.click();

        WebElement ay = driver.findElement(By.cssSelector("select[name=\"bm\"]>:nth-child(5)"));
        ay.click();

        WebElement yilSelect = driver.findElement(By.cssSelector("select[name=\"by\"]"));
        yilSelect.click();

        WebElement yil = driver.findElement(By.cssSelector("select[name='by']>:nth-child(10)"));
        yil.click();

        WebElement sozlesme = driver.findElement(By.cssSelector("span[class=\"chbx_v8\"]>label>input"));
        sozlesme.click();

        WebElement hesapAcBtn = driver.findElement(By.cssSelector("form[id=\"FrmRnuS\"] input[type=\"Submit\"]"));
        hesapAcBtn.click();

        WebElement anasayfaName = driver.findElement(By.cssSelector("div[id=\"HM_v8\"]>i>a"));
        Assert.assertEquals("Techno", anasayfaName.getText());

        WebElement profilBtn = driver.findElement(By.cssSelector("div[id=\"HM_v8\"]>i"));
        profilBtn.click();

        Thread.sleep(2000);
        WebElement siparislerimBtn = driver.findElement(By.cssSelector("li[class=\"order first\"]>:nth-child(2)"));
        siparislerimBtn.click();

        Thread.sleep(2000);
        WebElement siparisMesaj = driver.findElement(By.cssSelector("[class=\"no-record\"]"));
        Assert.assertEquals("Kayıtlı siparişiniz bulunmuyor.", siparisMesaj.getText());

        Thread.sleep(2000);
        WebElement profileDon = driver.findElement(By.cssSelector("ol[itemtype=\"http://schema.org/BreadcrumbList\"] li:nth-child(2)"));
        profileDon.click();

        Thread.sleep(2000);
        WebElement mesajlarimBtn = driver.findElement(By.cssSelector("li[class=\"order first\"]>:nth-child(3)"));
        mesajlarimBtn.click();

        Thread.sleep(2000);
        WebElement mesajlarim = driver.findElement(By.cssSelector("div[class=\"wbb_v8\"]>p"));
        Assert.assertEquals("Listelenecek mesaj bulunamadı.", mesajlarim.getText());

        Thread.sleep(2000);
        WebElement anasayfaIcon = driver.findElement(By.cssSelector("ol[itemtype=\"http://schema.org/BreadcrumbList\"] li:nth-child(1)"));
        anasayfaIcon.click();

        Thread.sleep(2000);
        WebElement sicakFirsatlar = driver.findElement(By.cssSelector("ul[id=\"igSet\"]>li>a[href=\"/gercek-indirimler/\"]"));
        sicakFirsatlar.click();

        Thread.sleep(2000);
        WebElement urun5TumFiyatlar = driver.findElement(By.cssSelector("li:nth-child(5)>a[class=\"tfg\"]"));
        urun5TumFiyatlar.click();

        Thread.sleep(2000);
        WebElement saticiPuani = driver.findElement(By.cssSelector("div[id=\"LM\"]>p:nth-child(1)>:nth-child(4)"));
        saticiPuani.click();

        Thread.sleep(2000);
        WebElement profilBtn2 = driver.findElement(By.cssSelector("div[id=\"HM_v8\"]>i>a"));
        profilBtn2.click();

        Thread.sleep(2000);
        WebElement hesabimiSil = driver.findElement(By.cssSelector("ul[id=\"AL\"]>:nth-child(4)>:nth-child(5)"));
        hesabimiSil.click();

        Thread.sleep(2000);
        WebElement hesapSifre = driver.findElement(By.cssSelector("input[onfocusout=\"ControlPassword();\"]"));
        hesapSifre.sendKeys("Techno1234567");

        Thread.sleep(2000);
        WebElement hesabimisilBtn = driver.findElement(By.cssSelector("[type='submit']"));
        hesabimisilBtn.click();

        driver.quit();
    }
}
