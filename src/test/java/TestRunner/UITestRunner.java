package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/ui/Login.feature",
    glue = {"StepDefinitions"},
    plugin = {"pretty", "html:target/cucumberUIReports.html"}
)
public class UITestRunner {

}

