package runner.stepdefinitions.Instructor.Course;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.course.Delete;

public class DeleteStep {
    @Steps
    Delete d;
    @Given("I set DELETE api endpoint for delete course")
    public void iSetDELETEApiEndpointForDeleteCourse() {
        d.setUrl();
    }

    @When("I send DELETE HTTP request for delete course")
    public void iSendDELETEHTTPRequestForDeleteCourse() {
        d.requestDelete();
    }

    @Then("I receive valid HTTP respone code delete course")
    public void iReceiveValidHTTPResponeCodeDeleteCourse() {
        d.statusCode200();
    }

    @And("I receive valid data for delete course")
    public void iReceiveValidDataForDeleteCourse() {
        d.validate200();
    }
}
