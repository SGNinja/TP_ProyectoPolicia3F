# **Trabajo Practico Final - Java Inicial Tecno3F**
# Gestión de Armas

Este programa permite a la policía de Tres de Febrero administrar las armas asignadas a sus policías. Proporciona funcionalidades para registrar policías y armas (cortas y largas), así como para utilizar las funcionalidades específicas de cada tipo de arma.

## Características

- Registro de policías con nombre, apellido y legajo.
- Registro de armas cortas y largas, con información detallada como cantidad de municiones, alcance, marca, calibre, estado, y características específicas de cada tipo de arma.
- Verificación de si un arma está en condiciones para ser utilizada en un enfrentamiento.
- Verificación de si un arma corta puede disparar a más de 200 metros.
- Comparación de niveles entre armas largas.

## Requisitos

- Java 17 o superior
- IntelliJ IDEA o cualquier otro IDE compatible con Java

## Estructura del proyecto

```
├── src
│   └── com
│       └── tecno3fjava
│           └── gestionarmas
│               ├── Arma.java
│               ├── ArmaCorta.java
│               ├── ArmaLarga.java
│               ├── GestionArmas.java
│               ├── Main.java
│               └── Policia.java
└── README.md
```

- `com.tecno3fjava.gestionarmas.Arma.java`: Clase abstracta que representa un arma genérica y contiene los atributos y métodos comunes a todas las armas.
- `com.tecno3fjava.gestionarmas.ArmaCorta.java`: Clase que extiende de `Arma` y representa un arma corta, con su atributo y método específico.
- `com.tecno3fjava.gestionarmas.ArmaLarga.java`: Clase que extiende de `Arma` y representa un arma larga, con sus atributos y método específicos.
- `com.tecno3fjava.gestionarmas.GestionArmas.java`: Clase que contiene los métodos estáticos para registrar policías, registrar armas, mostrar información y utilizar las funcionalidades de las armas.
- `com.tecno3fjava.gestionarmas.Main.java`: Clase principal que contiene el método `main()` y el menú de opciones para interactuar con el programa.
- `com.tecno3fjava.gestionarmas.Policia.java`: Clase que representa a un policía y contiene sus atributos.
- `README.md`: Este archivo, que proporciona información sobre el programa.

## Instrucciones de uso

1. Clona o descarga el proyecto en tu máquina local.
2. Abre el proyecto en tu IDE preferido.
3. Compila y ejecuta la clase `com.tecno3fjava.gestionarmas.Main`.
4. Sigue las instrucciones del menú para interactuar con el programa.

## Ejemplos de uso

1. Registrar un nuevo policía:
    - Selecciona la opción "1. Registrar nuevo policía" en el menú.
    - Ingresa el nombre, apellido y legajo del policía.

2. Registrar una nueva arma:
    - Selecciona la opción "2. Registrar nueva arma" en el menú.
    - Ingresa los datos solicitados, como el nombre del policía al que pertenece el arma, cantidad de municiones, alcance, marca, calibre, estado, y características específicas según el tipo de arma (corta o larga).

3. Mostrar policías y armas registradas:
    - Selecciona la opción "3. Mostrar policías y armas" en el menú.
    - Se mostrarán las listas de policías y armas registradas.

4. Utilizar funcionalidades de las armas:
    - Selecciona la opción "4. Usar funcionalidades" en el menú.
    - Ingresa el índice del arma que deseas utilizar.
    - Para armas cortas, se mostrará si puede disparar a más de 200 metros.
    - Para armas largas, se mostrará si está en condiciones para ser usada y se te pedirá que ingreses el índice de otra arma larga para compararlas por nivel.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes sugerencias de mejora, no dudes en abrir un issue o enviar una solicitud de extracción.
