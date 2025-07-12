Feature: Buscar hoteles por internet

  Scenario: Validar hoteles por ciudad
    Given que el usuario quiere ingresar al sistema
    When ingresa con usuario "lavila@compuhora.com.co"  y password "1234a"
    Then deberia ver el mensaje de bienvenida "Welcome to your account. Here you can manage all of your personal information and orders."