package co.com.CRUD.setup.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.CRUD.enums.Actor.CLIENTE;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class ConfigurarEscenarios {

    @Before()
    public void perepararEscenario(){
        setTheStage(new OnlineCast());
        theActor(CLIENTE.getNombre());
    }
    
}
