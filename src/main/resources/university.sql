
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


DROP SCHEMA IF EXISTS `university` ;

CREATE SCHEMA IF NOT EXISTS `university` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `university` ;

DROP TABLE IF EXISTS `department` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `department` (
  `department_name` VARCHAR(45) NOT NULL,
  `head_of_department_name` VARCHAR(45) NULL,
  `assistams_count` INT ,
  `professors_count` INT NULL,
  `associate_professors_count` INT NOT NULL,
  `average_salary` INT NULL,
  `emloyee_count` INT NULL,
  PRIMARY KEY (`department_name`))
ENGINE = InnoDB;

SHOW WARNINGS;

DROP TABLE IF EXISTS `lecturer` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `lecturer` (
  `name` VARCHAR(45) NOT NULL,
  `rank` VARCHAR(45) NOT NULL,
  `salary` INT NOT NULL,
  `department_department_name` VARCHAR(45) NOT NULL)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_lecturer_department1_idx` ON `lecturer` (`department_department_name` ASC) VISIBLE;

SHOW WARNINGS;

