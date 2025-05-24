package starter.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.task.AbrirSwagLabs;
import starter.task.AgregarProducto;
import starter.task.LoginTask;
import starter.task.ProcederAlCheckout;
import starter.task.IngresarDatosCheckout;
import starter.task.FinalizarCompra;
import starter.task.VerificarCompraExitosa;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraSteps {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario está en la página de login")
    public void que_el_usuario_esta_en_la_pagina_de_login() {
        theActorCalled("Usuario").attemptsTo(AbrirSwagLabs.paginaLogin());
    }

    @Cuando("inicia sesión con usuario {string} y contraseña {string}")
    public void iniciar_sesion(String usuario, String contrasena) {
        theActorInTheSpotlight().attemptsTo(LoginTask.conCredenciales(usuario, contrasena));
    }

    @Cuando("agrega el artículo {string} al carrito")
    public void agregar_articulo_al_carrito(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarrito(producto));
    }

    @Cuando("procede al carrito y hace clic en Checkout")
    public void procede_al_carrito_y_checkout() {
        theActorInTheSpotlight().attemptsTo(ProcederAlCheckout.desdeCarrito());
    }

    @Cuando("ingresa los datos {string}, {string}, {string}")
    public void ingresar_datos_de_checkout(String nombre, String apellido, String codigoPostal) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosCheckout.conDatos(nombre, apellido, codigoPostal));
    }

    @Cuando("finaliza la compra")
    public void finalizar_compra() {
        theActorInTheSpotlight().attemptsTo(FinalizarCompra.confirmar());
    }

    @Entonces("debería ver el mensaje de confirmación de la compra")
    public void verificar_mensaje_confirmacion() {
        theActorInTheSpotlight().should(VerificarCompraExitosa.mensajeVisible());
    }
}
