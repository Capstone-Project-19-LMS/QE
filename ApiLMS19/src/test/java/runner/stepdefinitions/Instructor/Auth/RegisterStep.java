package runner.stepdefinitions.Instructor.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.auth.Register;

public class RegisterStep {
    @Steps
    Register r;
    @Given("I set POST api endpoints for register")
    public void iSetPOSTApiEndpointsForRegister() {
        r.setUrl();
    }

    @When("I send request for register {string} {string} {string}")
    public void iSendRequestForRegister(String name, String email, String password) {
        r.requestBody(name, email, password);
    }

    @Then("I receive valid HTTP response code register {string}")
    public void iReceiveValidHTTPResponseCodeRegister(String code) {
        if (code.equals("200")){
            r.verifStatusCode200();
        }else if (code.equals("500")){
            r.verifStatusCode500();
        }else if(code.equals("400")){
            r.verifStatusCode400();
        }
    }

    @And("I receive valid data for register {string}")
    public void iReceiveValidDataForRegister(String status) {
        if (status.equals("ok")){
            r.validateBody();
        }else if (status.equals("dup")){
            r.validateBodyDuplicate();
        }else if(status.equals("fail")){
            r.verifStatusCode400();
        }
    }
}
