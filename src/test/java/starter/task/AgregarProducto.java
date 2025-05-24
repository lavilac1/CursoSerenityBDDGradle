package starter.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.ProductosPage;

public class AgregarProducto implements Task {

    public static AgregarProducto alCarrito(String producto) {
        return Tasks.instrumented(AgregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductosPage.BTN_ADD_BACKPACK)
        );
    }
}

