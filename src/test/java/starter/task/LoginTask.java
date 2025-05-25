package starter.task;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import starter.ui.LoginPage;

public class LoginTask implements Task {
    private final String usuario;
    private final String contrasena;

    public LoginTask(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static LoginTask conCredenciales(String usuario, String contrasena) {
        return Tasks.instrumented(LoginTask.class, usuario, contrasena);
    }


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginPage.USERNAME),
                Enter.theValue(contrasena).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
