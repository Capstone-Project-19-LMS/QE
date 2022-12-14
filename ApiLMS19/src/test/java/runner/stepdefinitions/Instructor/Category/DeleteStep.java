package runner.stepdefinitions.Instructor.Category;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.category.Delete;

public class DeleteStep {
    @Steps
    Delete d;
    @Given("I set DEL api endpoint for delete category")
    public void iSetDELApiEndpointForDeleteCategory() {
        d.setUrl();
    }

    @When("I send DEL HTTP request for delete category")
    public void iSendDELHTTPRequestForDeleteCategory() {
        d.requestDelete();
    }

    @Then("I receive valid HTTP respone delete category")
    public void iReceiveValidHTTPResponeDeleteCategory() {
        d.statusCode200();
    }

    @And("I receive valid data for delete category")
    public void iReceiveValidDataForDeleteCategory() {
        d.validate200();
    }
}
