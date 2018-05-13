DROP TABLE if EXISTS tb_emp;
CREATE TABLE tb_emp (
  id SERIAL,
  name text DEFAULT NULL,
  sex text DEFAULT NULL,
  birthday date DEFAULT NULL,
  dapt text DEFAULT NULL,
PRIMARY KEY (id)
)
INSERT INTO "tb_emp" VALUES (1, '张三', '男', '2014-6-11', '销售部');
INSERT INTO "tb_emp" VALUES (2, '李四', '男', '2018-5-9', '研发部');
INSERT INTO "tb_emp" VALUES (3, '小红', '女', '2007-6-14', '维修部');
INSERT INTO "tb_emp" VALUES (4, '丽丽', '女', '2018-5-8', '销售部');
INSERT INTO "tb_emp" VALUES (5, '赵六', '男', '2018-2-13', '研发部');
INSERT INTO "tb_emp" VALUES (6, '杨树林', '男', '2010-10-21', '销售部');
