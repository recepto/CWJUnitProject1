import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C11_LocatorPractice02 {
    /*
    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.
*/
    private static WebDriver driver;
    WebElement searchBox;

    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1(){

        //https://id.heroku.com/login sayfasına gidiniz.
        driver.get("https://id.heroku.com/login ");

        //Bir mail adresi giriniz.
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

        //Bir password giriniz.
        driver.findElement(By.id("password")).sendKeys("123");

        //Login butonuna tıklayınız.
         driver.findElement(By.id("commit")).click();

        //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
       boolean displayed= driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();

       if (displayed){
           System.out.println("Kayıt Yapılamadı");
       }else {
           System.out.println("Kayıt Yapıldı");
       }


        //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.

        //Tüm sayfaları kapatınız.


    }

    
    
    
    
    
    

}
