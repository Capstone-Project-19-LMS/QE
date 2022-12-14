package runner.stepdefinitions.Instructor.Course.Enroll;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.course.enroll.UpdateEnroll;

public class UpdateStep {
    @Steps
    UpdateEnroll ue;
    @Given("I set PUT api endpoint for update enroll")
    public void iSetPUTApiEndpointForUpdateEnroll() {
        ue.setUrl();
    }

    @When("I send PUT HTTP request for update enroll")
    public void iSendPUTHTTPRequestForUpdateEnroll() {
        ue.requestUpdateEnroll();
    }

    @Then("I receive valid HTTP respone update code")
    public void iReceiveValidHTTPResponeUpdateCode() {
        ue.statusCode200();
    }

    @And("I receive valid data for update")
    public void iReceiveValidDataForUpdate() {
        ue.validate200();
    }
}
