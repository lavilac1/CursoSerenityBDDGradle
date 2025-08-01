package co.com.CRUD.stepsDefinition;


import co.com.CRUD.tasks.ConsumirRecursoProtegido;
import co.com.CRUD.tasks.ObtenerTokenOAuth2;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OAuthStepDefinitions {
   

    @Then("deberia poder acceder al recurso protegido")
    public void deberiaPoderAccederAlRecursoProtegido() {
        theActorInTheSpotlight().attemptsTo(
                ConsumirRecursoProtegido.usandoToken()
        );
    }
}
