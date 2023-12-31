package tests.day05_maven_JUnitFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class C01_MavenIlkTest {
    public static void main(String[] args) throws InterruptedException {
/*
    Selenium 4.7.0 ile Selenium kendi WebDriver driver'ini olusturma
    ve kullanabilme imkani verdi

    Tum sirketler Selenium WebDriver'i kullanmayabilir
    Sirketlerde eskiden beri kullanilan bir WebDriver varsa
    onu projemimize eklememiz ve kullanmamiz istemebilir

    Boyle bir durumda istenen WebDriver'i da
    pom.xml'e eklememiz gerekir
 */

 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

 driver.get("https://amazon.com");

 Thread.sleep(3000);
 driver.close();




    }
}
