-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.14 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for adres_boek
DROP DATABASE IF EXISTS `adres_boek`;
CREATE DATABASE IF NOT EXISTS `adres_boek` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `adres_boek`;

-- Dumping structure for table adres_boek.contact_informatie
DROP TABLE IF EXISTS `contact_informatie`;
CREATE TABLE IF NOT EXISTS `contact_informatie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adres` varchar(50) NOT NULL,
  `telefoon_nummer` int(11) NOT NULL,
  `persoon_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Dumping data for table adres_boek.contact_informatie: 0 rows
/*!40000 ALTER TABLE `contact_informatie` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact_informatie` ENABLE KEYS */;

-- Dumping structure for table adres_boek.persoon
DROP TABLE IF EXISTS `persoon`;
CREATE TABLE IF NOT EXISTS `persoon` (
  `id` int(11) NOT NULL,
  `naam` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `naam` (`naam`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Dumping data for table adres_boek.persoon: 2 rows
/*!40000 ALTER TABLE `persoon` DISABLE KEYS */;
REPLACE INTO `persoon` (`id`, `naam`) VALUES
	(1, 'Wakanda'),
	(2, 'Tesla');
/*!40000 ALTER TABLE `persoon` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
