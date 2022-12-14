package runner.stepdefinitions.Instructor.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.auth.Logout;

public class LogoutStep {
    @Steps
    Logout l;

    @Given("I set POST api endpoints for logout")
    public void iSetPOSTApiEndpointsForLogout() {
        l.setUrl();
    }

    @When("I send request for logout")
    public void iSendRequestForLogout() {
        l.request();
    }

    @Then("I receive valid HTTP response code logout")
    public void iReceiveValidHTTPResponseCodeLogout() {
        l.verifStatusCode200();
    }

    @And("I receive valid data for logout")
    public void iReceiveValidDataForLogout() {
        l.validateBody();
    }
}
