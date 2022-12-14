package runner.stepdefinitions.Instructor.Course.Enroll;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.course.enroll.GetEnroll;

public class ManageCostumerStep {
    @Steps
    GetEnroll ge;
    @Given("I set POST api endpoints for enroll")
    public void iSetPOSTApiEndpointsForEnroll() {
        ge.setUrl();
    }

    @When("I send POST HTTP request for enroll")
    public void iSendPOSTHTTPRequestForEnroll() {
        ge.requestEnroll();
    }

    @Then("I receive valid HTTP respone enroll code")
    public void iReceiveValidHTTPResponeEnrollCode() {
        ge.statusCode200();
    }

    @And("I receive valid data for enroll")
    public void iReceiveValidDataForEnroll() {
        ge.validate200();
    }
}
