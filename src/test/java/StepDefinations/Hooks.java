package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static ChromeDriver driver;

    @Before
    public void siteNavigation()
    {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
