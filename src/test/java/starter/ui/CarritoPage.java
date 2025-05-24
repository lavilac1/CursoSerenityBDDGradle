package starter.ui;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {
    public static final Target BTN_CART = Target
            .the("ícono del carrito de compras")
            .located(By.className("shopping_cart_link"));

    public static final Target BTN_CHECKOUT = Target
            .the("botón de checkout en el carrito")
            .located(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/a[2]"));
}
