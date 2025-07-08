package mystore.stepsDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mystore.acciones.Darclick;
import mystore.acciones.Decidido;
import mystore.acciones.IngresarCon;
import mystore.acciones.Ordenar;
import mystore.preguntas.LaPaginaMiCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginStepDefinitions {
    Actor actor;

    @Managed
    WebDriver navegador;

    @Before
    public void configurarEscenario() {
        OnStage.setTheStage(new OnlineCast());
        actor = Actor.named("Luisa");
        actor.can(BrowseTheWeb.with(navegador));
    }
/*El actor se registra en neustra plataforma de ventas
        El Actor quiere ingresar a su cuenta
        El actor puede ver el subtitulo de la cuenta My account*/

    //El actor se registra en nuestra plataforma de ventas
    //Dado
    @Given("que el usuario quiere ingresar al sistema")
    public void queElUsuarioQuiereIngresarAlSistema() {
        actor.has(Decidido.ingresarConUsuarioYcontrasena());
    }

    //El Actor quiere ingresar a su cuenta
    //Cuando
    @When("ingresa con usuario {string}  y password {string}")
    public void ingresaConUsuarioYContrasena(String usuario, String password) {
        actor.attemptsTo(IngresarCon.usuario(usuario).password(password));
    }

    //El actor puede ver el subtitulo de my account
    //Entonces
      @Then("deberia ver el mensaje de bienvenida {string}")
    public void deberiaVerElMensajeDeBienvenida(String subtituloEsperado) {
        actor.should(
                seeThat("Subtitulo de pagina My Account",
                        LaPaginaMiCuenta.subtitulo(),
                        equalTo(subtituloEsperado))
        );
    }

    @And("da click a la categoria Women")
    public void daClickALaCategoria() {
        actor.attemptsTo(Darclick.enMenu());
    }

    @And("ordena de A a la Z")
    public void ordenaDeAALaZ() {
        actor.attemptsTo(Ordenar.ordenaAlfabeticamenteAsc());
    }

    @Then("deberia ver como primer resultado {string}")
    public void deberiaVerComoPrimerResultado(String nombreProducto) {
        actor.should(
                seeThat("El titulo del primer producto es Blouse",
                        LaPaginaMiCuenta.primertituloproducto(),
                        equalTo(nombreProducto))
        );
    }
}
