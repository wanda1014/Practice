DROP TABLE if EXISTS tb_stu;
CREATE TABLE tb_stu (
  id SERIAL,
  name text DEFAULT NULL,
  sex text DEFAULT NULL,
  birthday date DEFAULT NULL,
PRIMARY KEY (id)
)
INSERT INTO "tb_stu" VALUES (3, '张三', '男', '2017-8-9');
INSERT INTO "tb_stu" VALUES (4, '李四', '男', '2018-5-1');
INSERT INTO "tb_stu" VALUES (6, '小丽', '女', '2012-6-1');
