package stepDefinitions;

import base.CommonAPI;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends CommonAPI {

    @Before
    public  void initializeTest() {
        String getOsNameFromSystem = System.getProperty("os.name");
        System.out.println("Opening the browser : Chrome");
        if(getOsNameFromSystem.contains("Mac")){
            System.setProperty("webdriver.chrome.driver", "/Users/kbmsiddique/Desktop/eBay/eBayBDD/driver/chromedriver");
        }else if(getOsNameFromSystem.contains("Windows")){
            System.setProperty("webdriver.chrome.driver", "/Users/kbmsiddique/Desktop/eBay/eBayBDD/driver/chromedriver.exe");
        }
        driver = new ChromeDriver();

        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS); // 20
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS); //35
        driver.get("https://www.eBay.com/");
        driver.manage().window().fullscreen();
    }
    @After
    public void tearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the brow ser : Chrome");
        driver.quit();
    }

}
