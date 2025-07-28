package co.com.CRUD.tasks;

import org.apache.poi.ss.formula.functions.T;

import co.com.CRUD.Utils.ConstruirRequest;
import co.com.CRUD.enums.EndPoint;
import co.com.CRUD.models.UsuarioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuario implements Task {
     private final UsuarioModel usuario;

    public CrearUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         System.out.println("Usuario a enviar: " + usuario);
        System.out.println("Endpoint: " + EndPoint.USUARIOS.path());
        actor.attemptsTo(
            ConstruirRequest.post(EndPoint.USUARIOS.path(), usuario)
        );
    }

    public static CrearUsuario conDatos(UsuarioModel usuario) {
        return instrumented(CrearUsuario.class, usuario);
    }
    
}
