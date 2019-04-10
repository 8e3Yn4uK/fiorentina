CREATE DATABASE  IF NOT EXISTS `ac_fiorentina`;
USE `ac_fiorentina`;


DROP TABLE IF EXISTS `first_team`;
CREATE TABLE `first_team` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;


