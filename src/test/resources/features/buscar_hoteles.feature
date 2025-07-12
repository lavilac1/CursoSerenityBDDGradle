Feature: Búsqueda hoteles por ciudad

  Scenario: Validar selección de hoteles por ciudad
    Given que el usuario abre la pagina
    When ingresa la ciudad "Medellin"
    Then deberia ver el hotel "La Martina Boutique Hotel"