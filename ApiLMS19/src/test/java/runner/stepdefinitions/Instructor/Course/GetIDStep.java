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

    @When("I send GET HTTP request for get course id {string}")
    public void iSendGETHTTPRequestForGetCourseId(String id) {
        if (id.equals("valid")){
            gid.requestId();
        }else if (id.equals("invalid")){
            gid.requestIdInvalid();
        }
    }

    @Then("I receive valid HTTP respone code get course id {string}")
    public void iReceiveValidHTTPResponeCodeGetCourseId(String code) {
        if (code.equals("200")){
            gid.statusCode200();
        }else if (code.equals("404")){
            gid.statusCode404();
        }

    }

    @And("I receive valid data for get course id {string}")
    public void iReceiveValidDataForGetCourseId(String code) {
        if (code.equals("200")){
            gid.validate200();
        }else if (code.equals("404")){
            gid.validate404();
        }
    }


}
