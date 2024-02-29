package stepdefs;



import io.cucumber.java.After;

//public class Login_Page_stepdefs {

//}

import io.cucumber.java.en.*;

//import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page_stepdefs {
    WebDriver driver = new ChromeDriver();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @When("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("admin");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Admin123");
    }

    @And("User selects location as {string}")
    public void userSelectsLocation(String location) {
        WebElement locationField = driver.findElement(By.id("Inpatient Ward")); // Assuming "Inpatient Ward" is the id for location selection
        locationField.sendKeys("Inpatient Ward");
    }

    @And("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        // Assertion or validation of successful login
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

