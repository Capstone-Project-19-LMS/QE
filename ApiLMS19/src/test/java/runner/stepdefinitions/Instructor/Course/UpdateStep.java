package runner.stepdefinitions.Instructor.Course;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.course.Update;

public class UpdateStep {
    @Steps
    Update u;
    @Given("I set PUT api endpoint for update course")
    public void iSetPUTApiEndpointForUpdateCourse() {
        u.setUrl();
    }

    @When("I send PUT HTTP request for update course {string} {string} {string} {string} {string}")
    public void iSendPUTHTTPRequestForUpdateCourse(String name, String  desc, String objective, String catId, String token) {
        if (token.equals("ok")){
            u.requestUpdateBody(name, desc, objective, catId);
        }else if (token.equals("inv")){
            u.requestUpdateBodyInvalid(name, desc, objective, catId);
        }else if (token.equals("invToken")){
            u.requestUpdateBodyInvToken(name, desc, objective, catId);
        }
    }

    @Then("I receive valid HTTP respone code update course {string}")
    public void iReceiveValidHTTPResponeCodeUpdateCourse(String code) {
        if (code.equals("200")){
            u.verifStatusCode200();
        }else if (code.equals("404")){
            u.verifStatusCode404();
        }else if(code.equals("400")){
            u.verifStatusCode400();
        }
    }

    @And("I receive valid data for update course {string}")
    public void iReceiveValidDataForUpdateCourse(String status) {
        if (status.equals("ok")){
            u.validateBody200();
        }else if (status.equals("inv")){
            u.validateBody404();
        }else if(status.equals("invToken")){
            u.validateBody400();
        }
    }
}
