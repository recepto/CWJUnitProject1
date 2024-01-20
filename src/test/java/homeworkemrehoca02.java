import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkemrehoca02 {
    WebDriver driver = new ChromeDriver();
    @Test
    public void Test02(){
        driver.get("https://yahoo.com/");
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();








    }







}
