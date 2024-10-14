package _09_GroupsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedGroupsTest {

    /**
       Sanity Test Grubu: Temel sistem doğrulama testleri
     */
    @Test(groups = "sanity")
    public void basicSanityCheck() {
        System.out.println("Sanity Test: Temel doğrulama yapılıyor.");
        Assert.assertTrue(true, "Sanity testi başarısız oldu.");
    }

    /**
       Functional Test Grubu: Özel işlevsellikleri test eder
     */
    @Test(groups = "functional")
    public void loginFunctionalityTest() {
        System.out.println("Functional Test: Giriş işlevselliği test ediliyor.");
        // Giriş testi senaryosu
        Assert.assertTrue(true, "Giriş işlevselliği testi başarısız oldu.");
    }

    @Test(groups = "functional")
    public void addProductToCartTest() {
        System.out.println("Functional Test: Ürün sepete ekleme testi yapılıyor.");
        // Sepete ürün ekleme testi senaryosu
        Assert.assertTrue(true, "Sepete ürün ekleme testi başarısız oldu.");
    }

    /**
       Regression Test Grubu: Sanity testlerine bağlı daha geniş kapsamlı testler
       @dependsOnGroups: "sanity" grubu çalışmadan bu test çalışmaz.
     */
    @Test(groups = "regression", dependsOnGroups = "sanity")
    public void checkoutTest() {
        System.out.println("Regression Test: Ödeme işlevi test ediliyor.");
        // Ödeme testi senaryosu
        Assert.assertTrue(true, "Ödeme işlemi testi başarısız oldu.");
    }

    @Test(groups = "regression", dependsOnGroups = "sanity")
    public void orderHistoryTest() {
        System.out.println("Regression Test: Sipariş geçmişi görüntüleme testi yapılıyor.");
        // Sipariş geçmişi testi senaryosu
        Assert.assertTrue(true, "Sipariş geçmişi testi başarısız oldu.");
    }

    @Test(groups = "regression", dependsOnGroups = {"sanity", "functional"})
    public void fullSystemTest() {
        System.out.println("Regression Test: Tüm sistem testi.");
        // Tam kapsamlı sistem testi
        Assert.assertTrue(true, "Tam sistem testi başarısız oldu.");
    }
}
