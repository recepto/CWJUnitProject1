import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class homeworkemrehoca03 extends TestBase {


    @Test
    public void homeworkemrehoca03(){
        driver.get("https://www.amazon.com");


        // Set Path of the Chrome driver
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open URL of the Website
        driver.get("https://www.amazon.com");
        // Maximize Window
        driver.manage().window().maximize();
        // Expect Title
        // Get Title of current Page
        driver.getTitle();

        // Validate/Compare Page Title
        assertEquals("Amazon.com.Spend less.Smile more.",driver.getTitle());

        // Close Browser
        driver.quit();





    }
    
    
    
    
    
    
    
}
