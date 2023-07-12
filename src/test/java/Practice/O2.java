package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class O2 extends TestBase {
    @Test
    public void test01() {
        //1-  bir class olusturun
        //2-  https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3-  Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4-  Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5-  Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Spend less"));

        //6-  Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();

        //7-  Birthday butonuna basin
        bekle(3);
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();

        //8-  Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

        //9-  Gift card details’den 25 $’i  secin
        WebElement ucret = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[4]/form[1]/div[7]/div[1]/div[2]/span[1]/span[1]/ul[1]/li[1]/span[1]/span[1]/span[1]/button[1]"));
        ucret.isSelected();
        //10- Urun ucretinin 25$ oldugunu test edin
        Assert.assertEquals(ucret.getText(), "25$");

        //11- Sayfayi kapatin

    }

}
