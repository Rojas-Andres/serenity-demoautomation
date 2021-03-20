package proyecto7.stepdefinitions;

import cucumber.api.java.Before;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto7.task.OpenUp;

public class DemoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^andres wants to register in demo automation$")
    public void andresWantsToRegisterInDemoAutomation() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage());
    }


    @When("^he fills out the form$")
    public void heFillsOutTheForm() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^he finds$")
    public void heFinds() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
