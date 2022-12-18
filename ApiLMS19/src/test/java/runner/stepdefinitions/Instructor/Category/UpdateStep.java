package runner.stepdefinitions.Instructor.Category;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.category.Update;

public class UpdateStep {
    @Steps
    Update u;
    @Given("I set PUT api endpoint for update category")
    public void iSetPUTApiEndpointForUpdateCategory() {
        u.setUrl();
    }

    @When("I send PUT HTTP request for update category")
    public void iSendPUTHTTPRequestForUpdateCategory() {
        u.requestUpdateBody();
    }

    @Then("I receive valid HTTP respone update category")
    public void iReceiveValidHTTPResponeUpdateCategory() {
        u.verifStatusCode200();
    }

    @And("I receive valid data for update category")
    public void iReceiveValidDataForUpdateCategory() {
        u.validateBody200();
    }
}
