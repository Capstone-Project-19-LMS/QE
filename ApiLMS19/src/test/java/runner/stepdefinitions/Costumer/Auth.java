package runner.stepdefinitions.Costumer;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Auth {
    @Given("I set POST api endpoints for register with {string}, {string} and {string}")
    public void iSetPOSTApiEndpointsForRegisterWithAnd(String arg0, String arg1, String arg2) {
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
    }

    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
    }

    @And("I receive valid data for new account")
    public void iReceiveValidDataForNewAccount() {
    }


}
