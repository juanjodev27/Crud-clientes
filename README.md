# CRUD de Clientes con Spring Boot y PostgreSQL

Este proyecto es una API REST para la gestión de clientes, desarrollada con **Spring Boot** y **PostgreSQL**. Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre clientes.

## 🚀 Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.4.2**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

## 📌 Características

- Listar todos los clientes.
- Obtener un cliente por su ID.
- Crear un nuevo cliente.
- Actualizar datos de un cliente existente.
- Eliminar un cliente.

## ⚙️ Instalación y configuración

### 1) Clonar el repositorio
```bash
git clone https://github.com/juanjodev27/clientes.git
cd clientes

### 2) Configurar Postgresql
CREATE DATABASE clientes_db;

### 3) Configurar application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/clientes_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update

### 4) Construir y ejecutar el proyecto
mvn spring-boot:run

## Endpoints de la API

Método	  Endpoint	            Descripción
GET	       /clientes       	Obtener todos los clientes
GET   	  /clientes/{id}	  Obtener un cliente por ID
POST	   /clientes/crear	  Crear un nuevo cliente
PUT   	 /clientes/{id}	    Actualizar un cliente
DELETE	  /clientes/{id}	   Eliminar un cliente

AUTOR
Juan Jose Garcete
