package Pages;

import StepDefinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPage {

    public static WebElement logo(){
        WebElement logoWeb = Hooks.driver.findElement(By.cssSelector("a[class=\"logo\"]"));
        return logoWeb;
    }
    public static WebElement getSearchBar(){
        WebElement searchBar = Hooks.driver.findElement(By.id("search"));
        return searchBar;
    }
    public static WebElement getWhatsNew(){
        WebElement wNBtn = Hooks.driver.findElement(By.id("ui-id-3"));
        return wNBtn;
    }
    public static WebElement getWomenBtn(){
        WebElement womenBtn = Hooks.driver.findElement(By.id("ui-id-4"));
        return womenBtn;
    }
    public static WebElement getMenBtn(){
        WebElement menBtn = Hooks.driver.findElement(By.id("ui-id-5"));
        return menBtn;
    }
    public static WebElement getGearBtn(){
        WebElement gearBtn = Hooks.driver.findElement(By.id("ui-id-6"));
        return gearBtn;
    }
    public static WebElement getTrainingBtn(){
        WebElement trainingBtn = Hooks.driver.findElement(By.id("ui-id-7"));
        return trainingBtn;
    }
    public static WebElement getSaleBtn(){
        WebElement saleBtn = Hooks.driver.findElement(By.id("ui-id-8"));
        return saleBtn;
    }
    public static WebElement getMenTops(){
        WebElement menTops = Hooks.driver.findElement(By.id("ui-id-17"));
        return menTops;
    }
    public static WebElement getMenJackets(){
        return Hooks.driver.findElement(By.id("ui-id-19"));
    }

    public static WebElement getMenHoodies(){
        WebElement menHoodies = Hooks.driver.findElement(By.id("ui-id-20"));
        return  menHoodies;
    }
}
