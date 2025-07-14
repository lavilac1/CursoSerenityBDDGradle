Feature: Búsqueda hoteles por ciudad

#@test1
 # Scenario: Validar selección de hoteles por ciudad
  #  Given que el usuario abre la pagina
   # When ingresa la ciudad "Mede"
    #Then deberia ver ciudad "Medellín"
    #And huespedes "3 personas, 2 habitaciones"

@test2
 Scenario: Validar selección de hoteles por ciudad
    Given que el usuario abre la pagina
    When ingresa la ciudad "Urrao"
    Then deberia ver "22 propiedades"

   