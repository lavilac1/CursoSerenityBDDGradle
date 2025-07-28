# language: es
Característica: Consumo de servicios de usuario

  Escenario: Consultar los usuarios existentes
    Dado que el tester desea consultar los usuarios
    Cuando realiza la peticion GET
    Entonces debe recibir el codigo 200
  

  Escenario: Crear un nuevo usuario
    Dado que el tester tiene un nuevo usuario
    Cuando realiza la peticion POST
    Entonces debe recibir el codigo 201
    
