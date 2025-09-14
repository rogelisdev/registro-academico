# Sistema de Registro de Estudiantes

Este proyecto es una aplicación de escritorio en Java Swing que permite gestionar estudiantes y sus notas. Incluye funcionalidades de login para administrador, registro de estudiantes, validaciones de datos y manejo de archivos CSV.

---

## Funcionalidades

- **Login seguro:** acceso solo para administradores.
- **Registro de estudiantes:** ingresar nombre, edad y 3 notas.
- **Validaciones de datos:**
  - Nombre solo letras y espacios.
  - Edad mayor a 0.
  - Notas entre 0.0 y 5.0.
- **Manejo de CSV:**
  - Guardar lista de estudiantes en archivo CSV.
  - Cargar estudiantes desde un CSV existente.
- **Cerrar sesión:** regresar al login desde el frame principal.

---

## Tecnologías

- Java 17+
- Swing (Java GUI)
- Git para control de versiones

---

## Cómo ejecutar

1. Clonar el repositorio:
```bash
git clone https://github.com/rogelisdev/registro-academico.git
