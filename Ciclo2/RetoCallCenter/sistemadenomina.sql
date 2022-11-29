-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2022 a las 01:44:09
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemadenomina`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_contacto`
--

CREATE TABLE `tb_contacto` (
  `id` int(11) NOT NULL,
  `id_empleado` int(11) DEFAULT NULL,
  `dirrecion` varchar(60) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `email` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_contacto`
--

INSERT INTO `tb_contacto` (`id`, `id_empleado`, `dirrecion`, `telefono`, `email`) VALUES
(1, 1, 'LA PLAYA', '3003162985', 'correo@correo.com'),
(2, 2, 'BOGOTA', '5555555', 'correo2@correo.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_empleado`
--

CREATE TABLE `tb_empleado` (
  `id` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `horas_extra` int(20) DEFAULT NULL,
  `aux_transp` varchar(60) DEFAULT NULL,
  `salario` int(20) NOT NULL,
  `bono_dic` int(11) DEFAULT NULL,
  `apellido` varchar(60) DEFAULT NULL,
  `cedula` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_empleado`
--

INSERT INTO `tb_empleado` (`id`, `nombre`, `horas_extra`, `aux_transp`, `salario`, `bono_dic`, `apellido`, `cedula`) VALUES
(1, 'IVAN', 50000, 'true', 8000000, 1200000, 'CASTRO', ''),
(2, 'SILVESTRE', 65000, 'true', 5000000, 500000, 'DANGOND', ''),
(4, 'JUAN', 45000, 'false', 5000000, 500000, 'PEREZ', ''),
(5, 'ANIBAL', 35000, 'false', 4500000, 1200000, 'VELAZQUES', ''),
(6, 'NICKY', 0, 'true', 3350000, 500000, 'JAM', ''),
(7, 'PAPO', 25000, 'true', 3350000, 500000, 'MAN', ''),
(8, 'CARLOS', 25000, 'false', 6524000, 1000000, 'VIVES', ''),
(9, 'KICKY', 32550, 'false', 6500000, 1000000, 'MARTIN', ''),
(11, 'EL', 85421, 'false', 5261000, 1000000, 'AFINADITO', ''),
(15, 'KALETH', 35000, 'true', 3300000, 1200000, 'MORALES', ''),
(17, 'MIGUEL', 89457, 'true', 6500000, 1000000, 'BURBANO', ''),
(19, 'ADRIAN', 0, 'true', 8000000, NULL, 'MARINO', ''),
(22, 'ASHLEE', 34455, 'true', 5000000, NULL, 'CASTRO', ''),
(23, 'MAYE', 25000, 'true', 6500000, NULL, 'CESPEDES', ''),
(24, 'DANNA', 35000, 'false', 7700000, NULL, 'BASTIDAS', ''),
(25, 'EDISSON', 85421, 'true', 5261000, NULL, 'ESPITALETA', ''),
(26, 'JANET', 0, 'true', 6500000, NULL, 'MARULANDA', ''),
(27, 'WILSON', 45000, 'true', 8000000, NULL, 'URBANO', ''),
(29, 'BORRAR', 0, 'true', 5000000, NULL, 'BORRAR', '72009461');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_contacto`
--
ALTER TABLE `tb_contacto`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_empleado_2` (`id_empleado`),
  ADD KEY `id_empleado` (`id_empleado`);

--
-- Indices de la tabla `tb_empleado`
--
ALTER TABLE `tb_empleado`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_contacto`
--
ALTER TABLE `tb_contacto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tb_empleado`
--
ALTER TABLE `tb_empleado`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_contacto`
--
ALTER TABLE `tb_contacto`
  ADD CONSTRAINT `tb_contacto_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `tb_empleado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
