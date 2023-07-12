package tests.day11_excelOtomasyonu;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void test01() throws IOException {

        String dosyaYolu="src/test/java/tests/day11_excelOtomasyonu/ulkeler.xlsx"; // dosya yolu

        // Eger excel dosyası, proje icerisinde degil de
        // masaustu, downloads gibi baska bir klasorun icinde ise
        // dosya yolu dinamik hale getirilebilir
        // System.out.println(System.getProperty("user.dir")); // dinamik dosya yolu

        FileInputStream fis = new FileInputStream(dosyaYolu);

        Workbook workbook= WorkbookFactory.create(fis); // excell dosyası kopyası

        /*
            olusturdugumuz workbook bizim excelimizi canli olarak kullanmaz
            23.satir calistiginda
            fis'deki yani verdigimiz dosyaYolun'da olan excel'deki
            tum bilgileri alip bu class'da olusturdugumuz
            workbook objesine yukler.
            YANI workbook objesi excel'deki bilgilerin bir kopyasina sahip olur
            workbook'da bir degisiklik yaparsak
            ana excel degismez.
            Eger ana excel'in de degismesini istiyorsak
            islem bittikten sonra
            yani class'in en sonunda
            workbook'daki yeni hali excel'e kaydetmemiz gerekir.
         */

        Sheet sheet = workbook.getSheet("sayfa1"); // sayfa 1

        Row row = sheet.getRow(3); // 3.satır

        Cell cell=row.getCell(2); // 2.data

        System.out.println(cell);

        // excel'de satir ve sutun numaralari index kullanir
        // yani 0'dan baslar
        // 12.satirda bulunan Azerbaycan'in ingilizce baskent isminin Baku oldugunu test edin

        Row onIkinciSatir = sheet.getRow(11);
        Cell ingilizceBaskent = onIkinciSatir.getCell(1);
        String expectedBaskentIsmi= "Baku";
        String actualBaskentIsmi= ingilizceBaskent.toString();
        Assert.assertEquals(expectedBaskentIsmi,actualBaskentIsmi);





    }


}
