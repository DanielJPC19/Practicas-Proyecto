# Practicas-Proyecto

Practicas con herramientas de Git, haciendo uso de Gitflow y GitHub.

## Integrantes

- Juan Manuel Casanova Marin - A00400090
- Isabella Hernandez Mosquera - A00400107
- Karen Valeria Jurado Calpa - A00400280
- Deiner Julian Motta - A00400438
- Daniel Jose Plazas Cortes - A00400085
- Nicholas Villaquiran Cosh - A00399069

## Descripción

El sistema desarrollado es un Sistema de Gestión de Vehículos que tiene como objetivo gestionar de manera eficiente la información técnica de una flota de vehículos, así como el historial de mantenimiento. El proyecto está diseñado para permitir a los usuarios administrar vehículos y sus datos, realizar búsquedas, y obtener reportes detallados de los atributos de cada vehículo.

El sistema se basa en la creación de clases que representan los diferentes componentes clave del sistema de gestión, como los vehículos y su historial de mantenimiento. Cada clase tiene atributos específicos que ayudan a organizar la información de manera estructurada, lo que permite su fácil manipulación y búsqueda.


## Gestión de Vehículos
Este proyecto es una aplicación Java para la gestión de vehículos, donde puedes agregar vehículos a una lista, buscar por año específico, y filtrar vehículos cuyo año sea mayor o menor que un año determinado.

Requisitos
Java 8 o superior.
Entorno de desarrollo configurado para ejecutar programas en Java.
Funcionalidades

1. Agregar Vehículos
Puedes agregar vehículos a la lista utilizando el método agregarVehiculo().

- Marca
- Modelo
- Año
- Kilometraje
- Condición (ej. Bueno, Regular, Excelente)
- Tipo de Combustible (ej. Gasolina, Diesel)

2. Buscar Vehículos por Año Exacto
Utiliza el método buscarVehiculoPorAnoExacto() para buscar vehículos que coincidan con un año específico.

3. Buscar Vehículos por Año Mayor o Menor a un Año Específico
Utiliza el método buscarVehiculoPorAno() para filtrar vehículos cuyo año sea mayor o menor que el proporcionado. 

4. Imprimir Todos los Vehículos
Utiliza el método imprimirVehiculos() para listar todos los vehículos actualmente almacenados.

Clona el repositorio en tu máquina local.
Compila el proyecto en tu entorno de desarrollo.
Corre la clase Main y utiliza las funcionalidades descritas para gestionar la lista de vehículos.

## Tareas por Usuario

Cada usuario ha trabajado en diferentes partes del sistema, desarrollando funcionalidades específicas:

**Usuario A:** Creación de la clase Vehiculo y su gestión de atributos como marca, modelo, año, y tipo de combustible. También agregó un filtro para buscar vehículos por rango de años.

**Usuario B:** Implementación de la clase HistorialMantenimiento, que almacena el historial de reparaciones de cada vehículo. Añadió la funcionalidad para filtrar vehículos según si su año es mayor o menor al especificado.

**Usuario C:** Desarrollo de la clase Main, que permite agregar y buscar vehículos. También modificó la clase Vehiculo para añadir el atributo "color".

**Usuario D:** Implementación de validaciones adicionales para el tipo de combustible, y añadió el atributo "potencia" en la clase Vehiculo.

**Usuario E:** Mejoró el método de impresión de datos para incluir los nuevos atributos, como color y potencia.

**Usuario F:** Se encargó de la gestión del GitHub, merge entre ramas. Busco que se siguieran estándares de uso en Gitflow.

## Anotación Importante

El sistema está diseñado para ser modular y escalable, permitiendo la adición de nuevas funcionalidades en futuras fases del desarrollo.