package mystore.stepsDefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mystore.acciones.Decidido;
import mystore.acciones.Filtra;
import mystore.preguntas.VisualizaHoteles;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class BuscarHotelesStepDefinition {
     Actor actor;

    @Managed
    WebDriver navegador;

    @Before
    public void configurarEscenario() {
        OnStage.setTheStage(new OnlineCast());
        actor = Actor.named("Luisa");
        actor.can(BrowseTheWeb.with(navegador));
    }
    @Step ("El ingresa a la pagina de busqueda")
    @Given("que el usuario abre la pagina")
    public void queElUsuarioQuiereIngresarAlSistema() {
        actor.has(Decidido.navegarALaPagina());
    }



    @When("ingresa la ciudad {string}")
    public void ingresa_la_ciudad(String ciudad) {
        actor.attemptsTo(Filtra.por(ciudad));
       
    }

     @Then("deberia ver el hotel {string}")
    public void deberia_ver_el_hotel(String nombrehotel) {
        actor.should(
                seeThat("El primer hotel es Hotel dan carton",
                        VisualizaHoteles.subtitulo(),
                        equalTo(nombrehotel))
        );
        
    }
    
}
