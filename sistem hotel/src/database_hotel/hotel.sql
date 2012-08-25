-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 25, 2012 at 06:23 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'fiyan', 'difa'),
(2, 'fadchur', 'oyi');

-- --------------------------------------------------------

--
-- Table structure for table `master_costumer`
--

CREATE TABLE IF NOT EXISTS `master_costumer` (
  `id_ktp` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(11) NOT NULL,
  PRIMARY KEY (`id_ktp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `master_kamar`
--

CREATE TABLE IF NOT EXISTS `master_kamar` (
  `id_kamar` int(11) NOT NULL AUTO_INCREMENT,
  `tipe_kamar` varchar(10) NOT NULL,
  `harga` double NOT NULL,
  PRIMARY KEY (`id_kamar`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tabel_check_in`
--

CREATE TABLE IF NOT EXISTS `tabel_check_in` (
  `id_ktp` varchar(20) NOT NULL,
  `id_kamar` varchar(20) NOT NULL,
  `tanggal_check_in` date NOT NULL,
  `harga_sewa` double NOT NULL,
  PRIMARY KEY (`id_ktp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tabel_check_out`
--

CREATE TABLE IF NOT EXISTS `tabel_check_out` (
  `id_ktp` int(10) NOT NULL,
  `id_kamar` int(10) NOT NULL,
  `tgl_check_out` date NOT NULL,
  PRIMARY KEY (`id_ktp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabel_check_out`
--

INSERT INTO `tabel_check_out` (`id_ktp`, `id_kamar`, `tgl_check_out`) VALUES
(356473, 642242, '2000-11-11');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
