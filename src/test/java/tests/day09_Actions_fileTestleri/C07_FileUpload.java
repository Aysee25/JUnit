package tests.day09_Actions_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C07_FileUpload extends TestBase {
    @Test
    public void test01(){
        //1.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //2.chooseFile butonuna basalim
        /*
            Eger chooseFile butonuna basarsak
            bilgisayarimizin klasor yapisi acilir
            oradan dosya secmek icin mouse'u kullanamayacagimizdan
            bu yontemle dosya upload mumkun degildir
            Bunun yerine selenium'un bize sundugu cozumu kullaniyoruz
            chooseFile butonuna sendKeys ile
            yuklemek istedigimiz dosyanin dosyaYolunu gonderiyoruz
         */
        //3.Masaustune kopyalaıdgimiz avatar.png dosyayi secelim.
        WebElement chooseFileButonElementi = driver.findElement(By.id("file-upload"));
        String dinamikDosyaYolu = System.getProperty("user.home") + "/Desktop/avatar.png";
        chooseFileButonElementi.sendKeys(dinamikDosyaYolu);
        bekle(2);

        //4.Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        bekle(2);
        //5.“File Uploaded!” textinin goruntulendigini test edelim.
        WebElement fileUploadedElementi= driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        Assert.assertTrue(fileUploadedElementi.isDisplayed());
    }
}
