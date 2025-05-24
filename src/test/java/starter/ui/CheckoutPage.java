package starter.ui;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class CheckoutPage {
    public static final Target INPUT_NOMBRE = Target
            .the("campo de nombre")
            .located(By.id("first-name"));

    public static final Target INPUT_APELLIDO = Target
            .the("campo de apellido")
            .located(By.id("last-name"));

    public static final Target INPUT_POSTAL = Target
            .the("campo de código postal")
            .located(By.id("postal-code"));

    public static final Target BTN_CONTINUAR = Target
            .the("botón continuar")
            .located(By.xpath("/html/body/div[1]/div[2]/div[3]/div/form/div[2]/input"));

    public static final Target BTN_FINALIZAR = Target
            .the("botón finalizar compra")
            .located(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div[8]/a[2]"));

    public static final Target MENSAJE_CONFIRMACION = Target
            .the("mensaje de confirmación de compra")
            .located(By.className("complete-header"));
}
