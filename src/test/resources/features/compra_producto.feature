Feature: Compra de productos en SwagLabs

  Background:
    Given que el usuario está en la página de login
    When inicia sesión con usuario "standard_user" y contraseña "secret_sauce"


  Scenario: Comprar un artículo exitosamente
    When agrega el artículo Sauce Labs Backpack al carrito
    And entra al carrito y hace clic en Checkout
    And ingresa los datos "Luisa", "Avila", "501010"
    And finaliza la compra
    Then debería ver el mensaje de confirmación de la compra

  Scenario: Eliminar un artículo del carrito de compra
    When agrega el artículo Sauce Labs Backpack al carrito
    And remover el articulo del producto
    Then debería ver el boton de ADD TO CART nuevamente

  Scenario: Comprar cuatro artículos exitosamente
    When agrego los primeros  articulos al carrito
    And entra al carrito y hace clic en Checkout
    And ingresa los datos "Luisa", "Avila", "501010"
    And finaliza la compra
    Then debería ver el mensaje de confirmación de la compra