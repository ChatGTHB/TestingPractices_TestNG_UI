package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;

    static {

        Logger logger = Logger.getLogger("");  // Çıktı günlüklerini alır
        logger.setLevel(Level.SEVERE);               // Sadece HATA'ları gösterir

        driver = new ChromeDriver();         // ChromeDriver'ı başlatır
        driver.manage().window().maximize(); // Ekranı tam boyutlu yapar.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // Sayfa yükleme süresi sınırlaması: 30 saniye
        /**
         Sayfa yükleme süresi (pageLoadTimeout) WebDriver'ın bir sayfanın tamamen yüklenmesini beklemesini sağlar.
         Bu süre boyunca WebDriver, sayfanın yüklenmesini bekler ve eğer belirtilen süre içinde sayfa tamamen yüklenmezse bir hata fırlatır.

         Sayfa yükleme süresi, genellikle sayfanın tamamen yüklenmesini beklemek için kullanılır.
         Örneğin, pageLoadTimeout(Duration.ofSeconds(30)) ifadesiyle 30 saniye olarak ayarlandığında,
         WebDriver sayfanın tamamen yüklenmesini 30 saniye boyunca bekler.
         Eğer sayfa belirtilen süre içinde yüklenmezse, bir TimeoutException hatası fırlatılır.

         Bu süre, sayfanın tamamen yüklenmesi için yeterli bir süre olarak ayarlanmalıdır.
         Sayfanın içeriği, resimleri, stil dosyalarını ve diğer kaynakları tamamen yüklemesi beklenir.
         */


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // Zımni bekleme süresi sınırlaması: 30 saniye
        /**
         Zımni bekleme süresi (implicitlyWait) WebDriver'ın belirli bir süre boyunca arama işlemlerini beklemesini sağlar.
         Bu süre boyunca WebDriver, sayfadaki elemanları bulmak için bekler.
         Eğer eleman hemen bulunamazsa, WebDriver belirtilen süre boyunca arama işlemini tekrar eder.

         Bu süre, WebDriver'ın elemanları bulmak için beklerken geçen süreyi temsil eder.
         Örneğin, implicitlyWait(Duration.ofSeconds(30)) ifadesiyle 30 saniye olarak ayarlandığında,
         WebDriver elemanları bulmak için 30 saniye boyunca bekler.

         Zımni bekleme süresi, elemanların sayfa yüklendikten hemen sonra görünmediği durumlarda kullanışlı olabilir.
         Bu süreyi, elemanların sayfada görünmesini beklemek için yeterli bir süre olarak ayarlayabilirsiniz.
         */
    }

    public static void waitAndClose() {
        MyFunction.wait(3); // 3 saniye bekleme yapar
        driver.quit();         // Sürücüyü kapatır
    }
}

         /**
         Özet:

         Bu kod, BaseDriver adında bir sınıf tanımlar.
         Sınıfın içinde driver adında bir static WebDriver değişkeni bulunur.
         Ayrıca, static bir blok içinde bazı işlemler gerçekleştirilir:

         Logger nesnesi oluşturularak loglar alınır ve
         sadece HATA (ERROR) seviyesindeki loglar görüntülenir.

         ChromeDriver nesnesi oluşturulur ve driver değişkenine atanır.

         driver üzerinden manage() metoduyla tarayıcı yönetimi yapılır.

         window().maximize() metodu kullanılarak tarayıcı penceresi tam boyutlu hale getirilir.

         driver üzerinden manage().timeouts() metodu kullanılarak
         sayfa yükleme süresi ve zımni bekleme süresi ayarlanır.

         Ayrıca, waitAndClose adında bir metot tanımlanır.
         Bu metot, MyFunction sınıfındaki wait metodu çağrılarak 3 saniye bekler ve
         ardından driver.quit() metodu kullanılarak WebDriver kapatılır.
         */
