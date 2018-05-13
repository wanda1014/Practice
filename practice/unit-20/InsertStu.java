package cn.wanda.chapter20;

import java.sql.*;

/**
 * 向数据库表tb_stu中添加数据
 */

public class InsertStu {

    //连接、数据库、结果集
    static Connection con;
    static PreparedStatement sql;

    //得到连接的方法
    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_test",
                    "postgres", "123");
            //           System.out.println("连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        InsertStu stu = new InsertStu();
        //得到连接
        con = stu.getConnection();

        try {
            //向数据库发送sql
            sql = con.prepareStatement("insert into tb_stu(name,sex,birthday) values(?,?,?)");

            sql.setString(1,"李某");
            sql.setString(2,"女");
   //         sql.setString(3,"1992/10/19");
            sql.setDate(3,Date.valueOf("1992-10-19"));

            sql.executeUpdate();
            System.out.println("信息插入成功！");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

