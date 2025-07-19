package mystore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogin {
   public static final Target EMAIL=Target.the("campo usuario")
            .located(org.openqa.selenium.By.name("email"));
   public static final Target PASSWORD=Target.the("campo password")
            .located(org.openqa.selenium.By.name("passwd"));
   public static final Target BOTON_SIGN_IN=Target.the("Boton iniciar sesion")
            .located(org.openqa.selenium.By.name("SubmitLogin"));
}
