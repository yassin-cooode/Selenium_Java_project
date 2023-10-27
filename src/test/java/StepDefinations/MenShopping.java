package StepDefinations;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MenShopping {

    @Given("Men category in the home page")
    public void Men_category_in_the_home_page()
    {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(StartPage.getMenBtn()).perform();
    }
    @When("User hovers above men dropdown, selects tops and selects jackets")
    public void User_hovers_above_men_dropdown_selects_tops_and_selects_jackets()
    {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(StartPage.getMenTops()).moveToElement(StartPage.getMenJackets()).click().perform();
    }
    @And("Chooses one of results")
    public void Chooses_one_of_results()
    {
        SearchResultsForMen.getAnyProduct(0).click();
    }
    @And("Chooses the size, color and quantity")
    public void Chooses_the_size_color_and_quantity_of_the_jacket()
    {
        ProductPage.Sizes().click();
        ProductPage.Colors().click();
        ProductPage.quantity().click();
    }
    @Then("See a message indicating that the product is added")
    public void See_a_message_indicating_that_the_product_is_added()
    {
        Assert.assertTrue(ProductPage.successMessage().isDisplayed());
    }
    @And("User hovers above men dropdown, selects tops and selects Hoodies and Sweatshirts")
    public void User_hovers_above_men_dropdown_selects_tops_and_selects_Hoodies_and_Sweatshirts()
    {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(StartPage.getMenBtn()).moveToElement(StartPage.getMenTops()).moveToElement(StartPage.getMenHoodies()).click().perform();
    }
    @And("Go to the cart and click proceed to Checkout")
    public void Go_to_the_cart_and_click_proceed_to_Checkout()
    {
        ProductPage.shopCart().click();
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(ProductPage.proceedBtn()).click().perform();
    }
    @Then("Will see the selected products in order summary section")
    public void Will_see_the_selected_products_in_order_summary_section()
    {
        Assert.assertTrue(OrderInfoPage.getAddedItems().isDisplayed());
    }
    @And("Fill the required information about the shipping")
    public void Fill_the_required_information_about_the_shipping() throws InterruptedException {
        Thread.sleep(5000);

        OrderInfoPage.emailField().sendKeys("yasso@gmail.com");
        OrderInfoPage.firstName().sendKeys("yasso");
        OrderInfoPage.lastName().sendKeys("gaber");
        OrderInfoPage.company().sendKeys("NCR");
        OrderInfoPage.streetAddress_1().sendKeys("maaadi");
        OrderInfoPage.streetAddress_2().sendKeys("horia");
        OrderInfoPage.streetAddress_3().sendKeys("hashem");
        OrderInfoPage.cityField().sendKeys("cairo");
        Select select = new Select(OrderInfoPage.stateSelectField());
        select.selectByVisibleText("California");
        OrderInfoPage.zipCodeField().sendKeys("12345");
        OrderInfoPage.phoneField().sendKeys("0103321206");
    }
    @And("Selects the shipping method")
    public void Selects_the_shipping_method() throws InterruptedException {
        Thread.sleep(3000);
        OrderInfoPage.fixedShippingMethod().click();
    }
    @And("Click on Next button")
    public void Click_on_Next_button()
    {
        OrderInfoPage.nextBtn().click();
    }
    @And("Click on place order button to finish the process")
    public void Click_on_place_order_button_to_finish_the_process() throws InterruptedException {
        Thread.sleep(4000);
        ReviewPaymentsPage.placeOrderBtn().click();
    }
    @Then("Will Thank you for your purchase! message")
    public void Will_Thank_you_for_your_purchase_message()
    {
        Assert.assertTrue(FinalPage.thanksMessage().isDisplayed());
    }
}
