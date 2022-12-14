package runner.stepdefinitions.Instructor.Category;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.category.Create;

public class CreateStep {
    @Steps
    Create c;
    @Given("I set POST api endpoints for create")
    public void iSetPOSTApiEndpointsForCreate() {
        c.setUrl();
    }

    @When("I send POST HTTP request for create")
    public void iSendPOSTHTTPRequestForCreate() {
        c.requestBody();
    }

    @Then("I receive valid HTTP respone create code")
    public void iReceiveValidHTTPResponeCreateCode() {
        c.verifStatusCode200();
    }

    @And("I receive valid data for create")
    public void iReceiveValidDataForCreate() {
        c.validateBody200();
    }
}
