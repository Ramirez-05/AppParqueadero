
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
    tipo_vehiculo ENUM ('Camion', 'Camioneta', 'Carro', 'Moto'),
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



INSERT INTO parqueadero (nit, nombre, direccion, telefono) VALUES
(123456789, 'Parqueadero A', 'Calle 123, Ciudad', 1234567890),
(987654321, 'Parqueadero B', 'Avenida XYZ, Ciudad', 9876543210),
(555555555, 'Parqueadero C', 'Carrera ABC, Ciudad', 5555555555),
(111111111, 'Parqueadero D', 'Calle 456, Ciudad', 1111111111),
(999999999, 'Parqueadero E', 'Avenida LMN, Ciudad', 9999999999);

INSERT INTO persona (nombre, apellidos, cedula, celular) VALUES
('Juan', 'Perez', '123456789', 3216549870),
('Maria', 'Gomez', '987654321', 7890123456),
('Carlos', 'Lopez', '111111111', 5555555555),
('Luisa', 'Martinez', '999999999', 8888888888),
('Pedro', 'Rodriguez', '555555555', 4444444444);

INSERT INTO usuario (id_persona, email, contrasenia, tipo, estado) VALUES
(1, 'juan@example.com', '111', 'ADMIN', 'ACTIVO'),
(2, 'maria@example.com', '222', 'VENDEDOR', 'ACTIVO'),
(3, 'carlos@example.com', '333', 'VENDEDOR', 'ACTIVO'),
(4, 'luisa@example.com', '444', 'VENDEDOR', 'INACTIVO'),
(5, 'pedro@example.com', '555', 'ADMIN', 'ACTIVO');

INSERT INTO asignacion (id_parqueadero, id_usuario) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

INSERT INTO tarifas (tipo_vehiculo, Tarifa) VALUES
('Camion', 15.000),
('Camioneta', 10.000),
('Carro', 5.000),
('Moto', 2.500);


INSERT INTO registro_vehiculos (placa, tipo_vehiculo, responsable) VALUES
('ABC123', 'Carro', 'Dueño1'),
('XYZ987', 'Moto', 'Dueño2'),
('DEF456', 'Camioneta', 'Dueño3'),
('GHI789', 'Camion', 'Dueño4'),
('LMN111', 'Carro', 'Dueño5');

INSERT INTO ticket (placa, id_asignacion, id_tarifa, total) VALUES
('ABC123', 1, 3, 15.000),
('XYZ987', 2, 4, 5.000),
('DEF456', 3, 2, 10.000),
('GHI789', 4, 1, 30.000);

