# La Gran Familia - Sistema de Gestión

## Descripción

La Gran Familia es un sistema de gestión desarrollado en Java para apoyar las operaciones de un negocio, permitiendo administrar productos, inventario, ventas y usuarios.

El proyecto fue desarrollado aplicando los principios de la **Programación Orientada a Objetos (POO)**, utilizando una estructura organizada por módulos y clases para facilitar el mantenimiento y reutilización del código.

## Objetivo del proyecto
Desarrollar una propuesta de sistema para el negocio **"La Gran Familia"**, que permita gestionar de manera organizada la información relacionada con productos, inventario, ventas y usuarios.

El sistema busca facilitar el control de las operaciones principales del negocio mediante una aplicación desarrollada en Java y conectada a una base de datos.

## Tecnologías utilizadas
- Java
- Eclipse IDE
- MySQL
- JDBC
- Programación Orientada a Objetos (POO)
- GitHub
- Draw.io
- SQL

## Funcionalidades
El sistema contempla las siguientes funcionalidades:

- Gestión de productos.
- Registro y consulta de productos.
- Control de inventario.
- Registro de ventas.
- Gestión del detalle de las ventas.
- Gestión de usuarios.
- Administración de empleados.
- Administración de usuarios con diferentes roles.
- Conexión con una base de datos MySQL.
- Almacenamiento y consulta de información.
- Separación de responsabilidades mediante diferentes clases y paquetes.

## Estructura del proyecto
El proyecto está organizado de la siguiente manera:

```text
LaGranFamilia/
│
├── src/
│   │
│   ├── BD/
│   │   ├── Conexion.java
│   │   ├── ProductoBD.java
│   │   └── VentaBD.java
│   │
│   ├── Modelo/
│   │   ├── DetalleVenta.java
│   │   ├── Producto.java
│   │   └── Venta.java
│   │
│   ├── Principal/
│   │   └── principal.java
│   │
│   ├── Servicios/
│   │   ├── InventarioServicio.java
│   │   ├── ProductoServicio.java
│   │   └── VentaServicio.java
│   │
│   ├── Usuario/
│   │   ├── Administrador.java
│   │   └── Empleado.java
│   │
│   └── module-info.java
│
├── gran_familia.sql
├── DiagramaUML_LaGranFamilia.drawio
├── LaGranFamilia.zip
└── README.md

## Descripción de los paquetes

### BD

Este paquete contiene las clases encargadas de la comunicación con la base de datos.

- `Conexion.java`: establece la conexión con la base de datos.
- `ProductoBD.java`: contiene operaciones relacionadas con los productos en la base de datos.
- `VentaBD.java`: contiene operaciones relacionadas con las ventas en la base de datos.

### Modelo

Contiene las clases que representan las principales entidades del sistema.

- `Producto.java`: representa un producto.
- `Venta.java`: representa una venta.
- `DetalleVenta.java`: representa los detalles asociados a una venta.

### Principal

Contiene la clase principal encargada de iniciar la aplicación.

- `principal.java`: punto de entrada del programa.

### Servicios

Contiene las clases encargadas de implementar la lógica de las operaciones del sistema.

- `InventarioServicio.java`: administra las operaciones relacionadas con el inventario.
- `ProductoServicio.java`: administra las operaciones relacionadas con los productos.
- `VentaServicio.java`: administra las operaciones relacionadas con las ventas.

### Usuario

Contiene las clases relacionadas con los diferentes tipos de usuarios del sistema.

- `Administrador.java`: representa a un usuario con funciones administrativas.
- `Empleado.java`: representa a un empleado del negocio.

## Base de datos

El proyecto utiliza una base de datos relacional desarrollada en **MySQL**.

El script de creación de la base de datos se encuentra en el archivo:

`gran_familia.sql`

Este archivo contiene las instrucciones SQL necesarias para crear y configurar la base de datos utilizada por el sistema.

## Modelo UML

El proyecto incluye un diagrama UML que representa la estructura y relaciones entre las principales clases del sistema.

El archivo se encuentra en:

`DiagramaUML_LaGranFamilia.drawio`

El diagrama fue elaborado utilizando **Draw.io**.

## Programación Orientada a Objetos

El proyecto aplica diferentes conceptos de Programación Orientada a Objetos, entre ellos:

- Clases y objetos.
- Encapsulamiento.
- Herencia.
- Métodos.
- Atributos.
- Constructores.
- Relaciones entre clases.
- Separación de responsabilidades.
- Reutilización de código.

La organización del proyecto mediante paquetes permite mantener separadas las diferentes responsabilidades del sistema.

## Conexión con la base de datos

La conexión con MySQL se realiza mediante **JDBC**.

La clase encargada de establecer la conexión es:

`Conexion.java`

Para ejecutar correctamente el sistema es necesario configurar los datos correspondientes a:

- Servidor.
- Puerto.
- Nombre de la base de datos.
- Usuario.
- Contraseña.

## Requisitos

Para ejecutar el proyecto se requiere:

- Java JDK.
- Eclipse IDE.
- MySQL Server.
- MySQL Workbench.
- Conector JDBC de MySQL.

## Instalación y configuración

### 1. Descargar el proyecto

Descargar o clonar este repositorio desde GitHub.

### 2. Importar el proyecto en Eclipse

Abrir Eclipse y seleccionar:

`File → Import → Existing Projects into Workspace`

Seleccionar la carpeta del proyecto.

### 3. Crear la base de datos

Abrir MySQL Workbench y ejecutar el archivo:

`gran_familia.sql`

Esto permitirá crear la estructura de la base de datos necesaria para el sistema.

### 4. Configurar la conexión

Abrir:

`src/BD/Conexion.java`

y configurar los datos correspondientes a la conexión de MySQL.

### 5. Ejecutar el sistema

Localizar la clase:

`src/Principal/principal.java`

y ejecutarla como una aplicación Java:

`Run As → Java Application`

## Archivos incluidos

| Archivo | Descripción |
|---|---|
| `gran_familia.sql` | Script de la base de datos |
| `DiagramaUML_LaGranFamilia.drawio` | Diagrama UML del sistema |
| `LaGranFamilia.zip` | Archivo comprimido del proyecto |
| `README.md` | Documentación del proyecto |

## Arquitectura del proyecto

El sistema se encuentra organizado en diferentes capas y paquetes para separar las responsabilidades:

```text
Usuario
   ↓
Servicios
   ↓
Modelo
   ↓
BD
   ↓
MySQL
