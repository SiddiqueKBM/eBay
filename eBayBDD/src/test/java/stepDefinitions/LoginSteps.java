package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObjects.SignInPage;

import java.util.List;
import java.util.Map;

public class LoginSteps extends SignInPage {

    SignInPage objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);

    @Given("^User is in login Page$")
    public void user_is_in_login_Page() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
        objOfSignInPage.clickOnSignIn();

    }

    @When("^Enter invalid email and password from Data Table$")
    public void enter_invalid_email_and_password_from_Data_Table(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<Map<String , String>> list = arg1.asMaps(String.class,String.class);
        objOfSignInPage.signInUsingDataTable(list.get(0).get("email"),list.get(0).get("passCode"));
        System.out.println("Ran from Data table");
    }

    @Then("^Error message appear$")
    public void error_message_appear() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        objOfSignInPage.veriffyErrorMessage();
    }

}