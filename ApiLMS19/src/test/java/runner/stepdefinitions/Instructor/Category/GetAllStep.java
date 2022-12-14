package runner.stepdefinitions.Instructor.Category;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.category.GetAll;

public class GetAllStep {
    @Steps
    GetAll ga;
    @Given("I set GET api endpoint for get all category")
    public void iSetGETApiEndpointForGetAllCategory() {
        ga.setUrl();
    }

    @When("I send GET HTTP request for get all category")
    public void iSendGETHTTPRequestForGetAllCategory() {
        ga.requestGetAll();
    }

    @Then("I receive valid HTTP respone get all category")
    public void iReceiveValidHTTPResponeGetAllCategory() {
        ga.statusCode200();
    }

    @And("I receive valid data for get all category")
    public void iReceiveValidDataForGetAllCategory() {
        ga.validate200();
    }
}
