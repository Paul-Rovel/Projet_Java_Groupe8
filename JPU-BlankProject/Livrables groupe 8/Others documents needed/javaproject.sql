-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 26 mai 2021 à 23:34
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `javaproject`
--
CREATE DATABASE IF NOT EXISTS `javaproject` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `javaproject`;

DELIMITER $$
--
-- Procédures
--
DROP PROCEDURE IF EXISTS `getMapByID`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getMapByID` (IN `param1` INT(11))  NO SQL
SELECT * FROM maps WHERE `Id` = `param1`$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `maps`
--

DROP TABLE IF EXISTS `maps`;
CREATE TABLE IF NOT EXISTS `maps` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `width` int(11) NOT NULL,
  `height` int(11) NOT NULL,
  `map` text NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `maps`
--

INSERT INTO `maps` (`Id`, `width`, `height`, `map`) VALUES
(1, 16, 17, '4444444444444444\r\n4133033233300304\r\n4333300033323034\r\n4330032033334404\r\n4033330033000334\r\n4000333332333334\r\n4333003300034004\r\n4003330033333334\r\n4333333333333334\r\n4333033233300304\r\n4333300033323034\r\n4330032033334404\r\n4033330033000334\r\n4000333332333334\r\n4333003300034004\r\n4003330033333334\r\n4444444444444444'),
(2, 16, 17, '4444444444444444\r\n4133033233300304\r\n4333300033323034\r\n4330032033334404\r\n4033330033000334\r\n4000333332333334\r\n4333003300034004\r\n4003330033333334\r\n4333000333333334\r\n4333033233300304\r\n4333300033323034\r\n4330032033334404\r\n4033330033000334\r\n4000333333333324\r\n4333003300034004\r\n4003330033332334\r\n4444444444444444'),
(3, 16, 17, '4444444444444444\r\n4333011233300104\r\n4333300033321034\r\n4334432011114404\r\n4033310033000134\r\n4000113332333114\r\n4333001100034004\r\n4001330033213334\r\n4004444444444434\r\n4333011233300114\r\n4333300033321034\r\n4330032011114414\r\n4033310033000234\r\n4000113332033114\r\n4333001103034114\r\n4001330033313334\r\n4444444444444444'),
(4, 16, 17, '4444444444444444\r\n4333011233300104\r\n4333300033321034\r\n4334432011114404\r\n4033310033000134\r\n4000113332333114\r\n4333001100034004\r\n4001330033213334\r\n4004444444444434\r\n4333011233300114\r\n4333300033321034\r\n4330032011114414\r\n4033310033000234\r\n4000113332033114\r\n4344004444201414\r\n4001330033313334\r\n4444444444444444'),
(5, 16, 17, '4444444444444444\r\n4133011233300104\r\n4333300033321034\r\n4334432011114404\r\n4033310033000134\r\n4000113332333114\r\n4333001100034004\r\n4001330033213334\r\n4004444444444434\r\n4333011233300114\r\n4333300033321034\r\n4330032011114414\r\n4033310030000234\r\n4000113332033114\r\n4333001100034114\r\n4004444444444444\r\n4444444444444444'),
(6, 16, 17, '4444444444444444\r\n4111132312312304\r\n4110133323123014\r\n4011112323123034\r\n4111433312312304\r\n4121112312301114\r\n4311411231230114\r\n4111111231230114\r\n4111231230111114\r\n4110133323123014\r\n4011112323123034\r\n4111433312312304\r\n4121112312301114\r\n4311411231230114\r\n4111111231230114\r\n4110133323123014\r\n4444444444444444\r\n');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
