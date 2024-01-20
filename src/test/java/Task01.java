import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
      /*
 Go to the Amazon URL : https://www.clarusway.com/
 Print the position and size of the page.
 Adjust the position of the page as:
     xCoordinate: 70
     yCoordinate: 70
   Adjust the size of the page as:
     height: 900
     width: 900

 Test that the page is in the position and size you want.
 Close the page.
*/
    @Test
    public void test01(){
        WebDriver driver = new ChromeDriver();
        // Go to the Amazon URL : https://www.clarusway.com/
        driver.get("https://www.clarusway.com/");

      // Print the position and size of the page.
        System.out.println("Position :"+driver.manage().window().getPosition());
        System.out.println("Size :"+driver.manage().window().getSize());

       //  Adjust the position of the page as:
       // xCoordinate: 70
        // yCoordinate: 70
     // Adjust the size of the page as:
      //  height: 900
     //   width: 900


        Point targetPosition = new Point(70,70);
        Dimension targetSize = new Dimension(900, 900);

        driver.manage().window().setPosition(targetPosition);
        driver.manage().window().setSize(targetSize);


       //  Test that the page is in the position and size you want.
        System.out.println("New Position : "+driver.manage().window().getPosition());
        System.out.println("New Size : "+driver.manage().window().getSize());

        if (driver.manage().window().getPosition().equals(targetPosition) && driver.manage().window().getSize().equals(targetSize)) {
            System.out.println("Page position and size are as expected.");
        }else {

            System.out.println("Page position and size are NOT as expected.");
        }

       //  Close the page.
        driver.quit();














    }





}