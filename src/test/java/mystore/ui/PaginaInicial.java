package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.core.annotations.findby.By;

public class PaginaInicial {
    public static Target BTN_CONTINUAR_TITULO=Target.the("CONTINUAR ")
    .located(By.xpath("//button[@id='continue']"));

    public static Target BTN_BUSQUEDA=Target.the("boton ciudad")
    .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));


     public static Target TXT_BUSQUEDA=Target.the("Campo ciudad")
    .located(By.xpath("//input[@data-stid='destination_form_field-menu-input']"));

    public static Target BTN_HABITACION=Target.the("Campo habitaciones")
    .located(By.xpath("//span[@data-testid='searchbox-form-button-icon']"));

     public static Target  BTN_AGREGAR=Target.the("Agregar habitaciones")
    .located(By.xpath(""));

    public static Target BTN_BUSCAR=Target.the("Boton buscar")
    .located(By.xpath("//button[@type='submit']"));

    public static Target BTN_LISTO=Target.the("Boton listo")
    .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/footer[1]/div[1]/button[1]"));

   

   
    
   
    

    

}
