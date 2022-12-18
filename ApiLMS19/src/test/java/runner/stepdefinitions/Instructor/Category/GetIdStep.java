package runner.stepdefinitions.Instructor.Category;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.category.GetId;

public class GetIdStep {
    @Steps
    GetId gid;
    @Given("I set GET api endpoint for get category id")
    public void iSetGETApiEndpointForGetCategoryId() {
        gid.setUrl();
    }

    @When("I send GET HTTP request for get category id")
    public void iSendGETHTTPRequestForGetCategoryId() {
        gid.requestId();
    }

    @Then("I receive valid HTTP respone get category id")
    public void iReceiveValidHTTPResponeGetCategoryId() {
        gid.statusCode200();
    }

    @And("I receive valid data for get category id")
    public void iReceiveValidDataForGetCategoryId() {
        gid.validate200();
    }
}
