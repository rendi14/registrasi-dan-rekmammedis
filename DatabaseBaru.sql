-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.6-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;



CREATE DATABASE IF NOT EXISTS `1projectrpl` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `1projectrpl`;

CREATE TABLE IF NOT EXISTS `admin` (
  `Kode_adm` varchar(8) NOT NULL,
  `Username` varchar(10) NOT NULL,
  `Password` varchar(16) NOT NULL,
  PRIMARY KEY (`Kode_adm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table 1projectrpl.admin: ~7 rows (approximately)
DELETE FROM `admin`;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`Kode_adm`, `Username`, `Password`) VALUES
	('1\r\n', 're', 'ndi'),
	('12', 'dw', 'dsa'),
	('123', 'al', 'fan'),
	('34', 'dfewf', 'dd'),
	('342', 'alfan', 'kaput'),
	('4', 'few', 'e'),
	('5', 'gt', 'tr');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Dumping structure for table 1projectrpl.dokter
CREATE TABLE IF NOT EXISTS `dokter` (
  `kode_dokter` varchar(50) NOT NULL,
  `nama_dokter` varchar(50) NOT NULL,
  `jk` enum('L','P') NOT NULL,
  `alamat` varchar(50) NOT NULL DEFAULT '',
  `spesialis` enum('GINJAL','GIGI','JANTUNG','KULIT') NOT NULL,
  PRIMARY KEY (`kode_dokter`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table 1projectrpl.dokter: ~1 rows (approximately)
DELETE FROM `dokter`;
/*!40000 ALTER TABLE `dokter` DISABLE KEYS */;
INSERT INTO `dokter` (`kode_dokter`, `nama_dokter`, `jk`, `alamat`, `spesialis`) VALUES
	('001', 'Jasman', 'L', 'qq', 'GIGI'),
	('Ad', '123', 'L', '', 'GINJAL');
/*!40000 ALTER TABLE `dokter` ENABLE KEYS */;

-- Dumping structure for table 1projectrpl.pasien
CREATE TABLE IF NOT EXISTS `pasien` (
  `No_antrian` varchar(50) NOT NULL,
  `No_KTP` varchar(50) NOT NULL,
  `No_BPJS` varchar(50) NOT NULL,
  `Nama_Pasien` varchar(50) NOT NULL,
  `Ttl` varchar(50) NOT NULL DEFAULT '',
  `Golongan_Darah` enum('A','B','O','AB') NOT NULL,
  `Alamat` varchar(50) NOT NULL DEFAULT '',
  `Jk` enum('L','p') NOT NULL,
  `Layanan` enum('Non BPJS','BPJS') NOT NULL,
  PRIMARY KEY (`No_KTP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table 1projectrpl.pasien: ~2 rows (approximately)
DELETE FROM `pasien`;
/*!40000 ALTER TABLE `pasien` DISABLE KEYS */;
INSERT INTO `pasien` (`No_antrian`, `No_KTP`, `No_BPJS`, `Nama_Pasien`, `Ttl`, `Golongan_Darah`, `Alamat`, `Jk`, `Layanan`) VALUES
	('001', '321313', '222112', 'Anggito', 'Tangerang', 'A', 'Taman adiyasa', 'L', 'BPJS'),
	('002', '3360133672', '3322111', 'Respati panji raharjo', 'Mars', 'O', 'Taman adiyasa blok f 17 no 13', 'L', 'BPJS');
/*!40000 ALTER TABLE `pasien` ENABLE KEYS */;

-- Dumping structure for table 1projectrpl.pasien_bpjs
CREATE TABLE IF NOT EXISTS `pasien_bpjs` (
  `No_antrian` varchar(50) NOT NULL,
  `Nik` varchar(20) NOT NULL,
  `Kode_Dokter` varchar(50) NOT NULL,
  `Nama_pasien` varchar(50) NOT NULL DEFAULT '',
  `Jk` enum('L','P') NOT NULL,
  `Tgl_lahir` varchar(50) NOT NULL DEFAULT '',
  `Alamat` varchar(50) NOT NULL DEFAULT '',
  `Status_per` enum('rujukan','non rujukan') NOT NULL,
  `No_hp` varchar(50) NOT NULL,
  `Pekerjaan` varchar(50) NOT NULL,
  `Kelas_P` enum('1','2','3') NOT NULL,
  PRIMARY KEY (`Nik`),
  KEY `Kode_Dokter` (`Kode_Dokter`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table 1projectrpl.pasien_bpjs: ~1 rows (approximately)
DELETE FROM `pasien_bpjs`;
/*!40000 ALTER TABLE `pasien_bpjs` DISABLE KEYS */;
INSERT INTO `pasien_bpjs` (`No_antrian`, `Nik`, `Kode_Dokter`, `Nama_pasien`, `Jk`, `Tgl_lahir`, `Alamat`, `Status_per`, `No_hp`, `Pekerjaan`, `Kelas_P`) VALUES
	('12', '1', '1', '1', 'L', '1', '1', 'rujukan', '1', '1', '1'),
	('1', '2', '3', '1', 'P', '2', '2', 'rujukan', '2', '2', '3');
/*!40000 ALTER TABLE `pasien_bpjs` ENABLE KEYS */;

-- Dumping structure for table 1projectrpl.rekammedis
CREATE TABLE IF NOT EXISTS `rekammedis` (
  `id_rekammedis` int(3) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `No_KTP` varchar(50) DEFAULT NULL,
  `Nama_pasien` varchar(50) DEFAULT NULL,
  `kode_dokter` varchar(50) DEFAULT NULL,
  `keluhan` varchar(50) DEFAULT NULL,
  `tindakan` varchar(50) DEFAULT NULL,
  `hasil_pemeriksaan` varchar(100) NOT NULL,
  PRIMARY KEY (`id_rekammedis`),
  KEY `No_KTP` (`No_KTP`),
  KEY `kode_dokter` (`kode_dokter`),
  CONSTRAINT `FK_rekammedis_pasien` FOREIGN KEY (`No_KTP`) REFERENCES `pasien` (`No_KTP`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table 1projectrpl.rekammedis: ~0 rows (approximately)
DELETE FROM `rekammedis`;
/*!40000 ALTER TABLE `rekammedis` DISABLE KEYS */;
/*!40000 ALTER TABLE `rekammedis` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
