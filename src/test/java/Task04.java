import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Task04 {
    /*
     Create chrome driver object by using @Before annotation
     Navigate to  https://testpages.herokuapp.com/styled/index.html
     Click on  Calculator under Micro Apps
     Type any number in the first input
     Type any number in the second input
     Click on Calculate
     Get the result(getText() method)
     Verify the result
     Print the result
     Close the browser by using @After annotation
*/
    //Create chrome driver object by using @Before annotation
    static WebDriver driver ;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void test(){
    //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("Navigate to  https://testpages.herokuapp.com/styled/index.html");

    // Click on  Calculator under Micro Apps
    driver.findElement(By.id("calculatetest")).click();


    //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("10");

     //Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("10");

    // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        //Get the result(getText() method)
        String result = driver.findElement(By.id("answer")).getText();
        //Verify the result
        assertEquals("45",result);
        //Print the result
        System.out.println(result);

    }

    //Close the browser by using @After annotation
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
















