package _05_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsExtendedExamples {

    @Test
    public void hardAssertTest() {
        System.out.println("Hard Assert Test basliyor...");

        String expectedTitle = "Google";
        String actualTitle = "Google";

        // 1. Başlıkların eşit olup olmadığını kontrol et
        Assert.assertEquals(actualTitle, expectedTitle, "Basliklar esit degil");

        // 2. Koşulun doğru olup olmadığını kontrol et
        Assert.assertTrue(actualTitle.contains("Google"), "Baslik Google icermiyor!");

        System.out.println("Bu satir sadece assert basarili olursa calisir.");
    }

    @Test
    public void multipleHardAssertTest() {
        System.out.println("Birden fazla Hard Assert Test basliyor...");

        // İlk assertion başarılı olacak
        int expectedNumber=5;
        int actualNumber=5;
        Assert.assertEquals(actualNumber,expectedNumber,"Sayilar esit degil!");

        // İkinci assertion başarısız olacak ve test burada duracak
        String expectedTitle = "Hello World";
        String actualTitle = "Hello TestNG";
        Assert.assertEquals(actualTitle, expectedTitle, "Metinler esit degil");

        // Bu satır asla çalışmayacak çünkü yukarıdaki assertion başarısız oldu
        System.out.println("Bu satir sadece assert basarili olursa calisir.");
    }
}
