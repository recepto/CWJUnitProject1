import org.junit.Test;
import utilities.TestBase;

public class C28_TestBase extends TestBase {

    @Test
    public void test1() {
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test2() {
        driver.get("https://linkedin.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test3() {
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }


}