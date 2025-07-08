Feature: Ingreso del usuario a la pagina

  Scenario: Usuario ordena productos orden ascendente
    Given que el usuario quiere ingresar al sistema
    When ingresa con usuario "lavila@compuhora.com.co"  y password "1234a"
    And da click a la categoria Women
    And ordena de A a la Z
    Then deberia ver como primer resultado "Blouse"