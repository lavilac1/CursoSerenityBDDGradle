package starter.ui;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class ProductosPage {

    public static final Target BTN_ADD_BACKPACK = Target
            .the("botón para agregar la mochila Sauce Labs al carrito")
            .located(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button"));


}
