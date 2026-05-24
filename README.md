# ActividadesAbstracfaces

![Java](https://img.shields.io/badge/Java-11%2B-blue) ![GitHub Repo](https://img.shields.io/badge/Repo-J44v11%2FActividadesAbstracfaces-green)

Proyecto U5 T3 — Interfaces y clases abstractas.

## Tabla de contenidos

- [Descripción](#descripción)
- [Estructura](#estructura)
- [Requisitos](#requisitos)
- [Extensiones recomendadas (VS Code)](#extensiones-recomendadas-vs-code)
- [Clonar el proyecto](#clonar-el-proyecto)
- [Ejecutar la aplicación](#ejecutar-la-aplicación)

***

## Descripción

Colección de ejercicios didácticos organizados en dos paquetes dentro de `src/net/salesianos`:

- `cochesdecombustion`: clases relacionadas con vehículos de combustión (`CocheCombustion`, `Vehiculo`).
- `figurasgeometricas`: cálculos y figuras geométricas (`Circulo`, `Rectangulo`, `CalculoGeometrico`).

El punto de entrada de las prácticas es la clase `App` en [src/App.java](src/App.java).

## Estructura

```text
ActividadesAbstracfaces/
├─ src/
│  ├─ App.java
│  └─ net/
│     └─ salesianos/
│        ├─ cochesdecombustion/
│        │  ├─ CocheCombustion.java
│        │  └─ Vehiculo.java
│        └─ figurasgeometricas/
│           ├─ CalculoGeometrico.java
│           ├─ Circulo.java
│           └─ Rectangulo.java
├─ bin/   (salida de compilación)
└─ README.md
```

## Requisitos

- Java JDK 11 o superior.
- Git (para clonar el repositorio).

## Extensiones recomendadas (VS Code)

Instala estas extensiones para una mejor experiencia al editar, compilar y depurar Java en VS Code:

- `Extension Pack for Java` (Microsoft) — incluye soporte y herramientas esenciales.
- `Language Support for Java(TM) by Red Hat` — resaltado y asistencia de código.
- `Debugger for Java` (Microsoft) — depuración integrada.
- `Java Test Runner` (Microsoft) — ejecutar tests con JUnit.
- `Maven for Java` (Microsoft) — si quieres gestionar dependencias y proyectos Maven.

## Clonar el proyecto

En una terminal en VS Code, muevete hacia la carpeta donde quieras guardar tu proyecto.

Luego en la misma terminal ejecuta:

```bash
git clone https://github.com/J44v11/ActividadesAbstracfaces.git
cd ActividadesAbstracfaces
```

Si vas a trabajar desde la línea de comandos, cambia al subdirectorio `src`:

```bash
cd src
```

## Ejecutar la aplicación

Opciones según tu entorno Java:

1) Ejecutar directamente el fichero fuente (Java 11+ — lanzamiento de archivo único)

```bash
cd src
java App.java
```

Esto compila y ejecuta `App.java` en un solo paso si la clase `App` está en el paquete por defecto.
