-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 14, 2017 at 02:35 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `webdevproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `IdUser` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Surname` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Country` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`IdUser`, `Name`, `Surname`, `Username`, `Password`, `Country`, `Email`) VALUES
(1, 'Pedro', 'Delmonte', 'pedrodelmonte', '827ccb0eea8a706c4c34a16891f84e7b', 'Brasil', 'pdelmonte@gmail.com'),
(2, 'JKDFHA', 'JKADH', 'KSHDGAK', 'JKAHDJK', 'AJKDHAJKS', 'ADSJH'),
(3, 'JKDFHA', 'JKADH', 'KSHDGAK', 'JKAHDJK', 'AJKDHAJKS', 'ADSJH'),
(4, 'JKDFHA', 'JKADH', 'KSHDGAK', 'JKAHDJK', 'AJKDHAJKS', 'ADSJH'),
(5, 'JKAHDJK', 'JKDFHA', 'KSHDGAK', 'JKADH', 'AJKDHAJKS', 'ADSJH'),
(6, 'JKDFHA', 'JKADH', 'KSHDGAK', 'JKAHDJK', 'AJKDHAJKS', 'ADSJH'),
(7, 'JKDFHA', 'JKADH', 'KSHDGAK', 'JKAHDJK', 'AJKDHAJKS', 'ADSJH'),
(8, 'JKDFHA', 'JKADH', 'KSHDGAK', 'JKAHDJK', 'AJKDHAJKS', 'ADSJH'),
(9, 'JKDFHA', 'JKADH', 'KSHDGAK', 'JKAHDJK', 'AJKDHAJKS', 'ADSJH'),
(10, 'adjkfhajk', 'jkadhajk', 'asdjas', 'asdkjfha', 'jkadhjkas', 'hfajdh'),
(11, 'adjkfhajk', 'jkadhajk', 'asdjas', 'asdkjfha', 'jkadhjkas', 'hfajdh'),
(12, 'adjkfhajk', 'jkadhajk', 'asdjas', 'asdkjfha', 'jkadhjkas', 'hfajdh'),
(13, 'adjkfhajk', 'jkadhajk', 'asdjas', 'a751fb4e83a0bc603be8f63e9e951eab', 'jkadhjkas', 'hfajdh'),
(14, 'adjkfhajk', 'jkadhajk', 'asdjas', 'a751fb4e83a0bc603be8f63e9e951eab', 'jkadhjkas', 'hfajdh'),
(15, 'ahsdajksdh', 'jkahsdjk', 'asdsiu', '229ae56bf5c7e60a1d0db30b423e6af6', 'jkahs', 'jakhsdjk');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`IdUser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Users`
--
ALTER TABLE `Users`
  MODIFY `IdUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
