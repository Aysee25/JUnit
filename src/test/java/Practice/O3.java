package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class O3 extends TestBase {
    @Test
    public void test01() {
        //  1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/ ");
        //  2- Arama kutusuna “city bike” yazip aratin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike" + Keys.ENTER);
        //  3- Görüntülenen sonuçların sayısını yazdırın
        WebElement aramaSonucu = driver.findElement(By.xpath("//div[@class='sg-col-6-of-20 sg-col sg-col-6-of-16 sg-col-6-of-24 sg-col-6-of-12']"));
        System.out.println(aramaSonucu.getText());
        //  4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
        //  3- Görüntülenen ürünün fiyatını yazdırın
        WebElement ilkUrunFiyati = driver.findElement(By.xpath("//span[@class='a-price aok-align-center']"));
        System.out.println(ilkUrunFiyati.getText());

    }

}
