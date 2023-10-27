package Pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReviewPaymentsPage {

    public static WebElement placeOrderBtn(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"action primary checkout\"]"));
    }
}
