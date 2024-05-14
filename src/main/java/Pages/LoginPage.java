package Pages;

import Utils.DriverLibrary;
import Utils.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends WebDriverFactory {

    DriverLibrary driverLibrary;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit")
    private WebElement submitButton;


    public LoginPage() {
        PageFactory.initElements(driver, this);
        driverLibrary = new DriverLibrary();
    }

    public void fillCredentials(String username, String pass) {
        driverLibrary.sendKeysToElement(usernameInput, username);
        driverLibrary.sendKeysToElement(passwordInput, pass);
    }

    public void pressSubmitButton() {
        driverLibrary.clickElement(submitButton);
    }

}
