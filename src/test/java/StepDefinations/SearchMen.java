package StepDefinations;

import Pages.ProductPage;
import Pages.SearchResultsForMen;
import Pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SearchMen {
    @Given("Home page search bar")
    public void Home_page_search_bar()
    {
        StartPage.getSearchBar().click();
    }
    @When("User type men pants and search")
    public void User_type_men_pants_and_search()
    {
        Actions actions = new Actions(Hooks.driver);
        actions.sendKeys(StartPage.getSearchBar() , "men pants" , Keys.RETURN).perform();
    }
    @And("Choose any product from search results")
    public void Choose_any_product_from_search_results()
    {
        SearchResultsForMen.getAnyProduct(0).click();
    }
    @And("Choose the size of the product")
    public void Choose_the_size_of_the_product()
    {
        ProductPage.Sizes().click();
    }
    @And("Choose the color of the product")
    public void Choose_the_color_of_the_product()
    {
        ProductPage.Colors().click();
    }
    @And("Choose the quantity")
    public void Choose_the_quantity()
    {
        ProductPage.quantity().click();
    }
    @And("Click add to cart button")
    public void Click_add_to_cart_button()
    {
        ProductPage.addToCartBtn().click();
    }
    @Then("A message will appear indicating that the product is added")
    public void A_message_will_appear_indicating_that_the_product_is_added()
    {
        Assert.assertTrue(ProductPage.successMessage().getText().contains("You added"));
    }
    @And("Choose the size of the product that is not available")
    public void Choose_the_size_of_the_product_that_is_not_available()
    {
        ProductPage.notAvailSizes().click();
    }
    @And("Choose the color of the product that is not available")
    public void Choose_the_color_of_the_product_that_is_not_available()
    {
        ProductPage.notAvailColors().click();
    }
    @Then("A message will appear indicating that the product is not available")
    public void A_message_will_appear_indicating_that_the_product_is_not_available()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(ProductPage.errorMessage().isDisplayed());
        softAssert.assertAll();
    }

}
