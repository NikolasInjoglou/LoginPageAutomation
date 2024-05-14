package Pages;

import Utils.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebDriverFactory {


    @FindBy(tagName = "h1")
    WebElement header;

    private final String headerText = "Logged In Successfully";

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void validateSuccessfulLogin() {
        Assert.assertTrue(header.isDisplayed());
        Assert.assertEquals(header.getText(), headerText);
    }
}
