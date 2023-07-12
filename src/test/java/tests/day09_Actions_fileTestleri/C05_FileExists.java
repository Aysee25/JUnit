package tests.day09_Actions_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C05_FileExists {
    @Test
    public void test01(){
    // /Users/ayse  /Downloads/avatar.png

        //Assert.assertTrue(Files.exists(Path.of("/Users/ayse/Downloads/avatar.png")));
        Assert.assertTrue(Files.exists(Paths.get("/Users/ayse/Downloads/avatar.png")));


    }
    @Test
    public void dinamikTest(){
        // dosya yolunu dinamik yapalim
        // /Users/ayse  /Downloads/avatar.png
        //C:\Users\kantoor\Downloads\avatar.png

        //Java'da dosya yolunu bize veren, 2 tane kod vardır

        //1-Calistigimiz klasororun dosay yolunu almak istersek
        System.out.println(System.getProperty("user.dir"));
        ///Users/ayse/IdeaProjects/team116_JUnit/src/test/java/tests/day08_iFrame_windows_actionsClass

        //2- Bilgisayarimiizn ana dosya yolu
        System.out.println(System.getProperty("user.home"));
        ///Users/ayse

        // bu bilgileri kullanarak
        // indirdigimiz dosyanın dosya yolunu elde etmek istersek
        //iki parcada elde edebiliriz
        //  System.out.println(System.getProperty("user.home")); herkeste aynı olan

        String dinamikDosyaYolu = System.getProperty("user.home") + "/Downloads/avatar.png";

        System.out.println(dinamikDosyaYolu);

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu))); ///Users/ayse/Downloads/avatar.png
    }

}
