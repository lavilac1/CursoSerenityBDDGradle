Feature: Autenticación con OAuth2 y consumo de recurso protegido

  Scenario: Obtener token y consumir recurso protegido
    Given que el cliente solicita el token con los siguientes datos
      | client_id     | m2m    |
      | client_secret | secret |
      | scope         | api    |
    Then deberia poder acceder al recurso protegido

@Caso1
Scenario: Consumir el servicio protegido con token y body
  Given que el cliente solicita el token
  When el cliente envia el siguiente body al servicio protegido
    | nombre    | Luisa     |
    | documento | 123456789 |

  Then la respuesta debe contener
    | mensaje   | Datos recibidos correctamente |
    | nombre    | Luisa                         |
    | documento | 123456789                     |
