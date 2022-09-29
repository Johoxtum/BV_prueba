package com.bancodebogota.stepdefinitions;
import com.bancodebogota.questions.DashboardBV;
import com.bancodebogota.tasks.TareaLoginBV;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginBVStep {

    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Sanchez");

    }

    @Given("Ingresa a la pagina web")
    public void ingresaALaPaginaWeb() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://virtual.labdigbdbstgpb.com/"));
    }

    @When("Ingresa sus credenciales de acceso:")
    public void ingresaSusCredencialesDeAcceso(Map<String, String> dates) {

        theActorInTheSpotlight().attemptsTo(TareaLoginBV.informacion(dates));
    }

    @Then("El usuario debera ver {string}")
    public void elUsuarioDeberaVer(String producto) {


        theActorInTheSpotlight().should(GivenWhenThen.seeThat(DashboardBV.comparar(), Matchers.is(Matchers.equalTo(producto))));
    }

}
