package choucair.automatizacion.reto.stepdefinitions;

import choucair.automatizacion.reto.tasks.OpenUp;
import choucair.automatizacion.reto.tasks.Register;
import choucair.automatizacion.reto.tasks.TestAcademy;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class choucairAutomatizacionStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jose wants to participate in a community of testers uTest, he finds the uTest community$")
    public void thanJoseWantsToParticipateInaCommunityOfTestersUTestHeFindsTheUTestCommunity()  {
        OnStage.theActorCalled("Jose").wasAbleTo(OpenUp.thePage(),(Register.onThePage()));
    }

    @When("^when you enter the platform you must take an Academy test$")
    public void whenYouEnterThePlatformYouMustTakeAnAcademyTest(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(TestAcademy.the(course));
    }


}