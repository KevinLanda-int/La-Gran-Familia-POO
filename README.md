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
