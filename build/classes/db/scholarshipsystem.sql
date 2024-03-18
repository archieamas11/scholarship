-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2023 at 11:05 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

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
(41, 54, 30, 'Approved'),
(43, 61, 31, 'pending'),
(49, 60, 32, 'pending');

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
(30, 'CHED	', 'Academic', 'retert', 'Approved'),
(31, 'UNIFAST', 'Academic', 'tytyt', 'Pending'),
(32, 'WORKING', 'Academic', 'gtgtgtg', 'Approved');

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
(54, 'Hariell', '@hariell', 'IT', '09808734653', 'Male', 'src/images/business_people_meeting_office_work_corporate_job_male-1079382.jpg!d', 'Single	'),
(58, 'John', '@john', 'IT', '0986876', 'Male', 'src/images/adult-beach-beard-736716.jpg', 'Single '),
(59, 'degods', '@degods', 'IT', '123', 'Male', 'src/images/33.jpg', 'Single '),
(60, 'keana', '@keana', 'IT', '123', 'Male', 'src/images/lore.jpg', 'Married'),
(61, 'test', 'test', 'BSIT', '432432', 'Male', 'src/images/certificate.jpg', 'Single ');

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
(50, 'acidillo', '@degods', '123', 'src/images/wew.png', '$2a$10$kM7HYVaHQTw6AleTlXUDfO/ISGdq2p9L7lmnLUDdDbCHW3T14MgqC', 'admin'),
(51, 'asd', 'sdas', 'asda', 'src/images/1.jpg', '$2a$10$hWcJhrB8an6Zh9ldGgXZtuG4Nr1KGdieEUGymF1Y2HUimxEqjAkJC', 'student'),
(52, 'asda', 'asd', '123', 'src/images/3.jpg', '$2a$10$fHpvhfnTG/JILZ56n9iZq.nLECVlqrpdTZcoSaToSmF5kpmwFPiyi', 'student'),
(53, 'asd', 'asd', '123', 'src/images/4.jpg', '$2a$10$E4zEcSRht8mBb.Jc2VDRAuleoSZ5ztt9cEh2KvegeaB2rPNx.62Du', 'admin'),
(54, 'sds', 'aaa', '1233', 'src/images/1000.jpg', '$2a$10$Txs1bV/BWBATLCyoUGQcweaadav0cR9wL5NA.kItu40wgVpwLWgbC', 'admin'),
(55, 'kean', '@keana', '123', 'src/images/de.jpg', '$2a$10$cCiT.42qUEfsMCG6blt.i./RH3R/zdMJIPpVentJB2Y9/QrhSImiS', 'admin'),
(56, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$zVSS/8ABhFadmVCyM.DnJeBL7V2wCJTyaqoqNNwFCau9gB8uPMp1i', 'admin'),
(57, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$QsozeQUVhGOP0uWYGnMB1.oqRptPNdvdJFh.ReMvwJ9xujM596Qyq', 'admin'),
(58, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$y/fI9wxVZQUq.DOM39muYOOTh0IdPeWuxmF.uwUI00IQDz6ls874G', 'admin'),
(59, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$mqx1d101H.X6BxPProXNKu6FOrkvss0Nj2/TH8DMDDWeUPo2KsljK', 'admin'),
(60, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$dVUXnurYzn1Os1.TvrUnvuUYt5yMtBB8FSERVTm7CcVxxLn9sart2', 'admin'),
(61, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$epp4fWU89ZqCNiQUjF7PVuLa852G.xrPBtH3yn1H4EkopHlzI8nn2', 'admin'),
(62, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$uK2bKHwimUDzIUuLEvE6i.KkVrfrPqgKd5kKz9IpF2dQs2osqWSd.', 'admin'),
(63, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$rnT9ulxttcbl/nF2NazVOOH2Do7D9jRAMlnF2WxT0cN28/eaTZ0he', 'admin'),
(64, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$qef0gmyh2huJh2h26WFoeu8bgWJMWN7OwJq63aeNNVb/9W8E4Q5EC', 'admin'),
(65, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$l3PtFfmcGkUnDiFAJEk/ueBZDxTrMdqJnMNFacbhMm46lrW8I7XiS', 'admin'),
(66, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$x4vkKL7o5Agh0N/3qYyexOOTr90txPKJzGRKLa4tW.7oPOONk4oFe', 'admin'),
(67, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$ylHOCmuWgGcJ7iCKyFTS/.UWGMAKnJHpiQewQ/dneazzrMNcGU.mO', 'admin'),
(68, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$1K1yo0gz9Vj5SAmc5w4bYe/qQQrmEiK63iNPtX1CSx04rf6GaK6JO', 'admin'),
(69, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$2/TazhlvzO5csnjsNS8m5e8nowQvhFjFTeOHP6SE.21f6fbCn9lbm', 'admin'),
(70, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$5Lh9cGYD2zQXqTYvajCoFuQXUYZTgkHA3Qyd8qCCLSejRvxevvx0C', 'admin'),
(71, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$.gys76OjRUpoS7F8L8R8eO9TS2Gwbt8wnknB0xwvcOb3Dppelzbe.', 'admin'),
(72, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$ue/vDsiqxqF5CZNPnR1uCePTJq5GoPV8f5fbDbHc7wxw1iNVkIwJq', 'admin'),
(73, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$XGq4aMqnpiYuYIOzZiAtFOJsfnzayzFmpilFPy08aKD4EwLUaReYm', 'admin'),
(74, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$vYkw0NFdNOyUGZIW0oRoUetrn5V9qL9beDWt3JZ4vhiZlueXD4ko2', 'admin'),
(75, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$sixPKOlWbTb.lzSvBiCx5.XswoDaNNJpy..ms/vIKDwKtqf2Tijd2', 'admin'),
(76, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$Eo/SMS7BffAjNK14z8me8.3NdCM5B/.LMLd3Qj7MbvR44jwpDRTYy', 'admin'),
(77, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$oMX1sigCKJDGvsQCktvL5eshEnz8DtGtSKVlF70nn2wLe/YH9F5Mm', 'admin'),
(78, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/cell.jpg', '$2a$10$z4DcHC8fGOTd4vNtQI8bTuL0FvJTbznTLVp5oNMhYDQTL/ePsCYKy', 'admin'),
(79, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/44.jpg', '$2a$10$9Av9f1uT2j7CAgQ./OpWyOqV.GLZqxdKL6N7Rwwi6kkCCrrAyw9va', 'admin'),
(80, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/44.jpg', '$2a$10$irwk8SOq0PHGNX8xWdhJ/.1GXBG.Jag2KgnqpU15ahJ9WSt4yEjVW', 'admin'),
(81, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/44.jpg', '$2a$10$0lesm.JNH0AmyTOmISAqA.p7/lWzQ8i42Y/IGkL6kAxvIxUBPues.', 'admin'),
(82, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/44.jpg', '$2a$10$ZTLKx8YZ2Nyn7dNAFvqjMuiTna4iNoIH3xBCXFqzQzZcUZdGUjsji', 'admin'),
(83, 'Michael John Bustamante', 'mike@stcecilia.edu.ph', '09458217069', 'src/images/CD.jpg', '$2a$10$sXQXrMXs5No0DfqSiTLM.u9si0Y93ikbA2faEpJyR/QjESNqooWOS', 'admin'),
(84, 'Michael John Bustamante', 'test@test.test', '094582487546', 'src/images/circle 2.png', '$2a$10$I1IdkNwYhtZfsCJwf8M.R.K4/gi89YF9ZGXLhSxY1owsRUSdjtLdu', 'student'),
(85, 'dasdad', 'ada', 'dada', 'src/images/a.pdf', '$2a$10$SthzFAUaBfQ4Y8utzT1YBOrBjp8Pmc7pnbU469qFcchYQhShsziae', 'student'),
(86, '1', '1', '1', 'src/images/black 3.png', '$2a$10$vG98YoLXvl1P68lekmLSOuZwPY4nQN1GzZ/fODaDrs4vGdfQ.bZuW', 'admin');

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
  MODIFY `application_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `table_scholarship`
--
ALTER TABLE `table_scholarship`
  MODIFY `scholarship_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `table_student`
--
ALTER TABLE `table_student`
  MODIFY `student_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT for table `user_table`
--
ALTER TABLE `user_table`
  MODIFY `user_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=87;

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
