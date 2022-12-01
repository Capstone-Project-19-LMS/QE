package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.auth.LoginPage;

public class LoginStep {
    @Steps
    LoginPage lp;
    @Given("I am on the landing page")
    public void iAmOnTheLandingPage() {
        lp.openLandingPage();
    }

    @And("I click profile button right")
    public void iClickProfileButtonRight() {
        lp.ClickProfileBtnRight();
    }

    @And("I click dropdown button login")
    public void iClickDropdownButtonLogin() {
        lp.ClickDropdownProfileBtnLogin();
    }
    @When("I input email")
    public void iInputEmail() {
        lp.InputEmail("test");
    }

    @And("I input password")
    public void iInputPassword() {
        lp.InputPassword("test123");
    }

    @And("I click button login")
    public void iClickButtonLogin() {
        lp.ClickBtnLogin();
    }

    @Then("I will go to dashboard")
    public void iWillGoToDashboard() {
        lp.HeaderDashboard();
    }


}
