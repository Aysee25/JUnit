package tests.day05_maven_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_JUnitTestNotasyonu {

    /*
        Junit'in bize kazandirdigi en onemli yeniliklerden biri
        @Test notasyonudur.

        Notasyon (annotation) kucuk bilgiler(meta data) barindiran yapilardir.
        sadece bir yazi ya da gosterim degillerdir
        yaptiklari islemler vardir

        @Test notasyonu siradan bir method'u
        tek basina calistirilabilir bir test method'una donusturur

        JUnit ile test method'lari istersek tek basina,
        istersek de class level'dan calistirilip
        tum testlerin birlikte calisabilecegi bir yapiya donusur.

        JUnit class icerisindeki test method'larini
        belirsiz bir sirada calistirir.
        Test method'larinin hangi sira ile calisacagini
        ONGOREMEYIZ ve DUZENLEYEMEYIZ
     */
    // Bir class'da 3 farkli test olsa
    // ve ben testleri istersem toplu, istersem bagimsiz olarak calistirabilsem

    @Test
    public  void amazonTesti(){
        //amazon'a gidelim ve Url'in amazon icerdigini test edip
        //sayfayı kapatın
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

        String exceptedUrlIcerik="amazon";
        String actualUrl= driver.getCurrentUrl();
        if (exceptedUrlIcerik.contains(actualUrl)){
            System.out.println("Amazon Testi PAssed");
        }else {
            System.out.println("Amazon Testi Failed");
        }

        driver.close();

    }
@Test
    public void wisequarterTesti(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //wise quarter anasayfasına gidin
        driver.get("https://wisequarter.com");

        // title'da Wise Quarter icerdigini test edin
        String exceptedTitleIcerik="Wise Quarter";
        String actualTitle= driver.getTitle();
    if (exceptedTitleIcerik.contains(actualTitle)){
        System.out.println("Wise Quarter Title Testi PAssed");
    }else {
        System.out.println("Wise Quarter Title Testi Failed");
    }
    //sayfayı kapatin
    driver.close();
}




}
