-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2017 a las 13:32:43
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `9tutorials`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_fish`
--

CREATE TABLE `tbl_fish` (
  `fish_img` int(11) NOT NULL,
  `fish_name` varchar(255) NOT NULL,
  `cat_name` varchar(50) NOT NULL,
  `size_name` varchar(50) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_fish`
--

INSERT INTO `tbl_fish` (`fish_img`, `fish_name`, `cat_name`, `size_name`, `price`) VALUES
(8, 'Tarjeta de Video', 'Asus', 'Medium', 1000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_login`
--

CREATE TABLE `tbl_login` (
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_login`
--

INSERT INTO `tbl_login` (`email`, `password`) VALUES
('gpkharvi@gmail.com', 'password'),
('alejandro@gmail.com', '12345'),
('a', 'a');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_fish`
--
ALTER TABLE `tbl_fish`
  ADD KEY `fish_img` (`fish_img`);
ALTER TABLE `tbl_fish` ADD FULLTEXT KEY `my_index` (`fish_name`,`cat_name`,`size_name`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_fish`
--
ALTER TABLE `tbl_fish`
  MODIFY `fish_img` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
