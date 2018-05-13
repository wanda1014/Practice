package cn.wanda.chapter20;

import java.sql.*;

/**
 * 查找数据表tb_emp中销售部的所有成员
 */

public class SearchEmp {

    //连接、数据库、结果集
    static Connection con;
    static Statement sql;
    static ResultSet rs;

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
        SearchEmp emp = new SearchEmp();
        //得到连接
        con = emp.getConnection();

        try {
            //向数据库发送sql
            sql = con.createStatement();
            //得到结果集
            rs = sql.executeQuery("select * from tb_emp where dapt = '销售部'");

            //遍历结果集
            while (rs.next()){
                String id = rs.getString(1);
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String birthday = rs.getString("birthday");
                String dapt = rs.getString("dapt");
                //输出信息
                System.out.println(id +"\t" + name +"\t" + sex +"\t" + birthday +"\t" + dapt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
