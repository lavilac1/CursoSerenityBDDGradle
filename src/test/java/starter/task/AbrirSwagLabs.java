package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;

import starter.ui.Homepage;

public class AbrirSwagLabs {
    public static Performable paginaLogin() {
        return Task.where("{0} Abrir pagina",
                Open.browserOn().the(Homepage.class));
    }


}
