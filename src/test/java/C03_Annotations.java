import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class C03_Annotations {
    /*
    *** ANNOTATIONS ***
    6 Temel Junit notasyonu vardır.
    @Test: Bağımsız olarak çalışabilecek bir test oluşturmamızı sağlar. Return type -> void Access modifier: Public
    @Before : Test başlamadan önce yapılması gereken hazırlıkları yaptığımız method için kullanılır. Her method'dan önce çalışır.
    @After : Her testten sonra çalışır, test yapıldıktan sonra kapatma gibi fonksiyonları yerine getirir.
    @Ignore : Yazıldığı method' un çalıştırılmamasını sağlar. Test calistirildiginda bu method' un Ignore olduğu raporda görünür.
*/
    @Before
    public void before(){
        System.out.println("before methodu");
    }
    @After
    public void after(){
        System.out.println("After methodu");
    }

    @Test
    public void test01(){
        System.out.println("test1");
    }
    @Test
    public void test02(){
        System.out.println("test2");
    }
    @Test
    public void test03(){
        System.out.println("test3");
    }
    @Test @Ignore("test Ignored: istendiğinde bu alana parametre olarak testin Ignore olma sebebini yazabiliriz")
    public void test04(){
        System.out.println("test4");
    }
    @Test
    public void test05(){
        System.out.println("test5");
    }

}
