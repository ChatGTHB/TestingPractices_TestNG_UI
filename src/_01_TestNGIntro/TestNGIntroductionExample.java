package _01_TestNGIntro;

import org.testng.annotations.Test;

public class TestNGIntroductionExample {

    // TestNG'nin temellerini anlamak için basit bir test sınıfı oluşturuyoruz.

    @Test
    public void testMethod1(){
        System.out.println("TestNG Method 1 calisti."); // TestNG metotlarının nasıl çalıştığını gösterir.
    }

    @Test
    public void testMethod2(){
        System.out.println("TestNG Method 2 calisti.");
    }

}
