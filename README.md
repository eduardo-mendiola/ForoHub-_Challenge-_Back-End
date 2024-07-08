# ForoHub

## Descripción del Proyecto

ForoHub es una API REST desarrollada como parte del desafío de back-end de Alura Latam. Esta API permite la gestión de tópicos en un foro, similar al que utilizan los estudiantes para resolver dudas sobre cursos y proyectos. El proyecto implementa operaciones CRUD (Crear, Consultar, Actualizar y Eliminar) para los tópicos utilizando el framework Spring y sigue las mejores prácticas del modelo REST.

## Funcionalidades

La API permite a los usuarios realizar las siguientes acciones:
- Crear un nuevo tópico.
- Mostrar todos los tópicos creados.
- Mostrar un tópico específico.
- Actualizar un tópico existente.
- Eliminar un tópico.

## Tecnologías Utilizadas

- Tecnologías Utilizadas
- Java 17
- Spring Boot 3.3.1
- Spring Data JPA
- Spring Security
- MySql Database
- Maven
- Flyway (para migraciones de base de datos)

## Validaciones y Seguridad

- **Validaciones:** La API realiza validaciones de las reglas de negocio, como la verificación de campos obligatorios y el formato de los datos.
- **Autenticación/Autorización:** Implementado un servicio de autenticación/autorización utilizando Spring Security para restringir el acceso a la información.

## Endpoints de la API

## Autenticación

### Iniciar sesión
- **Endpoint:** `POST /auth/login`
- **Descripción:** Permite a un usuario autenticarse en el sistema.
- **Body:**
  ```json
  {
    "email": "string",
    "contrasena": "string"
  }
  ```

### Tópicos

#### Crear un nuevo tópico
- **Endpoint:** `POST /topicos`
- **Descripción:** Permite crear un nuevo tópico.
- **Body:**
  ```json
  {
    "titulo": "string",
    "mensaje": "string",
    "idAutor": "integer",
    "idCurso": "integer"
  }
  ```

#### Mostrar todos los tópicos
- **Endpoint:** `GET /topicos`
- **Descripción:** Devuelve una lista de todos los tópicos creados.

#### Mostrar un tópico específico
- **Endpoint:** `GET /topicos/{id}`
- **Descripción:** Devuelve los detalles de un tópico específico por su ID.

#### Actualizar un tópico
- **Endpoint:** `PUT /topicos/{id}`
- **Descripción:** Permite actualizar los datos de un tópico existente.
- **Body:**
  ```json
  {
    "titulo": "string",
    "mensaje": "string"
  }
  ```

#### Eliminar un tópico
- **Endpoint:** `DELETE /topicos/{id}`
- **Descripción:** Permite eliminar un tópico existente por su ID.

### Usuarios

#### Registrar un nuevo usuario
- **Endpoint:** `POST /usuarios`
- **Descripción:** Permite registrar un nuevo usuario.
- **Body:**
  ```json
  {
    "nombre": "string",
    "email": "string",
    "contrasena": "string",
    "perfiles": "array"
  }
  ```

#### Actualizar un usuario
- **Endpoint:** `PUT /usuarios/{id}`
- **Descripción:** Permite actualizar los datos de un usuario existente.
- **Body:**
  ```json
  {
    "nombre": "string",
    "contrasena": "string",
    "perfiles": "array"
  }
  ```

### Cursos

#### Crear un nuevo curso
- **Endpoint:** `POST /cursos`
- **Descripción:** Permite crear un nuevo curso.
- **Body:**
  ```json
  {
    "nombre": "string",
    "categoria": "string"
  }
  ```

#### Actualizar un curso
- **Endpoint:** `PUT /cursos/{id}`
- **Descripción:** Permite actualizar los datos de un curso existente.
- **Body:**
  ```json
  {
    "nombre": "string",
    "categoria": "string"
  }
  ```

### Respuestas

#### Crear una respuesta
- **Endpoint:** `POST /respuestas`
- **Descripción:** Permite crear una nueva respuesta en un tópico.
- **Body:**
  ```json
  {
    "mensaje": "string",
    "idTopico": "integer",
    "idAutor": "integer"
  }
  ```

## Esquemas de Datos

### Datos de Actualización de Usuario
```json
{
  "id": "integer",
  "nombre": "string",
  "contrasena": "string",
  "perfiles": "array"
}
```

### Datos de Actualización de Tópico
```json
{
  "id": "integer",
  "titulo": "string",
  "mensaje": "string"
}
```

### Datos de Registro de Usuario
```json
{
  "nombre": "string",
  "email": "string",
  "contrasena": "string",
  "perfiles": "array"
}
```

### Datos de Creación de Tópico
```json
{
  "titulo": "string",
  "mensaje": "string",
  "idAutor": "integer",
  "idCurso": "integer"
}
```

### Datos de Creación de Curso
```json
{
  "nombre": "string",
  "categoria": "string"
}
```
