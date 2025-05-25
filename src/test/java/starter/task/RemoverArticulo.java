package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.CarritoPage;
import starter.ui.ProductosPage;

public class RemoverArticulo implements Task {

    public static RemoverArticulo quitarCarrito() {
        return Tasks.instrumented(RemoverArticulo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductosPage.BTN_BACKPACK)
        );
    }
}
