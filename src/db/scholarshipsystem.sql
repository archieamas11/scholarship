-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2024 at 07:37 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

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
-- Table structure for table `application_table`
--

CREATE TABLE `application_table` (
  `application_id` int(50) NOT NULL,
  `student_id` int(50) NOT NULL,
  `scholarship_id` int(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `application_table`
--

INSERT INTO `application_table` (`application_id`, `student_id`, `scholarship_id`, `status`) VALUES
(30, 54, 30, 'Pending');

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
(30, 'CHED	', 'Academic', 'retert', 'Declined'),
(31, 'UNIFAST', 'Academic', 'tytyt', 'Pending'),
(32, 'WORKING', 'Academic', 'gtgtgtg', 'Approved'),
(33, 'CHED	', 'Academic', 'uyuyu', 'Approved'),
(35, 'UNIFAST', 'Academic', '232323', 'Declined');

-- --------------------------------------------------------

--
-- Table structure for table `table_student`
--

CREATE TABLE `table_student` (
  `student_id` int(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gmail` varchar(50) NOT NULL,
  `student_course` varchar(20) NOT NULL,
  `student_contactnum` varchar(15) NOT NULL,
  `student_gender` varchar(50) NOT NULL,
  `image` varchar(600) NOT NULL,
  `student_status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_student`
--

INSERT INTO `table_student` (`student_id`, `name`, `gmail`, `student_course`, `student_contactnum`, `student_gender`, `image`, `student_status`) VALUES
(54, 'Hariell', '@hariell', 'IT', '09808734653', 'Male', '', 'Single	'),
(58, 'John', '@john', 'IT', '0986876', 'Male', 'src/images/adult-beach-beard-736716.jpg', 'Single '),
(59, 'jafit', '@jafit', 'BSIT', '09805687567', 'Male', '', 'Single	');

-- --------------------------------------------------------

--
-- Table structure for table `user_table`
--

CREATE TABLE `user_table` (
  `user_id` int(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `image` varchar(600) NOT NULL,
  `password` varchar(200) NOT NULL,
  `role` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_table`
--

INSERT INTO `user_table` (`user_id`, `username`, `email`, `contact`, `image`, `password`, `role`) VALUES
(44, 'joshua', '@josh', '098098797', '', '$2a$10$r7J.l90Xg0Ti6bYqfHPzOuz8ZfNHzq4TEQ6MO079CDua4vFXzv..2', 'admin'),
(45, 'joshua', '@josh', '098098797', '', '123', 'admin'),
(46, 'joshua', '@josh', '098098797', 'src/images/th (2).jpg', 'src/images/th (2).jpg', 'admin'),
(47, 'ty', '@josh', 'ty', 'src/images/design-images-hd-9.jpg', '$2a$10$nR2W.3VaxnUKqpfZ.dKg7uH/8.ktHipIcRIqyiS8QNVVW374mA0GW', 'student'),
(48, 'wewe', '@we', '2131234', 'src/images/adult-beach-beard-736716.jpg', '$2a$10$HGVxCa.3nWOaZ6jWrtDOlOvMFfFL5/6wnjxrvs47sloH4t3pG0SDW', 'student'),
(49, 'Salmeron', '@hariell', '0896867', 'src/images/adult-beach-beard-736716.jpg', '$2a$10$ul/dIhsf/NIri8QTx8pV9uh4prNFgmvKETEl/due8zVGARvf7g2LS', 'student'),
(50, '1', '1', '1', 'src/images/daylight-forest-glossy-443446.jpg', '$2a$10$jfQRyi0Bqym9sr.ObGfAYO9aS0YfkpxGZMAcZxgMaHrUP28abvfda', 'student'),
(51, '2', '2', '2', 'src/images/966930_568942176489549_649850531_o.jpg', '$2a$10$R/P5lncbg3xStfvd3k3TYORi9dczgKZ.xt89Cxd7cvXYFs15gVLGO', 'student'),
(52, 'a', 'a', 'a', 'src/images/Project.log', '$2a$10$5.jH9KLIORnJKR/GPQPc8u6pkPbum/hZykDPFHZNSLdpLGno1rBj6', 'admin'),
(53, 'e', 'e', 'e', 'src/images/nature-wallpaper-27.jpg.crdownload', '$2a$10$ZW2H7rRgEr.RlYB3xmIzC.kmnxH0qJW6gTfUSLzjPj6Ni/uXAQBZ.', 'admin'),
(54, 'archie', 'oten', 's', 'src/images/32432423.jpg', '$2a$10$I9pyqdtooj0XeMBDhOot.ubfYfgXPJqA9EoagHMkhZTuQp6ip4sCe', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `application_table`
--
ALTER TABLE `application_table`
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
-- Indexes for table `user_table`
--
ALTER TABLE `user_table`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `application_table`
--
ALTER TABLE `application_table`
  MODIFY `application_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `table_scholarship`
--
ALTER TABLE `table_scholarship`
  MODIFY `scholarship_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `table_student`
--
ALTER TABLE `table_student`
  MODIFY `student_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT for table `user_table`
--
ALTER TABLE `user_table`
  MODIFY `user_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `application_table`
--
ALTER TABLE `application_table`
  ADD CONSTRAINT `application_table_ibfk_1` FOREIGN KEY (`scholarship_id`) REFERENCES `table_scholarship` (`scholarship_id`),
  ADD CONSTRAINT `application_table_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `table_student` (`student_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
