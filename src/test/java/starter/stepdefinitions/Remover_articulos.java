package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.es.Cuando;
import starter.task.ProcederAlCheckout;
import starter.task.RemoverArticulo;
import starter.task.VerificarBotonAdd;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Remover_articulos {



    @And("remover el articulo del producto")
    public void removerElArticuloDelProducto() {
        theActorInTheSpotlight().attemptsTo(RemoverArticulo.quitarCarrito());
    }

    @Then("debería ver el boton de ADD TO CART nuevamente")
    public void deberíaVerElBotonDeADDTOCARTNuevamente() {
        theActorInTheSpotlight().attemptsTo(VerificarBotonAdd.BagregarCarrito());
    }
}
