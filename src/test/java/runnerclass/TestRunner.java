package runnerclass;

//public class TestRunner {

//}

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature/Login_01.feature",
    glue = "stepdefs",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}

