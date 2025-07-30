package co.com.CRUD.interactions;

import java.util.Map;

import co.com.CRUD.enums.EndPoint;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsumirPost  implements Interaction  {


    private final  EndPoint endpoint;
    private final Map<String, Object> body;


    public ConsumirPost(EndPoint endPoint, Map<String,Object> body){
        this.endpoint=endPoint;
        this.body=body;
    }

    public static ConsumirPost al(EndPoint endPoint, Map<String,Object> body){
        return instrumented(ConsumirPost.class, endPoint,body);

    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
        Post.to(endpoint.path())
            .with(request -> request
                .body(body)
            )   
       );
    }
    
}
