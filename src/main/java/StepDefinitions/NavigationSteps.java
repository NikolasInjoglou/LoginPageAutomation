package StepDefinitions;

import Utils.DriverLibrary;
import Config.UiTestConstants;
import Pages.LoginPage;
import Utils.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class NavigationSteps extends WebDriverFactory {

    LoginPage loginPage;
    DriverLibrary driverLibrary;

    /**
     * Initializes the WebDriver by calling the initBrowser method from WebDriverFactory before each test.
     */
    @Before
    public void openBrowser() {
        WebDriverFactory.initBrowser();
    }

    /**
     * Tears down the WebDriver after each test. Closes any additional tabs opened during the test. Quits the WebDriver instance.
     */
    @After
    public void tearDown() {
        driver.quit();
    }

    public NavigationSteps() {
        driverLibrary = new DriverLibrary();
    }

    /**
     * Navigates to the page under test
     */
    @Given("I navigate to the login page")
    public void open_login_page() {
        String URL = UiTestConstants.BASE_URL;
        driver.get(URL);
        loginPage = new LoginPage();
    }

}
