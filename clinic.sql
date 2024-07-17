drop database if exists clinic;

create database if not exists clinic charset=utf8 collate=utf8_general_ci;

use clinic ;

--
-- Database: `clinic`
--

-- --------------------------------------------------------

--
-- Table structure for table `diagnosis`
--

CREATE TABLE `diagnosis` (
  `Date` varchar(20) NOT NULL,
  `Info_about_illness` varchar(500) NOT NULL,
  `Diag_id` int(11) NOT NULL,
  `Patient _ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `ID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Address` varchar(300) NOT NULL,
  `Phone` varchar(30) NOT NULL,
  `E-mail` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `Specialty` varchar(30) NOT NULL,
  `Studying` varchar(30) NOT NULL,
  `Salary` int(5) NOT NULL,
  `National_ID` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`ID`, `Name`, `Address`, `Phone`, `E-mail`, `Age`, `Specialty`, `Studying`, `Salary`, `National_ID`) VALUES
(1, 'Abdullah Hisham', 'Egypt , Qalyubia , Benha', '01040456633', 'Abdo1935@gmail.com', 0, 'Brain and nerve surgery', 'Cairo University-faculty of me', 0, '');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `Patient _ID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Phone` varchar(30) NOT NULL,
  `E-mail` varchar(30) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Symptom` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  `National_id` varchar(16) NOT NULL,
  `Treat_id` int(11) NOT NULL,
  `Doctor_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `treatment`
--

CREATE TABLE `treatment` (
  `Treat_id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Cost` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diagnosis`
--
ALTER TABLE `diagnosis`
  ADD PRIMARY KEY (`Diag_id`),
  ADD KEY `Patient _ID` (`Patient _ID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `National_ID` (`National_ID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`Patient _ID`),
  ADD UNIQUE KEY `National_id` (`National_id`),
  ADD KEY `Treat_id` (`Treat_id`),
  ADD KEY `Doctor_ID` (`Doctor_ID`);

--
-- Indexes for table `treatment`
--
ALTER TABLE `treatment`
  ADD PRIMARY KEY (`Treat_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diagnosis`
--
ALTER TABLE `diagnosis`
  MODIFY `Diag_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `Patient _ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `treatment`
--
ALTER TABLE `treatment`
  MODIFY `Treat_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `diagnosis`
--
ALTER TABLE `diagnosis`
  ADD CONSTRAINT `diagnosis_ibfk_1` FOREIGN KEY (`Patient _ID`) REFERENCES `patient` (`Patient _ID`);

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor` (`ID`),
  ADD CONSTRAINT `patient_ibfk_3` FOREIGN KEY (`Treat_id`) REFERENCES `treatment` (`Treat_id`);
COMMIT;


