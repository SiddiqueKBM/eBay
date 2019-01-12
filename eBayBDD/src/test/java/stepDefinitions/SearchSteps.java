package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;

public class SearchSteps extends HomePage {
    HomePage objHomePage = PageFactory.initElements(driver, HomePage.class);
    @Given("^I am in Home Page$")
    public void i_am_in_Home_Page()  {
        // Write code here that turns the phrase above into concrete actions
        objHomePage.i_am_in_Home_Page();
    }

    @When("^Enter product name \"([^\"]*)\" in search box$")
    public void enter_product_name_in_search_box(String product)  {
        // Write code here that turns the phrase above into concrete actions
        objHomePage.enterProductName(product);

    }

    @When("^Click Search Button$")
    public void click_Search_Button()  {
        // Write code here that turns the phrase above into concrete actions
        objHomePage.clcikSearchButton();
    }

    @Then("^Laptop items appear$")
    public void laptop_items_appear() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        objHomePage.userInLaptopPage();
    }
   }
