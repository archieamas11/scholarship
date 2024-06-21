-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2024 at 11:18 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `scholarshipsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `table_admin`
--

CREATE TABLE `table_admin` (
  `user_id` int(50) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(600) NOT NULL,
  `email` varchar(100) NOT NULL,
  `number` varchar(100) NOT NULL,
  `image` varchar(600) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_admin`
--

INSERT INTO `table_admin` (`user_id`, `first_name`, `last_name`, `username`, `password`, `email`, `number`, `image`, `status`) VALUES
(58, 'archie', 'albarico', '@archie', '$2a$10$LHzJTicwLHO98VugjgvI4ucnX9PkAiX4fBtFCdHc3UpXr9XgqdyVi', 'archiealbarico69@gmail.com', '09231226478', 'src/profile_picture/default_profile.png', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `table_applicants`
--

CREATE TABLE `table_applicants` (
  `application_id` int(50) NOT NULL,
  `student_id` int(50) NOT NULL,
  `scholarship_id` int(50) NOT NULL,
  `grade_picture` varchar(600) NOT NULL,
  `applicants_status` varchar(50) NOT NULL,
  `date_applied` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_applicants`
--

INSERT INTO `table_applicants` (`application_id`, `student_id`, `scholarship_id`, `grade_picture`, `applicants_status`, `date_applied`) VALUES
(36, 60, 36, 'src/grades_picture/8.png', 'Accept', '2024-06-22');

-- --------------------------------------------------------

--
-- Table structure for table `table_scholarship`
--

CREATE TABLE `table_scholarship` (
  `scholarship_id` int(50) NOT NULL,
  `scholarship_name` varchar(20) NOT NULL,
  `scholarship_type` varchar(50) NOT NULL,
  `scholarship_descrip` longtext NOT NULL,
  `scholarship_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_scholarship`
--

INSERT INTO `table_scholarship` (`scholarship_id`, `scholarship_name`, `scholarship_type`, `scholarship_descrip`, `scholarship_status`) VALUES
(36, 'UNIFAST', 'Government', 'ssssssssssssssssssss', 'Approved');

-- --------------------------------------------------------

--
-- Table structure for table `table_student`
--

CREATE TABLE `table_student` (
  `student_id` int(20) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone_number` varchar(100) NOT NULL,
  `program` varchar(100) NOT NULL,
  `year_level` varchar(100) NOT NULL,
  `image` varchar(900) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_student`
--

INSERT INTO `table_student` (`student_id`, `first_name`, `last_name`, `email`, `gender`, `dob`, `address`, `phone_number`, `program`, `year_level`, `image`, `status`) VALUES
(60, 'archie', 'albarico', 'archiealbarico69@gmail.com', 'Male', '2000-10-24', 'tunghaan, minglanilla, cebu', '09231226478', 'BSIT', '2nd year', 'src/profile_picture/download.jpg', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `table_admin`
--
ALTER TABLE `table_admin`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `table_applicants`
--
ALTER TABLE `table_applicants`
  ADD PRIMARY KEY (`application_id`),
  ADD UNIQUE KEY `student_id` (`student_id`),
  ADD UNIQUE KEY `scholarship_id` (`scholarship_id`);

--
-- Indexes for table `table_scholarship`
--
ALTER TABLE `table_scholarship`
  ADD PRIMARY KEY (`scholarship_id`);

--
-- Indexes for table `table_student`
--
ALTER TABLE `table_student`
  ADD PRIMARY KEY (`student_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `table_admin`
--
ALTER TABLE `table_admin`
  MODIFY `user_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT for table `table_applicants`
--
ALTER TABLE `table_applicants`
  MODIFY `application_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `table_scholarship`
--
ALTER TABLE `table_scholarship`
  MODIFY `scholarship_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `table_student`
--
ALTER TABLE `table_student`
  MODIFY `student_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `table_applicants`
--
ALTER TABLE `table_applicants`
  ADD CONSTRAINT `table_applicants_ibfk_1` FOREIGN KEY (`scholarship_id`) REFERENCES `table_scholarship` (`scholarship_id`),
  ADD CONSTRAINT `table_applicants_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `table_student` (`student_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
