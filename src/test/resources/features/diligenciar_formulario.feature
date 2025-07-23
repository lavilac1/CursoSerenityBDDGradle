# language: es
Característica: Registro de datos en el formulario demoqa

Escenario: Registrar usuario exitosamente
  Dado que el usuario abre el formulario de registro
  Cuando diligencia los datos del Excel "<llave>"
  Entonces deberia ver el mensaje de confirmacion del registro "Thanks for submitting the form"

Ejemplos:
  | llave  |
  | Luisa  |
  | Juan   |