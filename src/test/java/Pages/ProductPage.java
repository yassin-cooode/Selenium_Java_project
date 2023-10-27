package Pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {
    public static WebElement shopCart(){
        return Hooks.driver.findElement(By.className("showcart"));
    }
    public static WebElement proceedBtn(){
        return Hooks.driver.findElement(By.id("top-cart-btn-checkout"));
    }
    public static WebElement Sizes() {
        WebElement size = Hooks.driver.findElements(By.xpath("//div[@aria-labelledby=\"option-label-size-143\"]//div")).get(0);
        return size;
    }
    public static WebElement Colors(){
        WebElement color = Hooks.driver.findElements(By.xpath("//div[@aria-labelledby=\"option-label-color-93\"]//div")).get(0);
        return color;
    }
    public static WebElement notAvailSizes() {
        WebElement size = Hooks.driver.findElements(By.xpath("//div[@aria-labelledby=\"option-label-size-143\"]//div")).get(2);
        return size;
    }
    public static WebElement notAvailColors(){
        WebElement color = Hooks.driver.findElements(By.xpath("//div[@aria-labelledby=\"option-label-color-93\"]//div")).get(2);
        return color;
    }
    public static WebElement quantity(){
        WebElement quantity = Hooks.driver.findElement(By.id("qty"));
        return quantity;
    }
    public static WebElement addToCartBtn(){
        WebElement cartBtn = Hooks.driver.findElement(By.id("product-addtocart-button"));
        return cartBtn;
    }
    public static WebElement successMessage(){
        WebElement message = Hooks.driver.findElement(By.cssSelector("div[data-ui-id=\"message-success\"]"));
        return message;
    }
    public static WebElement errorMessage(){
        WebElement message = Hooks.driver.findElement(By.cssSelector("div[data-ui-id=\"message-error\"]"));
        return message;
    }
}
