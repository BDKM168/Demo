package com.JDBC;

import java.sql.*;

public class jdbcConnection {
    /**
     * mysql8.0以上的版本 数据库连接有所不同
     * 1. 8.0以上版本 驱动板本包 mysql-connector-java-8.0.16.jar
     * 2. 加载驱动方式不同， com.mysql.jdbc.Driver 更换为 com.mysql.cj.jdbc.Driver
     * 8.0以上版本需要建立SSL连接，需要显示关闭。
     * 最有需要设置CST.
     *
     * @param args
     */

    // mysql 8.0 以下   jdbc驱动名 和 数据库
    static final String jdbc_driver = "com.mysql.jdbc.Driver";
    static final String db_url = "jdbc:mysql://localhost:3306/linsql";
    static final String user = "root";
    static final String pass = "0000";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt=null;
        try {
            // 注册 JDBC 驱动
            Class.forName(jdbc_driver);

            //打开连接
            System.out.println("connection the mysql....");
            conn= DriverManager.getConnection(db_url,user,pass);

            // execute sql 首先创建sql语句，创建statement对象，然后执行
            String sql="select id,name,url from websites";
            stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集
            while(rs.next()){
                // 通过字段检索
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String url=rs.getString("url");

                // 输出数据
                System.out.println("ID : "+id+", 站点名称："+name+", 站点URL："+url);
            }

            // 关闭连接
            rs.close();
            stmt.close();
            conn.close();

        }catch (SQLException se){
            // 处理JDBC错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理Class.forName() 错误
            e.printStackTrace();
        }finally
        {
            // 强制关闭资源
            try
            {
                if (stmt!=null){
                    stmt.close();
                }
            }catch (SQLException se2){
//                se2.printStackTrace();
            }

            try{
                if (conn!=null){
                    conn.close();
                }
            }catch(SQLException se3){
//
            }
        }

        System.out.println("执行结束！！！");
    }

}
