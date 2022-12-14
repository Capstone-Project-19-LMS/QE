package runner.stepdefinitions.Instructor.Course;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.course.Create;

public class CreateStep {
    @Steps
    Create c;
    @Given("I set POST api endpoints for new course")
    public void iSetPOSTApiEndpointsForNewCourse() {
        c.setUrl();
    }

    @When("I send POST HTTP request for new course {string} {string} {string} {string} {string}")
    public void iSendPOSTHTTPRequestForNewCourse(String name, String  desc, String objective, String catId, String token) {
        if (token.equals("without")){
            c.requestBodyWithoutToken(name, desc, objective, catId);
        }else if(token.equals("ok")){
            c.requestBody(name, desc, objective, catId);
        }else if(token.equals("err")){
            c.requestBody(name, desc, objective, catId);
        }else if(token.equals("inv")){
            c.requestBodyInvalid(name, desc, objective, catId);
        }
    }

    @Then("I receive valid HTTP respone code {string}")
    public void iReceiveValidHTTPResponeCode(String code) {
        if (code.equals("200")){
            c.verifStatusCode200();
        }else if(code.equals("500")){
            c.verifStatusCode500();
        }else if(code.equals("400")){
            c.verifStatusCode400();
        }else if(code.equals("401")){
            c.verifStatusCode401();
        }
    }

    @And("I receive valid data for new course {string}")
    public void iReceiveValidDataForNewCourse(String status) {
        if(status.equals("200")){
            c.validateBody200();
        }else if(status.equals("500")){
            c.validateBody500();
        }else if(status.equals("400")){
            c.validateBody400();
        }else if(status.equals("401")){
            c.validateBody401();
        }
    }
}
