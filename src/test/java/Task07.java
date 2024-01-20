import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task07 extends TestBase {
    @Test
    public void test01(){

        //Go to https://testpages.eviltester.com/styled/find-by-playground-test.html
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");
        int element =driver.findElements(By.tagName("p")).size();
        System.out.println("element = " + element);
        assertEquals("there are 42 web elements with 'p' tag on the page",element);








    }




   }





