package mystore.stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import mystore.acciones.Decidido;
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
        actor.has(Decidido.ingresarConUsuarioYcontrasena());
    }
    
}
