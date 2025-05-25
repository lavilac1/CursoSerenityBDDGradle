package starter.task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.ProductosPage;

import java.util.List;

public class AgregarVariosProducto  implements Task {


    public static AgregarVariosProducto Carrito() {
        return Tasks.instrumented(AgregarVariosProducto.class);
    }


    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> botones = ProductosPage.BOTONES_ADD_TO_CART.resolveAllFor(actor);
        for (int i = 0; i < 4; i++) {
            actor.attemptsTo(
                    Click.on(botones.get(i))
            );
        }
    }
}
