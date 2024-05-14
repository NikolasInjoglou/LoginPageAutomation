package StepDefinitions;

import Utils.DriverLibrary;
import Pages.LoginPage;
import Utils.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginSteps extends WebDriverFactory {


    DriverLibrary driverLibrary;
    LoginPage loginPage;

    public LoginSteps() {
        driverLibrary = new DriverLibrary();
        this.loginPage = new LoginPage();
    }

    /**
     * Enters the credentials in the relevant fields
     *
     * @param username the username
     * @param pass     the user password
     */
    @When("I enter {string} and {string}")
    public void iEnterCredentials(String username, String pass) {
        loginPage.fillCredentials(username, pass);
    }

    /**
     * Presses the Submit button in the login page
     */
    @And("I press the submit button")
    public void iPressTheSubmitButton() {
        loginPage.pressSubmitButton();
    }
}
