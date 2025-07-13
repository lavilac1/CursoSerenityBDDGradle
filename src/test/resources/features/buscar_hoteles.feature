Feature: Búsqueda hoteles por ciudad

  Scenario: Validar selección de hoteles por ciudad
    Given que el usuario abre la pagina
    When ingresa la ciudad "Mede"
    And selecciona mas habitaciones
    Then deberia ver ciudad "Cartagena"
    And huespedes "3 personas, 2 habitaciones"


 Scenario: Validar selección de hoteles por ciudad
    Given que el usuario abre la pagina
    When ingresa la ciudad "Mede"
    Then deberia ver el hotel "Hotel Dann Carlton Belfort Medellin"

   