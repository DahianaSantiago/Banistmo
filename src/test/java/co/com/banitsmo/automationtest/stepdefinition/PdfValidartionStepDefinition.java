package co.com.banitsmo.automationtest.stepdefinition;


import co.com.banitsmo.automationtest.question.Validation;
import co.com.banitsmo.automationtest.task.DiscoverMore;
import co.com.banitsmo.automationtest.task.Facta;
import co.com.banitsmo.automationtest.task.Legal;
import co.com.banitsmo.automationtest.task.SelectLearnigIsEasy;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PdfValidartionStepDefinition {


    @Before
    public void setNavigate(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");
    }

    @Given("^the user is on the home page$")
    public void theUserIsOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/"));
    }

    @When("^the user generate the file$")
    public void theUserGenerateTheFile() {
       theActorInTheSpotlight().attemptsTo(SelectLearnigIsEasy.selectLearnigIsEasy(), DiscoverMore.discoverMore(),
                Legal.legal(), Facta.facta());

    }

    @Then("^the user can see 'TitlePdf'$")
    public void theUserCanSeeTitlePdf() {
        theActorInTheSpotlight().should(seeThat(Validation.Validation()));
    }
}
