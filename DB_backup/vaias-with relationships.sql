-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2017 at 08:38 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vaias`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `USER_NAME` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE `driver` (
  `VID` varchar(10) NOT NULL,
  `UID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `family_member`
--

CREATE TABLE `family_member` (
  `UID` varchar(10) NOT NULL,
  `FID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE `hospital` (
  `HID` varchar(10) NOT NULL,
  `HOSPITAL_NAME` varchar(100) NOT NULL,
  `PROVINCE` varchar(100) NOT NULL,
  `DISTRICT` varchar(100) NOT NULL,
  `CITY` varchar(100) NOT NULL,
  `LAT` float NOT NULL,
  `LON` float NOT NULL,
  `TP` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `owner`
--

CREATE TABLE `owner` (
  `VID` varchar(10) NOT NULL,
  `UID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `police_station`
--

CREATE TABLE `police_station` (
  `PID` varchar(10) NOT NULL,
  `PROVINCE` varchar(100) NOT NULL,
  `DIVITION` varchar(100) NOT NULL,
  `CITY` varchar(100) NOT NULL,
  `LAT` float NOT NULL,
  `LON` float NOT NULL,
  `TP` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `post_accident`
--

CREATE TABLE `post_accident` (
  `AID` varchar(10) NOT NULL,
  `VID` varchar(10) NOT NULL,
  `UID` varchar(10) NOT NULL,
  `LAT` float NOT NULL,
  `LON` float NOT NULL,
  `DATE` date NOT NULL,
  `TIME` time NOT NULL,
  `HID` varchar(10) NOT NULL,
  `PID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UID` varchar(10) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `FIRST_NAME` varchar(100) NOT NULL,
  `LAST_NAME` varchar(100) NOT NULL,
  `GENDER` varchar(10) NOT NULL,
  `TP_HOME` int(10) NOT NULL,
  `TP_MOBILE` int(10) NOT NULL,
  `ADDRESS` varchar(500) NOT NULL,
  `LICENSE_NO` varchar(10) NOT NULL,
  `BLOOD_GROUP` varchar(5) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `BIRTH_DAY` date NOT NULL,
  `OTHER` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `VID` varchar(10) NOT NULL,
  `REGISTER_NO` varchar(100) NOT NULL,
  `CHASSI_NO` varchar(100) NOT NULL,
  `ENGINE_NO` varchar(100) NOT NULL,
  `VEHICLE_TYPE` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`VID`, `REGISTER_NO`, `CHASSI_NO`, `ENGINE_NO`, `VEHICLE_TYPE`) VALUES
('122', 'kjshd', 'kjs', 'ajkshd', 'ajsdh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`USER_NAME`);

--
-- Indexes for table `driver`
--
ALTER TABLE `driver`
  ADD PRIMARY KEY (`VID`),
  ADD KEY `UID` (`UID`),
  ADD KEY `UID_2` (`UID`),
  ADD KEY `VID` (`VID`),
  ADD KEY `UID_3` (`UID`);

--
-- Indexes for table `family_member`
--
ALTER TABLE `family_member`
  ADD PRIMARY KEY (`UID`,`FID`),
  ADD KEY `UID` (`UID`),
  ADD KEY `FID` (`FID`);

--
-- Indexes for table `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`HID`);

--
-- Indexes for table `owner`
--
ALTER TABLE `owner`
  ADD PRIMARY KEY (`VID`),
  ADD KEY `VID` (`VID`),
  ADD KEY `UID` (`UID`);

--
-- Indexes for table `police_station`
--
ALTER TABLE `police_station`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `post_accident`
--
ALTER TABLE `post_accident`
  ADD PRIMARY KEY (`AID`),
  ADD KEY `VID` (`VID`),
  ADD KEY `UID` (`UID`),
  ADD KEY `HID` (`HID`),
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UID`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`VID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `driver`
--
ALTER TABLE `driver`
  ADD CONSTRAINT `driver_ibfk_1` FOREIGN KEY (`VID`) REFERENCES `vehicle` (`VID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `driver_ibfk_2` FOREIGN KEY (`UID`) REFERENCES `user` (`UID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `family_member`
--
ALTER TABLE `family_member`
  ADD CONSTRAINT `family_member_ibfk_1` FOREIGN KEY (`UID`) REFERENCES `user` (`UID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `owner`
--
ALTER TABLE `owner`
  ADD CONSTRAINT `owner_ibfk_1` FOREIGN KEY (`VID`) REFERENCES `vehicle` (`VID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `owner_ibfk_2` FOREIGN KEY (`UID`) REFERENCES `user` (`UID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `post_accident`
--
ALTER TABLE `post_accident`
  ADD CONSTRAINT `post_accident_ibfk_1` FOREIGN KEY (`HID`) REFERENCES `hospital` (`HID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `post_accident_ibfk_2` FOREIGN KEY (`PID`) REFERENCES `police_station` (`PID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `post_accident_ibfk_3` FOREIGN KEY (`VID`) REFERENCES `vehicle` (`VID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
