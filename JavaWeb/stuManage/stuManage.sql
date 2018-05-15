/*
Navicat PGSQL Data Transfer

Source Server         : localhost_5432
Source Server Version : 100400
Source Host           : localhost:5432
Source Database       : db_stu
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 100400
File Encoding         : 65001

Date: 2018-05-15 17:14:09
*/

CREATE DATABASE db_stu;

-- ----------------------------
-- Table structure for tb_admin
-- ----------------------------
DROP TABLE IF EXISTS "public"."tb_admin";
CREATE TABLE "public"."tb_admin" (
"id" int4 DEFAULT nextval('tb_admin_id_seq'::regclass) NOT NULL,
"username" text COLLATE "default" NOT NULL,
"password" text COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO "public"."tb_admin" VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table tb_admin
-- ----------------------------
ALTER TABLE "public"."tb_admin" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Table structure for tb_stu
-- ----------------------------
DROP TABLE IF EXISTS "public"."tb_stu";
CREATE TABLE "public"."tb_stu" (
"stu_id" text COLLATE "default" NOT NULL,
"stu_name" text COLLATE "default" NOT NULL,
"age" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of tb_stu
-- ----------------------------
INSERT INTO "public"."tb_stu" VALUES ('001', '张三', '23');
INSERT INTO "public"."tb_stu" VALUES ('002', '李四', '19');
INSERT INTO "public"."tb_stu" VALUES ('003', '王五', '18');
INSERT INTO "public"."tb_stu" VALUES ('004', '赵六', '30');
INSERT INTO "public"."tb_stu" VALUES ('005', '小明', '28');
INSERT INTO "public"."tb_stu" VALUES ('007', '小丽', '16');
INSERT INTO "public"."tb_stu" VALUES ('008', '小杜', '25');
INSERT INTO "public"."tb_stu" VALUES ('010', '老王', '18');
INSERT INTO "public"."tb_stu" VALUES ('015', '玛丽', '26');
INSERT INTO "public"."tb_stu" VALUES ('020', '小兵', '27');
INSERT INTO "public"."tb_stu" VALUES ('055', 'sssaa', '26');
INSERT INTO "public"."tb_stu" VALUES ('064', 'aaa', '7');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table tb_stu
-- ----------------------------
ALTER TABLE "public"."tb_stu" ADD PRIMARY KEY ("stu_id");

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS "public"."tb_teacher";
CREATE TABLE "public"."tb_teacher" (
"id" int4 DEFAULT nextval('tb_teacher_id_seq'::regclass) NOT NULL,
"name" text COLLATE "default" NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of tb_teacher
-- ----------------------------
INSERT INTO "public"."tb_teacher" VALUES ('1', '王老师');
INSERT INTO "public"."tb_teacher" VALUES ('2', '张老师');
INSERT INTO "public"."tb_teacher" VALUES ('3', '何老师');
INSERT INTO "public"."tb_teacher" VALUES ('4', '李老师');
INSERT INTO "public"."tb_teacher" VALUES ('5', '蒋老师');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table tb_teacher
-- ----------------------------
ALTER TABLE "public"."tb_teacher" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Table structure for tb_score
-- ----------------------------
DROP TABLE IF EXISTS "public"."tb_score";
CREATE TABLE "public"."tb_score" (
"id" int4 DEFAULT nextval('tb_score_id_seq'::regclass) NOT NULL,
"stu_id" text COLLATE "default",
"chinese" float8,
"math" float8,
"english" float8
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of tb_score
-- ----------------------------
INSERT INTO "public"."tb_score" VALUES ('1', '001', '65', '96', '87');
INSERT INTO "public"."tb_score" VALUES ('2', '002', '71', '74', '76');
INSERT INTO "public"."tb_score" VALUES ('3', '005', '66', '92', '84');
INSERT INTO "public"."tb_score" VALUES ('4', '008', '92', '93', '95');
INSERT INTO "public"."tb_score" VALUES ('5', '015', '75', '86', '64');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table tb_score
-- ----------------------------
ALTER TABLE "public"."tb_score" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Foreign Key structure for table "public"."tb_score"
-- ----------------------------
ALTER TABLE "public"."tb_score" ADD FOREIGN KEY ("stu_id") REFERENCES "public"."tb_stu" ("stu_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
