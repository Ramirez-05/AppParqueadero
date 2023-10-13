
DROP DATABASE IF EXISTS parqueadero;

CREATE DATABASE parqueadero;

USE parqueadero;

CREATE TABLE parqueadero(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nit INT UNIQUE, 
    nombre VARCHAR(50),
    direccion VARCHAR(100),
    telefono INT,
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE persona(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellidos VARCHAR(50),
    cedula VARCHAR(15),
    celular INT,
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE usuario(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_persona INT,
    email VARCHAR(50),
    contrasenia VARCHAR(250),
    tipo ENUM ('ADMIN', 'VENDEDOR'),
    estado ENUM ('ACTIVO', 'INACTIVO'),
    FOREIGN KEY (id_persona) REFERENCES persona (id),
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


CREATE TABLE asignacion(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_parqueadero INT,
    id_usuario INT,
    FOREIGN KEY (id_parqueadero) REFERENCES parqueadero (id),
    FOREIGN KEY (id_usuario) REFERENCES usuario (id),
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE tarifas(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo_vehiculo ENUM ('Camion', 'Camioneta', 'Carro', 'Moto'),
    Tarifa FLOAT(10,2),
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE registro_vehiculos(
    placa VARCHAR(7) PRIMARY KEY,
    responsable VARCHAR(100),
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  
);

CREATE TABLE ticket(
    id INT PRIMARY KEY AUTO_INCREMENT,
    placa VARCHAR(7),
    id_asignacion INT,
    id_tarifa INT,
    total FLOAT,
    create_entrada TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    salida TIMESTAMP NULL,
    FOREIGN KEY (id_asignacion) REFERENCES asignacion (id),
    FOREIGN KEY (id_tarifa) REFERENCES tarifas (id),
    FOREIGN KEY (placa) REFERENCES registro_vehiculos (placa),
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);



