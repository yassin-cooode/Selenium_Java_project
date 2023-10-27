package Pages;

import StepDefinations.Hooks;
import StepDefinations.MenShopping;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultsForMen {
    public static WebElement getAnyProduct(int x){
        WebElement anyProduct = Hooks.driver.findElements(By.cssSelector("li[class=\"item product product-item\"]")).get(x);
        WebElement anyProductSlct = anyProduct.findElement(By.tagName("a"));
        return anyProductSlct;
    }

}
