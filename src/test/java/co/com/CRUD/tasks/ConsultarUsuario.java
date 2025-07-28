package co.com.CRUD.tasks;

import co.com.CRUD.Utils.ConstruirRequest;
import co.com.CRUD.enums.EndPoint;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
        
            ConstruirRequest.get(EndPoint.USUARIOS.path())
       );
    }

    public static ConsultarUsuario enApi() {
        return instrumented(ConsultarUsuario.class);
    }
    
}
