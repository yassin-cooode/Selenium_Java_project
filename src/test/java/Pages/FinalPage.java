package Pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FinalPage {
    public static WebElement thanksMessage(){
        return Hooks.driver.findElement(By.cssSelector("span[data-ui-id=\"page-title-wrapper\"]"));
    }
}
