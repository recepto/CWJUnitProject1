import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkemrehoca01 {
   WebDriver driver = new ChromeDriver();
    @Test
    public void Test01(){
      driver.get("https://www.w3schools.com/");
      driver.get("https://stackoverflow.com/");
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
      driver.quit();




    }


}
