-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 19-10-2023 a las 05:49:41
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `parqueadero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignacion`
--

CREATE TABLE `asignacion` (
  `id` int(11) NOT NULL,
  `id_parqueadero` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asignacion`
--

INSERT INTO `asignacion` (`id`, `id_parqueadero`, `id_usuario`, `create_at`, `update_at`) VALUES
(1, 1, 1, '2023-10-11 20:58:34', '2023-10-11 20:58:34'),
(6, 6, 6, '2023-10-11 20:58:34', '2023-10-11 20:58:34');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parqueadero`
--

CREATE TABLE `parqueadero` (
  `nit` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` int(11) NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `parqueadero`
--

INSERT INTO `parqueadero` (`nit`, `nombre`, `direccion`, `telefono`, `create_at`, `update_at`) VALUES
(1, 'CHSRLYGLOSD', 'kr 28 calle 27', 321, '2023-10-07 18:28:05', '2023-10-12 19:59:54'),
(2, 'wq', 'qw', 12, '2023-10-11 20:57:54', '2023-10-11 20:57:54'),
(3, 'Parqueadero 3', 'Calle 123, Carrera 456', 333, '2023-10-12 01:57:54', '2023-10-12 01:57:54'),
(4, 'Parqueadero 4', 'Calle 456, Carrera 789', 444, '2023-10-12 00:59:44', '2023-10-12 00:59:44'),
(5, 'dds', 'sd', 1212, '2023-10-11 19:59:44', '2023-10-11 19:59:44'),
(6, 'Santiago', 'qw', 12, '2023-10-11 20:58:00', '2023-10-12 20:00:03'),
(7, 'Parqueadero 7', 'Calle 789, Carrera 012', 777, '2023-10-12 01:58:00', '2023-10-13 01:00:03'),
(8, 'Parqueadero 8', 'Calle 012, Carrera 345', 888, '2023-10-12 01:58:00', '2023-10-13 01:00:03'),
(9, 'Parqueadero 9', 'Calle 345, Carrera 678', 999, '2023-10-12 01:58:00', '2023-10-13 01:00:03');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `cedula` varchar(15) DEFAULT NULL,
  `celular` int(11) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `nombre`, `apellidos`, `cedula`, `celular`, `create_at`, `update_at`) VALUES
(1, 'Juan', 'Pérez', '123456789', 2147483647, '2023-10-11 20:10:34', '2023-10-11 20:10:34'),
(2, 'María', 'Gómez', '987654321', 2147483647, '2023-10-11 20:10:34', '2023-10-11 20:10:34'),
(3, 'Carlos', 'Rodríguez', '456789123', 2147483647, '2023-10-11 20:10:34', '2023-10-11 20:10:34'),
(4, 'Ana', 'López', '654321987', 2147483647, '2023-10-11 20:10:34', '2023-10-11 20:10:34'),
(5, 'Pedro', 'Martínez', '789123456', 2147483647, '2023-10-11 20:10:34', '2023-10-11 20:10:34'),
(6, 'Luisa', 'Sánchez', '234567891', 2147483647, '2023-10-11 20:10:34', '2023-10-11 20:10:34'),
(7, '21', '2121', '12', 21, '2023-10-12 23:13:19', '2023-10-12 23:13:19'),
(8, '21122', '212121', '2221', 211212, '2023-10-12 23:15:40', '2023-10-12 23:15:40');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_vehiculos`
--

CREATE TABLE `registro_vehiculos` (
  `placa` varchar(7) NOT NULL,
  `responsable` varchar(100) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registro_vehiculos`
--

INSERT INTO `registro_vehiculos` (`placa`, `responsable`, `create_at`, `update_at`) VALUES
('ABC123', 'Juan Pérez', '2023-10-12 01:58:34', '2023-10-12 01:58:34'),
('DEF456', 'María Gómez', '2023-10-12 01:58:34', '2023-10-12 01:58:34'),
('GHI789', 'Carlos Rodríguez', '2023-10-12 01:58:34', '2023-10-12 01:58:34'),
('JKL012', 'Ana López', '2023-10-12 01:58:34', '2023-10-12 01:58:34'),
('MNO345', 'Pedro Martínez', '2023-10-12 01:58:34', '2023-10-12 01:58:34');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarifas`
--

CREATE TABLE `tarifas` (
  `id` int(11) NOT NULL,
  `tipo_vehiculo` enum('Camion','Camioneta','Carro','Moto') DEFAULT NULL,
  `Tarifa` float(10,2) DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tarifas`
--

INSERT INTO `tarifas` (`id`, `tipo_vehiculo`, `Tarifa`, `create_at`, `update_at`) VALUES
(1, 'Camion', 5000.00, '2023-10-19 01:52:55', '2023-10-19 01:52:55'),
(2, 'Camioneta', 6000.00, '2023-10-19 01:52:55', '2023-10-19 01:52:55'),
(3, 'Carro', 4000.00, '2023-10-19 01:53:15', '2023-10-19 01:53:15'),
(4, 'Moto', 2500.00, '2023-10-19 01:53:15', '2023-10-19 01:53:15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE `ticket` (
  `id` int(11) NOT NULL,
  `placa` varchar(7) DEFAULT NULL,
  `id_asignacion` int(11) DEFAULT NULL,
  `id_tarifa` int(11) DEFAULT NULL,
  `total` float DEFAULT NULL,
  `create_entrada` timestamp NOT NULL DEFAULT current_timestamp(),
  `salida` timestamp NULL DEFAULT NULL,
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`id`, `placa`, `id_asignacion`, `id_tarifa`, `total`, `create_entrada`, `salida`, `update_at`) VALUES
(1, 'ABC123', 1, 1, 5000, '2023-10-20 02:13:16', '2023-10-23 02:13:16', '2023-10-19 02:13:42'),
(2, 'MNO345', 1, 1, 5600, '2023-10-24 02:13:46', '2023-10-25 02:13:46', '2023-10-19 02:14:07'),
(3, 'GHI789', 1, 3, 5000, '2023-10-28 02:14:11', '2023-10-31 02:14:11', '2023-10-19 02:14:31');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `id_persona` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `contrasenia` varchar(250) DEFAULT NULL,
  `tipo` enum('ADMIN','VENDEDOR') DEFAULT NULL,
  `estado` enum('ACTIVO','INACTIVO') DEFAULT NULL,
  `create_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `id_persona`, `email`, `contrasenia`, `tipo`, `estado`, `create_at`, `update_at`) VALUES
(1, 1, 'erick@gmail.com', '147', 'VENDEDOR', 'ACTIVO', '2023-10-11 20:10:34', '2023-10-13 04:26:34'),
(2, 2, 'jp@gmail.com', '123', 'ADMIN', 'ACTIVO', '2023-10-11 20:10:34', '2023-10-19 01:44:30'),
(3, 3, 'carlos@example.com', 'secreto123', 'VENDEDOR', 'ACTIVO', '2023-10-11 20:10:34', '2023-10-11 20:12:16'),
(4, 4, 'ana@example.com', 'contrasenia123', 'VENDEDOR', 'ACTIVO', '2023-10-11 20:10:34', '2023-10-11 22:21:28'),
(5, 5, 'pedro@example.com', 'mipassword', 'VENDEDOR', 'ACTIVO', '2023-10-11 20:10:34', '2023-10-11 20:12:27'),
(6, 6, 'luisa@example.com', 'clave_segura', 'VENDEDOR', 'ACTIVO', '2023-10-11 20:10:34', '2023-10-11 20:12:31'),
(7, 7, '21', '121212', 'VENDEDOR', 'ACTIVO', '2023-10-12 23:13:19', '2023-10-12 23:13:19'),
(8, 8, '1212121212', '121212121212121212', 'VENDEDOR', 'ACTIVO', '2023-10-12 23:15:40', '2023-10-12 23:15:40');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asignacion`
--
ALTER TABLE `asignacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_parqueadero` (`id_parqueadero`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `parqueadero`
--
ALTER TABLE `parqueadero`
  ADD PRIMARY KEY (`nit`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `registro_vehiculos`
--
ALTER TABLE `registro_vehiculos`
  ADD PRIMARY KEY (`placa`);

--
-- Indices de la tabla `tarifas`
--
ALTER TABLE `tarifas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_asignacion` (`id_asignacion`),
  ADD KEY `id_tarifa` (`id_tarifa`),
  ADD KEY `placa` (`placa`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_persona` (`id_persona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asignacion`
--
ALTER TABLE `asignacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `tarifas`
--
ALTER TABLE `tarifas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignacion`
--
ALTER TABLE `asignacion`
  ADD CONSTRAINT `asignacion_ibfk_1` FOREIGN KEY (`id_parqueadero`) REFERENCES `parqueadero` (`nit`),
  ADD CONSTRAINT `asignacion_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`id_asignacion`) REFERENCES `asignacion` (`id`),
  ADD CONSTRAINT `ticket_ibfk_2` FOREIGN KEY (`id_tarifa`) REFERENCES `tarifas` (`id`),
  ADD CONSTRAINT `ticket_ibfk_3` FOREIGN KEY (`placa`) REFERENCES `registro_vehiculos` (`placa`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
