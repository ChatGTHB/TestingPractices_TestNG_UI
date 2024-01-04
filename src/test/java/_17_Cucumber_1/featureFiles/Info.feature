 # feature dosyasını oluşturmak için “.feature” uzantısı kullanılmalıdır.

  # Feature: Testini yapacağımız konunun başlığıdır.

  # Background: Tüm senaryolar için ortak adım olarak kullanılır.

  # Scenario: Feature tanımı içerisinde uygulanacak senaryoların adını belirttiğimiz anahtar kelimedir.

  # Scenario Outline: Bu anahtar kelime Aynı senaryoyu farklı değerlerle kullanmaya yarar.

  # Given: Sistemin başlangıç durumunu göstermektedir. Yani belirlenen senaryoda başlangıç koşulumuzu tanımladığımız
  #        kısımdır aslında. Zorunludur.

  # When : Bir olay yada aksiyonu tanımlamak için kullandığımız anahtar kelimedir.

  # Then : When adımında gerçekleştirilen olay sonrası beklenen sonucu yada durumu tanımladığımız anahtar kelimedir.

  # And : Bahsettiğimiz Given, When, Then anahtar kelimelerinden birden fazla kullanmak istediğimizde bu anahtar
  #        kelimeden faydalanıyoruz.

  # Örnek
 Feature: Login Action

   Scenario: Successful Login with Valid Credentials
     Given User is on Home Page
     When User Navigate to LogIn Page
     And User enters UserName and Password
     Then Message displayed Login Successfully
