# La-Gran-Familia-POO
Propuesta de sistema para el negocio "La Gran Familia"

# La Gran Familia - Sistema de Gestión

## Descripción

Sistema de gestión desarrollado en Java para el negocio "La Gran Familia".

El sistema permite administrar productos, ventas, inventario y usuarios,
utilizando programación orientada a objetos y conexión con una base de datos.

## Tecnologías utilizadas

- Java
- Eclipse IDE
- MySQL
- Programación Orientada a Objetos
- JDBC
- GitHub

## Funcionalidades

- Gestión de productos.
- Gestión de inventario.
- Registro de ventas.
- Detalle de ventas.
- Gestión de usuarios.
- Conexión con base de datos MySQL.
- Administración de empleados.
- Administración de productos.

## Estructura del proyecto

```text
src/
├── BD/
│   ├── Conexion.java
│   ├── ProductoBD.java
│   └── VentaBD.java
│
├── Modelo/
│   ├── DetalleVenta.java
│   ├── Producto.java
│   └── Venta.java
│
├── Principal/
│   └── principal.java
│
├── Servicios/
│   ├── InventarioServicio.java
│   ├── ProductoServicio.java
│   └── VentaServicio.java
│
└── Usuario/
    ├── Administrador.java
    └── Empleado.java
