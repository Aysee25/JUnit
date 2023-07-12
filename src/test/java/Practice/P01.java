package Practice;

import org.junit.Test;

public class P01 {
 /*
    @Test               // Yapacağımız Test kodlarını çalıştıracak
    @BeforeClass        //Sadece 1 kere çalışır.
    @Before             //Her test başında bir kere çalışacak
    @AfterClass        // Bütün testler bitince 1 kez çalışır
    @After             // Her test sonunda çalışacak
     */

    @Test
    public void Ali(){System.out.println("Ali");}

    @Test
    public void Esat(){System.out.println("Esat");}

    @Test
    public void Saida(){System.out.println("Saida");}


}
