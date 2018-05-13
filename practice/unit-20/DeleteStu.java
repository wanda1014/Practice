package cn.wanda.chapter20;

import java.sql.*;

public class DeleteStu {

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
            //传递sql
            sql = con.prepareStatement("delete from tb_stu where birthday < ?");

            //设置参数
            sql.setDate(1,Date.valueOf("2010-01-01"));

            //执行sql
            sql.executeUpdate();
            System.out.println("信息删除成功！");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
