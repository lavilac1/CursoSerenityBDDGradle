package co.com.CRUD.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.HashMap;
import java.util.Map;

import com.github.dockerjava.api.model.Endpoint;

import co.com.CRUD.enums.EndPoint;
import co.com.CRUD.interactions.ConsumirPost;
import co.com.CRUD.models.PersonDataModel;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class CrearPersonaTask implements Task {

    private final Map<String, Object> body;
    private final Map<String, Object> informacion= new HashMap<>();
    private String endpoint;

    public CrearPersonaTask(DataTable informacion){
        this.body=PersonDataModel.obtenerBody(this.informacion);
    

    }


    public static CrearPersonaTask conBody(DataTable informacion){
        return instrumented(CrearPersonaTask.class, informacion);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
            ConsumirPost.al(EndPoint.CREAR_USUARIO, body)
      );
    }

    
}
