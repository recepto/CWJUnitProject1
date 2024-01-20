import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task06 {
  /*
    Go to
    Click the correct submit button declared in the yellow line
    Finish the test after 50 correct click
*/
  static WebDriver driver;
  @Before
    public void setUp(){
      driver = new ChromeDriver();
      driver.manage().window().maximize();
  }
  @AfterClass
    public static void tearDown() throws InterruptedException {
      Thread.sleep(3000);
      driver.quit();
  }
   @Test
   public void test() throws InterruptedException {
       // Go to http://test.rubywatir.com/ifelse.php
       driver.get("http://test.rubywatir.com/ifelse.php");

       // Click the correct submit button declared in the yellow line

       for (int i = 0; i <50; i++) {
           String buttonNo=driver.findElement(By.id("buttonNumber")).getText();
           driver.findElement(By.xpath("//input[contains(@name, '" + buttonNo + "')]")).click();

       }

   }




}
