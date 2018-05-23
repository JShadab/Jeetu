-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.22 - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL version:             7.0.0.4053
-- Date/time:                    2018-05-22 17:26:20
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

-- Dumping database structure for empdb
CREATE DATABASE IF NOT EXISTS `empdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `empdb`;


-- Dumping structure for table empdb.emp
CREATE TABLE IF NOT EXISTS `emp` (
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `salary` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table empdb.emp: ~1 rows (approximately)
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` (`name`, `age`, `salary`) VALUES
	('Shadab', 21, 1234);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
/*!40014 SET FOREIGN_KEY_CHECKS=1 */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
