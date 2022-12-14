package runner.stepdefinitions.Instructor.Course;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.instructor.course.GetAll;

public class GetAllStep {
    @Steps
    GetAll ga;
    @Given("I set GET all api endpoint for get all course")
    public void iSetGETAllApiEndpointForGetAllCourse() {
        ga.setUrl();
    }

    @When("I send GET HTTP request for get all course")
    public void iSendGETHTTPRequestForGetAllCourse() {
        ga.requestGetAll();
    }

    @Then("I receive valid HTTP respone code get all course")
    public void iReceiveValidHTTPResponeCodeGetAllCourse() {
        ga.statusCode200();
    }

    @And("I receive valid data for get all course")
    public void iReceiveValidDataForGetAllCourse() {
        ga.validate200();
    }

}

