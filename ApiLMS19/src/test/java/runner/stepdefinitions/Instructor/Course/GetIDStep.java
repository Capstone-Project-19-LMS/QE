package runner.stepdefinitions.Instructor.Course;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.course.GetID;

public class GetIDStep {
    @Steps
    GetID gid;
    @Given("I set GET id api endpoint for get course id")
    public void iSetGETIdApiEndpointForGetCourseId() {
        gid.setUrl();
    }

    @When("I send GET HTTP request for get course id")
    public void iSendGETHTTPRequestForGetCourseId() {
        gid.requestId();
    }

    @Then("I receive valid HTTP respone code get course id")
    public void iReceiveValidHTTPResponeCodeGetCourseId() {
        gid.statusCode200();
    }

    @And("I receive valid data for get course id")
    public void iReceiveValidDataForGetCourseId() {
        gid.validate200();
    }


}
