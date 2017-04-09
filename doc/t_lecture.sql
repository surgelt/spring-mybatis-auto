/*
Navicat MySQL Data Transfer

Source Server         : tom-connect1
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-04-09 22:34:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_lecture
-- ----------------------------
DROP TABLE IF EXISTS `t_lecture`;
CREATE TABLE `t_lecture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lecture_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cnname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sex` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_student_health_female
-- ----------------------------
DROP TABLE IF EXISTS `t_student_health_female`;
CREATE TABLE `t_student_health_female` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `check_date` datetime DEFAULT NULL,
  `heart` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `liver` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spleen` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `lung` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `kindey` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uterus` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_student_health_male
-- ----------------------------
DROP TABLE IF EXISTS `t_student_health_male`;
CREATE TABLE `t_student_health_male` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `check_date` datetime DEFAULT NULL,
  `heart` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `liver` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `spleen` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `lung` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `kindey` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prostate` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_student_lecture
-- ----------------------------
DROP TABLE IF EXISTS `t_student_lecture`;
CREATE TABLE `t_student_lecture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `lecture_id` int(11) DEFAULT NULL,
  `grade` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_student_selfcard
-- ----------------------------
DROP TABLE IF EXISTS `t_student_selfcard`;
CREATE TABLE `t_student_selfcard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `native` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `issue_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
