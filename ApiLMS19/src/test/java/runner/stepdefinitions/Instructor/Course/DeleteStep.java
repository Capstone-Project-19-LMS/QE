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

    @When("I send DELETE HTTP request for delete course {string}")
    public void iSendDELETEHTTPRequestForDeleteCourse(String status) {
        if (status.equals("ok")){
            d.requestDelete();
        }else if(status.equals("inv")){
            d.requestDeleteInv();
        }else if(status.equals("invToken")){
            d.requestDeleteInvToken();
        }
    }

    @Then("I receive valid HTTP respone code delete course {string}")
    public void iReceiveValidHTTPResponeCodeDeleteCourse(String code) {
        if (code.equals("200")){
            d.statusCode200();
        }else if(code.equals("404")){
            d.statusCode404();
        }else if(code.equals("400")){
            d.statusCode400();
        }
    }

    @And("I receive valid data for delete course {string}")
    public void iReceiveValidDataForDeleteCourse(String status) {
        if (status.equals("200")){
            d.validate200();
        }else if(status.equals("404")){
            d.validate404();
        }else if(status.equals("401")){
            d.validate400();
        }
    }
}
