import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C30_WindowHandle2 extends TestBase {
    /*
        Open browser
        Create a new tab
        Create a new window
        Open https://www.linkedin.com/ in the second tab
        Open https://clarusway.com/ in the last window
        Open https://www.youtube.com/ in the first tab
    */
    @Test
    public void test01() throws InterruptedException {
//        Open browser
        String tab1WindowHandle = driver.getWindowHandle();//ilk açılan sayfanın window handle değeri
//        Create a new tab
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        String tab2WindowHandle = driver.getWindowHandle();//2. TAB'in window handle değeri
//        Create a new window
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        String newWindowHandle = driver.getWindowHandle();//Yeni sayfanın window handle değeri

//        Open https://www.linkedin.com/ in the second tab
        //driver 3. sayfada olduğu için önce driver'ı 2. TAB'e switch yapmamamız lazım.
        driver.switchTo().window(tab2WindowHandle);
        driver.get("https://www.linkedin.com/");

//        Open https://clarusway.com/ in the last window
        //driver 2. tab ' de olduğu için önce yeni Window'a switch yapmamız lazım
        Thread.sleep(3000);
        driver.switchTo().window(newWindowHandle);

//        Open https://www.youtube.com/ in the first tab
        Thread.sleep(3000);
        driver.switchTo().window(tab1WindowHandle).get("https://www.youtube.com/ ");



    }



}