import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task03 {
    /*
Go to Clarusway homepage
Do the following tasks by creating 3 different test methods.
Check if the URL contains clarusway.
Check if the title does not contain Python.
Check if the title equals to "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce"
 */

 static WebDriver driver;

 @BeforeClass
    public static void setUp(){

     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.clarusway.com/");
 }
@AfterClass
    public static void tearDown() throws InterruptedException{
   Thread.sleep(3000);
   driver.quit();
}
@Test
 public void test1(){
     boolean url = driver.getCurrentUrl().contains("clarusway");
     assertTrue(url);

}

@Test
 public void test2(){
     boolean title1=driver.getTitle().contains("Pyhton");
     assertFalse(title1);

}

@Test
 public void test3(){
     boolean title2=driver.getTitle().equals("Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce");
     assertTrue(title2);
}






}
