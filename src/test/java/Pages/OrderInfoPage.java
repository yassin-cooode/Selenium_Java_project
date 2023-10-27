package Pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Watchable;

public class OrderInfoPage {
    public static WebElement getAddedItems(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"title\"] strong span:nth-child(2)"));
    }
    public static WebElement emailField(){
        // yasso@gmail.com
        return Hooks.driver.findElement(By.id("customer-email"));
    }
    public static WebElement firstName(){
        // yasso
        return Hooks.driver.findElement(By.name("firstname"));
    }
    public static WebElement lastName(){
        // gaber
        return Hooks.driver.findElement(By.name("lastname"));
    }
    public static WebElement company(){
        // NCR
        return Hooks.driver.findElement(By.name("company"));
    }
    public static WebElement streetAddress_1(){
        // maadi
        return Hooks.driver.findElement(By.name("street[0]"));
    }
    public static WebElement streetAddress_2(){
        // horia
        return Hooks.driver.findElement(By.name("street[1]"));
    }
    public static WebElement streetAddress_3(){
        // hashem
        return Hooks.driver.findElement(By.name("street[2]"));
    }
    public static WebElement cityField(){
        //cairo
        return Hooks.driver.findElement(By.name("city"));
    }
    public static WebElement stateSelectField(){
        // California
        return Hooks.driver.findElement(By.name("region_id"));
    }
    public static WebElement zipCodeField(){
        // 12345
        return Hooks.driver.findElement(By.name("postcode"));
    }
    public static WebElement countrySelectField(){
        // United States
        return Hooks.driver.findElement(By.name("country_id"));
    }
    public static WebElement phoneField(){
        // 0103321206
        return Hooks.driver.findElement(By.name("telephone"));
    }
    public static WebElement fixedShippingMethod(){
        return Hooks.driver.findElement(By.xpath("//td[text()=\"Fixed\"]//parent::tr//td//input"));
    }
    public static WebElement nextBtn(){
        return Hooks.driver.findElement(By.cssSelector("button[data-role=\"opc-continue\"]"));
    }
}
