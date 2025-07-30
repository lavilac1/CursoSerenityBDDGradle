            #language: es

            Característica: Creación de Cliente
            Yo como Analista de calidad
            Deseo consumir la API de PersonData
            Para crear un nuevo cliente

            Esquema del escenario: creación exitosa cliente
            Dado necesita agregar un cliente
            Cuando realiza creacion cliente
            | name   | username   | email   |
            | <name> | <username> | <email> |
            Entonces valida respuesta
            | Respuesta | <Respuesta> |
            Ejemplos:
            | name | username | email        | Respuesta        |
            | Luis | luisillo | llu@test.com | CREACION_EXITOSA |