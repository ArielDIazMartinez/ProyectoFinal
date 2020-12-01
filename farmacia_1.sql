-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-11-2020 a las 23:27:57
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `farmacia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `Nombre` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `RNC` int(50) NOT NULL,
  `Correo` varchar(20) NOT NULL,
  `Telefono` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Nombre`, `Apellidos`, `RNC`, `Correo`, `Telefono`) VALUES
('e', 'e', 52, 'elihanth@hotmail.com', 52),
('r', 'r', 56, 'r', 12),
('w', 'w', 22, 'w', 22);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `generar_ventas`
--

CREATE TABLE `generar_ventas` (
  `Cliente` varchar(50) NOT NULL,
  `RNC` int(50) NOT NULL,
  `Producto` varchar(50) NOT NULL,
  `Precio` float NOT NULL,
  `Cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `Nombre` varchar(50) NOT NULL,
  `Precio` float NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Fecha_vencimiento` date NOT NULL,
  `Tipo` varchar(100) NOT NULL,
  `Descripcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`Nombre`, `Precio`, `Cantidad`, `Fecha_vencimiento`, `Tipo`, `Descripcion`) VALUES
('Aspirina', 500, 500, '2020-11-20', 'Analgecico', 'te sana'),
('1', 1, 1, '2020-11-20', 'Seleccionar', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_medicamentos`
--

CREATE TABLE `tipos_medicamentos` (
  `Nombre` varchar(50) NOT NULL,
  `Descripcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipos_medicamentos`
--

INSERT INTO `tipos_medicamentos` (`Nombre`, `Descripcion`) VALUES
('Hola', 'Hola'),
('hola3', 'hola3'),
('hola4', 'hola4'),
('hola5', 'hola5'),
('Hola6', 'Hola6'),
('hola7', 'hola7'),
('hola8', 'hola8');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
