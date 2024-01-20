import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Task08 extends TestBase {
   @Test
   public void test(){
       driver.get("https://app.endtest.io/guides/docs/how-to-test-checkboxes/");

       List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

       for (WebElement checkbox : checkboxes) {
           checkbox.click();
       }

       for (WebElement checkbox : checkboxes) {
           Assert.assertTrue(checkbox.isSelected());
       }

       driver.quit();
   }





   }






