-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2017 at 07:00 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aias`
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
-- Table structure for table `family`
--

CREATE TABLE `family` (
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
  ADD KEY `UID_2` (`UID`);

--
-- Indexes for table `family`
--
ALTER TABLE `family`
  ADD PRIMARY KEY (`UID`,`FID`);

--
-- Indexes for table `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`HID`);

--
-- Indexes for table `owner`
--
ALTER TABLE `owner`
  ADD PRIMARY KEY (`VID`);

--
-- Indexes for table `police_station`
--
ALTER TABLE `police_station`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `post_accident`
--
ALTER TABLE `post_accident`
  ADD PRIMARY KEY (`AID`);

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

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
