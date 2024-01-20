import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Task02 {
    /*
     Create chrome driver object via WebDriverManager
     Maximize the window
     Open google home page https://www.google.com/
     Wait for 3 seconds
     Go to the https://www.youtube.com/
     Get the title and URL of the page
     Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
     Check if the URL contains the word "youtube" print console "URL contains "youtube" or "URL does not contain "youtube"
     Then go to https://www.instagram.com/
     Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
     Navigate Back to the previous webpage
     Refresh the page
     Navigate to forward
     Wait for 3 seconds
     Close the browser
*/
    @Test
    public void test() throws InterruptedException{
       //Create chrome driver object via WebDriverManager
        WebDriver driver = new ChromeDriver();


        //Maximize the window
        driver.manage().window().maximize();

        //Open google home page https://www.google.com/
        driver.get(" https://www.google.com/");

        // Wait for 3 seconds
        Thread.sleep(3000);

        //Go to the https://www.youtube.com/
        driver.get("https://www.youtube.com");

        // Get the title and URL of the page
        String pageTitle = driver.getTitle();
        String pageURL = driver.getCurrentUrl();

        //Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
       if (pageTitle.contains("YouTube")) {
           System.out.println("Title contains YouTube");
       }else {
           System.out.println("Title does not contain YouTube");
       }
       //Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"
        if (pageURL.contains("youtube")) {
            System.out.println("URL contains youtube");
        }else {
            System.out.println("URL does not contain youtube");
        }

       // Then go to https://www.instagram.com/
        driver.get("https://www.instagram.com/");


        // Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
        String instagramTitle = driver.getTitle();
        boolean isTitleContainsInstagram =instagramTitle.contains("Instagram");
        assertTrue("Title contains Instagram", isTitleContainsInstagram);

        //Navigate Back to the previous webpage
        driver.navigate().refresh();

        // Refresh the page
        driver.navigate().forward();

        // Wait for 3 seconds
        Thread.sleep(3000);

        // Close the browser
        driver.quit();







    }

























}
