package StepDefinitions;

import Pages.HomePage;
import Utils.WebDriverFactory;
import io.cucumber.java.en.Then;

public class HomePageSteps extends WebDriverFactory {

    HomePage homePage;

    public HomePageSteps() {
        homePage = new HomePage();
    }

    /**
     * Validates that the login was successful by locating and validating the header text
     */
    @Then("I validate that the login was successful")
    public void iValidateThatTheLoginWasSuccessful() {
        homePage.validateSuccessfulLogin();
    }
}
