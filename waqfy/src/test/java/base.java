
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
public class base {
    public WebDriver driver ;
    @BeforeTest
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://waqfi-portal-uat.2p.com.sa/");
        Thread.sleep(4000);
       // driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @AfterTest
    public void close_browser() {
        driver.quit();

    }

@BeforeMethod
public void wait_before() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
}
@AfterMethod
public void wait_after() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
}



}