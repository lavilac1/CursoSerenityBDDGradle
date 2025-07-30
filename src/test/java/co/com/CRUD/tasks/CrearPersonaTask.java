package co.com.CRUD.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.HashMap;
import java.util.List;
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

   public CrearPersonaTask(Map<String, Object> informacion) {
    this.body = PersonDataModel.obtenerBody(informacion);
    }


    public static CrearPersonaTask conBody(DataTable dataTable){
            List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        return instrumented(CrearPersonaTask.class, new HashMap<>(rows.get(0)));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         System.out.println("🔍 Body enviado al endpoint: " + body);
      actor.attemptsTo(
            ConsumirPost.al(EndPoint.CREAR_USUARIO, body)
      );
    }

    
}
