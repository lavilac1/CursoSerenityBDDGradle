package co.com.CRUD.stepsDefinition;

import co.com.CRUD.models.UsuarioModel;
import co.com.CRUD.questions.ElBodyDeRespuesta;
import co.com.CRUD.questions.ElCodigoDeRespuesta;
import co.com.CRUD.questions.ElCuerpoDeLaRespuesta;
import co.com.CRUD.tasks.ConsultarUsuario;
import co.com.CRUD.tasks.CrearUsuario;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class usuarioStep {
    @Before
    public void configurarActor() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Luisa");
         
    }

    @Dado("que el tester desea consultar los usuarios")
    public void consultarUsuarios() {
        theActorInTheSpotlight().whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));
    }

    @Cuando("realiza la peticion GET")
    public void realizaPeticionGET() {
           theActorInTheSpotlight().attemptsTo(
            ConsultarUsuario.enApi()
        );
    }

    @Entonces("debe recibir el codigo {int}")
    public void debeRecibirElCodigo(Integer codigo) {
       theActorInTheSpotlight().should(
        seeThat("El código de respuesta fue", ElCodigoDeRespuesta.fue(), is(codigo))
    );
    }

    @Dado("que el tester tiene un nuevo usuario")
    public void tieneNuevoUsuario() {
         theActorInTheSpotlight().whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));
        
    }

    @Cuando("realiza la peticion POST")
    public void realizaPeticionPOST() {
      UsuarioModel usuario = new UsuarioModel();
        usuario.setName("Juan Test");
        usuario.setUsername("juanito");
        usuario.setEmail("juan@test.com");

       theActorInTheSpotlight().attemptsTo(
            CrearUsuario.conDatos(usuario)
        );
    }


    
}
