package pageObjects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchBox;
    @FindBy(how = How.CSS, using = "#gh-btn")
    public static WebElement searchButton;
    @FindBy(how = How.CSS, using = "#w3-w0 > li:nth-child(1) > ul > li > ul > li:nth-child(2) > span")
    public static WebElement verifyPage;

    public void clickOnSearchBox(){
        waitUntilClickAble(searchBox);
        searchBox.click();
    }
    public void i_am_in_Home_Page()  {
        System.out.println("You are in Home Page");
    }
    public void enterProductName(String product) {
        System.out.println("Home Page title: " + driver.getTitle());
        searchBox.sendKeys(product, Keys.ENTER);
    }
    public void clcikSearchButton(){
        searchButton.click();
    }
    public void userInLaptopPage() throws InterruptedException {
        sleepFor(5);
        String title = driver.getTitle();
        System.out.println("Get Product Search Page Title: " + title);
    }

}
