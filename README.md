# Automatizacion Web de LogIn con Serenity y Cucumber

Esta automatizacion busca validar todos los posibles flujos de la aplicacion desde el formulario de Login.


## Criterios de Aceptacion
|Dado| Cuando| Entonces|
|----|-------|---------|
|Un usuario que accede al formulario de LogIn|Completa los campos requeridos 'Company', 'Email' y 'Password' con datos previamente registrados y presiona el boton de 'Log In'|Se valida que se redirija a la pagina principal con todas las opciones de la plataforma|
|Un usuario que accede al formulario de LogIn|Completa los campos requeridos 'Company', 'Email' y 'Password' con datos que no se encuentran registrados en la base de datos y presiona el boton de 'Log In'|Se notifica mediante una alerta que las credenciales son inválidas|
|Un usuario que accede al formulario de LogIn|Presiona el boton de 'Log In' sin completar ningun campo| Se informa mediante un mensaje de error en cada campo indicando que son obligatorios|



## Ejecución de las pruebas

Abrir una ventana de comandos CMD y cambiar al directorio del proyecto

    cd ruta donde se clono el proyecto\cpa_login_automation

Luego ejecutar el siguiente comando
        
        mvn clean verify


## Reporte de Serenity
Despues de ejecutar el comando se genera el reporte de serenity dentro de `target/site/serenity/index.html`, dentro de la carpeta del proyecto.

    target/site/serenity/index.html

### Requisitos
> Java 8

> Maven 3.6

> Firefox 78.0.2
