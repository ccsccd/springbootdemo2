/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : springbootdemo2

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 29/03/2019 21:33:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for message_board
-- ----------------------------
DROP TABLE IF EXISTS `message_board`;
CREATE TABLE `message_board`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `pid` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of message_board
-- ----------------------------
INSERT INTO `message_board` VALUES (1, 'qqq', 'qwerty', 0);
INSERT INTO `message_board` VALUES (2, 'www', 'wertyu', 0);
INSERT INTO `message_board` VALUES (3, 'eee', 'ertyui', 1);
INSERT INTO `message_board` VALUES (4, 'rrr', 'rtyuio', 3);
INSERT INTO `message_board` VALUES (5, 'ttt', 'tyuiop', 0);
INSERT INTO `message_board` VALUES (6, 'yyy', 'yuiopl', 5);

SET FOREIGN_KEY_CHECKS = 1;
