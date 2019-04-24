
DROP SCHEMA IF EXISTS `university` ;
CREATE SCHEMA IF NOT EXISTS `university` DEFAULT CHARACTER SET utf8;
USE `university` ;

DROP TABLE IF EXISTS `department` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `department` (
  `department_name` VARCHAR(45) NOT NULL,
  `employee_count` INT NOT NULL,
  PRIMARY KEY (`department_name`))
ENGINE = InnoDB;

SHOW WARNINGS;

DROP TABLE IF EXISTS `lecturer` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `lecturer` (
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `rank` VARCHAR(45) NOT NULL,
  `salary` INT NOT NULL,
  PRIMARY KEY (`surname`))
ENGINE = InnoDB;

SHOW WARNINGS;

DROP TABLE IF EXISTS `department_statistic` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `department_statistic` (
  `department_department_name` VARCHAR(45) NOT NULL,
  `assistams_count` INT NOT NULL,
  `professors_count` INT NOT NULL,
  `associate_professors_count` INT NOT NULL,
  `average_salary` INT NOT NULL,
  `head_of_department_name` VARCHAR(45) NOT NULL)
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

