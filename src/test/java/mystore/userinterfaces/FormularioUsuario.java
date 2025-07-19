package mystore.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioUsuario {

    public static final Target INPUT_NOMBRE = Target.the("campo de nombre")
        .located(By.id("firstName"));
    
     public static final Target INPUT_APELLIDO = Target.the("campo de apellido")
        .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("campo de correo")
        .located(By.id("userEmail"));

    public static final Target RADIO_GENERO = Target.the("opción de género")
        .located(By.xpath("//label[text()='Female']")); // Se puede parametrizar

    public static final Target INPUT_TELEFONO = Target.the("campo de teléfono")
        .located(By.id("userNumber"));

    public static final Target BTN_SUBMIT = Target.the("botón de enviar")
        .located(By.id("submit"));
    
}
