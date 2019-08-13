/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50172
Source Host           : localhost:3306
Source Database       : spring_security

Target Server Type    : MYSQL
Target Server Version : 50172
File Encoding         : 65001

Date: 2019-08-13 13:17:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionName` varchar(255) NOT NULL,
  `permissionTag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '产品查询', 'ROLE_LIST_PRODUCT');
INSERT INTO `sys_permission` VALUES ('2', '产品添加', 'ROLE_ADD_PRODUCT');
INSERT INTO `sys_permission` VALUES ('3', '产品修改', 'ROLE_UPDATE_PRODUCT');
INSERT INTO `sys_permission` VALUES ('4', '产品删除', 'ROLE_DELETE_PRODUCT');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(255) NOT NULL,
  `roleDesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '普通用户', '普通用户');
INSERT INTO `sys_role` VALUES ('2', '管理员', '管理员');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`),
  KEY `index_role_id_permission` (`role_id`) USING BTREE,
  KEY `index_permission_id_role` (`permission_id`) USING BTREE,
  CONSTRAINT `fk_permission_id_role` FOREIGN KEY (`permission_id`) REFERENCES `sys_permission` (`id`),
  CONSTRAINT `fk_role_id_permission` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1');
INSERT INTO `sys_role_permission` VALUES ('1', '2');
INSERT INTO `sys_role_permission` VALUES ('2', '3');
INSERT INTO `sys_role_permission` VALUES ('2', '4');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `realname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `createDate` date DEFAULT NULL,
  `lastLoginTime` datetime DEFAULT NULL,
  `enabled` char(1) NOT NULL DEFAULT '1' COMMENT '1=true，表示禁用，0表示false，表示激活可用，下同',
  `accountNonExpired` char(1) NOT NULL DEFAULT '1',
  `accountNonLocked` char(1) NOT NULL DEFAULT '1',
  `credentialNonExpired` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'a', '大A', '1', '2019-08-04', '2019-08-07 12:45:30', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('2', 'a', 'B哥', '1', '2019-08-08', '2019-08-01 12:46:00', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `index_role_d` (`role_id`) USING BTREE,
  KEY `index_user_id` (`user_id`) USING BTREE,
  CONSTRAINT `fk_role_id` FOREIGN KEY (`user_id`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`role_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '2');

-- ----------------------------
-- Table structure for user_test
-- ----------------------------
DROP TABLE IF EXISTS `user_test`;
CREATE TABLE `user_test` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_test
-- ----------------------------
INSERT INTO `user_test` VALUES ('1', 'AAAAA');
INSERT INTO `user_test` VALUES ('2', 'BBBB');
