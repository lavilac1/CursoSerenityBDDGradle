package co.com.CRUD.Utils;

import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.Performable;

public class ConstruirRequest {

    public static Performable get(String endpoint) {
        System.out.println("➡️ GET a: " + endpoint);
        return Get.resource(endpoint).with(request -> request.log().all());
    }

    public static Performable post(String endpoint, Object body) {
           System.out.println("➡️ POST a: " + endpoint);
    System.out.println("📦 Body: " + body);
    return Post.to(endpoint)
        .with(request -> request
            .log().all() // ✅ Aquí sí funciona correctamente
            .body(body)
            .contentType("application/json")
        );
    }

    public static Performable put(String endpoint, Object body) {
        return Put.to(endpoint).with(request -> request.body(body).contentType("application/json"));
    }
    
}
