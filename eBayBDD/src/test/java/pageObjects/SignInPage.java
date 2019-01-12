package pageObjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class SignInPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchBox;
    @FindBy(how = How.CSS, using = "#gh-ug > a")
    public static WebElement signIn;
    @FindBy(how = How.CSS, using = "#userid")
    public static WebElement userName;
    @FindBy(how = How.ID, using = "pass")
    public static WebElement passWord;
    @FindBy(how = How.CSS, using = "#sgnBt")
    public static WebElement signInButton;
    @FindBy(how = How.CSS, using = "#errf")
    public static WebElement errorMessage;


    public static WebElement getSearchBox() {
        return searchBox;
    }

    public static WebElement getSignIn() {
        return signIn;
    }

    public static WebElement getUserName() {
        return userName;
    }

    public static WebElement getPassWord() {
        return passWord;
    }

    public static WebElement getSignInButton() {
        return signInButton;
    }

    public static WebElement getErrorMessage() {
        return errorMessage;
    }

    public void clickOnSignIn() throws InterruptedException{
        waitUntilClickAble(signIn);
        sleepFor(10);
       signIn.click();
    }

    //Data Table Cucumber
    public String signInUsingDataTable(String email, String passCode) throws InterruptedException {
        userName.sendKeys(email);
        System.out.println(passWord.isDisplayed());
        sleepFor(10);
        passWord.sendKeys(passCode);
        sleepFor(5);
        signInButton.click();
        String errorMessage1 = errorMessage.getText();
        System.out.println("Sign In Error Message" + errorMessage1);
        return errorMessage1;
    }

    //verifying the error message
    public void veriffyErrorMessage() {
        String expected = "Oops, that's not a match.";
        String actual = errorMessage.getText();
        Assert.assertEquals(actual,expected);
    }


}
