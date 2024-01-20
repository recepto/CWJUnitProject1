import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_Locators {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/index.html");

    }

    @Test
    public void locatorTest() throws InterruptedException {

        //id ile locate ediyoruz
        WebElement basicpagetest = driver.findElement(By.id("basicpagetest"));
        basicpagetest.click();

        //linkText ile locate ediyoruz
        Thread.sleep(2000);
        WebElement index = driver.findElement(By.linkText("Index"));
        index.click();

        //partialLinkText ile locate ediyoruz
        Thread.sleep(2000);
        WebElement locatorsFindBy = driver.findElement(By.partialLinkText("Playground"));
        locatorsFindBy.click();

        //name ile locate ediyoruz
        WebElement pName2 = driver.findElement(By.name("pName2"));
        String pName2Text = pName2.getText();
        System.out.println("pName2Text = " + pName2Text);

        //tagName ile locate ediyoruz
        String header = driver.findElement(By.tagName("h1")).getText();
        System.out.println("header = " + header);

        //className ile locate ediyoruz
        WebElement classNameElement = driver.findElement(By.className("normal")); //--> bu class ile oluşturulan ilk elementi dönecek
        System.out.println("classNameElement = " + classNameElement.getText());

    }

    @AfterClass
    public static void tearDown(){

        driver.quit();

    }


}




