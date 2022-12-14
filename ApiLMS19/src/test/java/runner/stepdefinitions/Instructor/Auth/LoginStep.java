package runner.stepdefinitions.Instructor.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.auth.Login;

public class LoginStep {
    @Steps
    Login l;
    @Given("I set POST api endpoints for login")
    public void iSetPOSTApiEndpointsForLogin() {
        l.setUrl();
    }

    @When("I send request for login {string} {string}")
    public void iSendRequestForLogin(String email, String password) {
        l.requestBody(email, password);
    }

    @Then("I receive valid HTTP response code login {string}")
    public void iReceiveValidHTTPResponseCodeLogin(String code) {
        if (code.equals("200")){
            l.verifStatusCode200();
        }else if(code.equals("500")){
            l.verifStatusCode500();
        }
    }

    @And("I receive valid data for login {string}")
    public void iReceiveValidDataForLogin(String status) {
        if (status.equals("ok")){
            l.validateBody();
        }else if (status.equals("fail")){
            l.validateBodyFailed();
        }
    }
}
