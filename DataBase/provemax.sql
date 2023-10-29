-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 00:28:22
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `provemax`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombreCategoria` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `nombreCategoria`) VALUES
(7, 'Indumentarias'),
(8, 'Comestibles'),
(9, 'Limpieza');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idMetodoPago` int(11) NOT NULL,
  `precioCosto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `idProveedor`, `fecha`, `idMetodoPago`, `precioCosto`) VALUES
(1, 11, '2023-10-06', 4, 12),
(2, 11, '2023-10-11', 4, 45),
(3, 11, '2023-10-06', 4, 45),
(4, 11, '2023-10-11', 4, 60),
(5, 11, '2023-10-12', 4, 39),
(6, 11, '2023-10-12', 4, 44),
(7, 11, '2023-10-11', 4, 1246),
(19, 11, '2023-10-19', 4, 12),
(20, 11, '2023-10-24', 4, 123),
(21, 11, '2023-10-05', 4, 12),
(22, 11, '2023-10-25', 4, 15),
(23, 11, '2023-10-17', 4, 112),
(24, 11, '2023-10-17', 4, 112),
(25, 11, '2023-10-12', 4, 123),
(26, 11, '2023-10-12', 4, 123),
(27, 11, '2023-10-12', 4, 123),
(28, 11, '2023-10-12', 4, 123),
(29, 11, '2023-10-13', 4, 15),
(30, 11, '2023-10-19', 4, 15),
(31, 11, '2023-10-12', 4, 15),
(32, 11, '2023-10-13', 4, 12),
(33, 11, '2023-10-13', 4, 12),
(34, 11, '2023-10-11', 4, 12),
(35, 11, '2023-10-12', 4, 12),
(36, 11, '2023-10-12', 4, 1226),
(37, 11, '2023-10-12', 4, 1223),
(38, 11, '2023-10-12', 4, 1223),
(39, 11, '2023-10-05', 4, 0),
(40, 11, '2023-10-05', 4, 1),
(41, 11, '2023-10-11', 4, 10),
(42, 11, '2023-10-11', 4, 123),
(43, 11, '2023-10-18', 4, 12),
(44, 11, '2023-10-05', 4, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idCompra` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`idDetalle`, `cantidad`, `precioCosto`, `idCompra`, `idProducto`) VALUES
(3, 15, 15, 5, 21),
(4, 24, 24, 5, 21),
(5, 11, 11, 6, 21),
(6, 33, 33, 6, 21),
(7, 14, 14, 7, 21),
(8, 1, 1232, 7, 24),
(23, 15, 15, 22, 21),
(24, 112, 112, 23, 21),
(25, 112, 112, 24, 21),
(26, 123, 123, 25, 21),
(27, 123, 123, 26, 21),
(28, 123, 123, 28, 21),
(29, 15, 15, 29, 21),
(30, 15, 15, 30, 21),
(31, 15, 15, 31, 21),
(32, 12, 12, 32, 21),
(33, 12, 12, 33, 21),
(34, 12, 12, 34, 21),
(35, 12, 12, 35, 21),
(36, 12, 12, 36, 21),
(37, 1214, 1214, 36, 15),
(38, 1223, 1223, 37, 21),
(39, 1223, 1223, 38, 21),
(40, 1, 1, 40, 21),
(41, 10, 10, 41, 21),
(42, 123, 123, 42, 21),
(43, 12, 12, 43, 21),
(44, 12, 12, 44, 21);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `metodopago`
--

CREATE TABLE `metodopago` (
  `idMetodoPago` int(11) NOT NULL,
  `NombreMetodo` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `metodopago`
--

INSERT INTO `metodopago` (`idMetodoPago`, `NombreMetodo`) VALUES
(4, 'Debito'),
(5, 'Credito'),
(6, 'Efectivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `nombreProducto` varchar(100) NOT NULL,
  `importadoNacional` char(30) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `fechaLimite` date NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `idCategoria`, `nombreProducto`, `importadoNacional`, `descripcion`, `fechaLimite`, `precioActual`, `stock`, `estado`) VALUES
(15, 7, 'Short', 'local', 'sadas', '2023-10-29', 12, 0, 1),
(16, 7, 'remeras', 'local', 'sadas', '2023-10-29', 10, 0, 1),
(17, 7, 'medias', 'local', 'sadas', '2023-10-29', 22, 0, 1),
(18, 8, 'Arroz', 'local', 'ffff', '2023-07-22', 22, 0, 1),
(19, 8, 'Azucar', 'local', 'ffff', '2023-07-22', 22, 0, 1),
(20, 8, 'Polenta', 'local', 'ffff', '2023-07-22', 1, 0, 1),
(21, 9, 'Poet', 'local', 'dddd', '2023-07-22', 1, 12, 1),
(22, 9, 'lusonfort', 'local', 'dddd', '2023-07-22', 12, 0, 1),
(23, 9, 'Hierba', 'local', 'dddd', '2023-07-22', 12, 0, 1),
(24, 7, 'asdfadf', 'asdfasdf', 'asdfasdfasdf', '2023-10-29', 1232, 12, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `razonSocial` varchar(100) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` int(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `pagina` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `razonSocial`, `domicilio`, `telefono`, `email`, `pagina`) VALUES
(11, 'Pepito', 'calle 22', 111111111, '', ''),
(12, 'Este', 'calle 15', 223312, '', ''),
(13, 'plo', 'calle 455', 4323123, '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor_producto`
--

CREATE TABLE `proveedor_producto` (
  `idProveedorproducto` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `costo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor_producto`
--

INSERT INTO `proveedor_producto` (`idProveedorproducto`, `idProveedor`, `idProducto`, `costo`) VALUES
(5, 11, 21, 1),
(6, 11, 16, 10),
(8, 12, 18, 22),
(9, 12, 19, 22),
(10, 12, 20, 1),
(11, 13, 21, 1),
(12, 13, 22, 12),
(13, 13, 23, 12),
(14, 11, 21, 1),
(15, 11, 16, 10),
(16, 11, 15, 12),
(17, 11, 17, 22),
(18, 11, 24, 1232);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idVentas` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `cantidad` int(11) NOT NULL,
  `PrecioTotal` double NOT NULL,
  `idMetodoPago` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idProvedor` (`idProveedor`),
  ADD KEY `idMetodoPago` (`idMetodoPago`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `detallecompra_ibfk_1` (`idCompra`),
  ADD KEY `detallecompra_ibfk_2` (`idProducto`);

--
-- Indices de la tabla `metodopago`
--
ALTER TABLE `metodopago`
  ADD PRIMARY KEY (`idMetodoPago`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `proveedor_producto`
--
ALTER TABLE `proveedor_producto`
  ADD PRIMARY KEY (`idProveedorproducto`),
  ADD KEY `idProvedor` (`idProveedor`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idVentas`),
  ADD KEY `idproducto` (`idProducto`),
  ADD KEY `idMetodoPago` (`idMetodoPago`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT de la tabla `metodopago`
--
ALTER TABLE `metodopago`
  MODIFY `idMetodoPago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `proveedor_producto`
--
ALTER TABLE `proveedor_producto`
  MODIFY `idProveedorproducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVentas` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`),
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`idMetodoPago`) REFERENCES `metodopago` (`idMetodoPago`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`),
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);

--
-- Filtros para la tabla `proveedor_producto`
--
ALTER TABLE `proveedor_producto`
  ADD CONSTRAINT `proveedor_producto_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`),
  ADD CONSTRAINT `proveedor_producto_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`idMetodoPago`) REFERENCES `metodopago` (`idMetodoPago`),
  ADD CONSTRAINT `ventas_ibfk_3` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
