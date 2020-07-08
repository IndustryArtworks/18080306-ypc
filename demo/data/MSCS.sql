/*
 Navicat Premium Data Transfer

 Source Server         : LocalHost
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : utf-8

 Date: 07/01/2020 10:52:02 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- Table structure for `MSCS.html`

DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (`id` int(11) NOT NULL AUTO_INCREMENT,
                        `no` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '编号',
                        `name` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '品名',
                        `description` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '描述',
                        `price` double(10,2) DEFAULT '0' COMMENT '单价',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='存货表';

DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (`id` int(11) NOT NULL AUTO_INCREMENT,
                        `no` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '编号',
                        `name` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '会员名',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='会员表';

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (`id` int(11) NOT NULL AUTO_INCREMENT,
                        `no` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '编号',
                        `name` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '姓名',
                        `position` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '职位',
                        `password` varchar(100) CHARACTER SET utf8 DEFAULT 'err' COMMENT '登录密码',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='雇员表';

--  Records of `MSCS.html`

BEGIN;
INSERT INTO `goods` VALUES ('1', '001', '鸡蛋', '为了追求产量而恨不得从母鸡体内直接掏出来的新鲜鸡蛋', '50'),
                           ('2', '002', '牛奶', '在冷藏了24小时之后，商家尽最大努力去保证新鲜的牛乳', '90');
INSERT INTO `member` VALUES ('1', '001', '会员甲'),
                            ('2', '002', '会员乙');
INSERT INTO `employee` VALUES ('1', '001', 'Alpha', 'salesperson', 'ahlap'),
                             ('2', '002', 'Beta', 'salesperson', 'teab'),
                             ('3', '003', 'Gamma', 'manager', 'amaga'),
                             ('4', '004', 'Delta', 'system', 'atled');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
