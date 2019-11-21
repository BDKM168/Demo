package cn.jdbc;

import java.sql.*;

/**
 * jdbc连接数据库主要步骤
 * 1.连接数据库的参数：user password url driverClass
 * 2.加载driverClass驱动，
 * 3.获取连接
 * 4.创建statement对象，创建sql语句
 * 5.执行sql
 * 6.处理返回结果
 * 7.关闭连接。
 */
public class jdbcConnection {
    static final String user="root";
    static final String pass="0000";
    static final String url="jdbc:mysql://localhost:3306/linsql";
    static final String driverClass="com.mysql.jdbc.Driver";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 加载驱动
            Class.forName(driverClass);
            // 获取连接
            conn= DriverManager.getConnection(url,user,pass);
            // 创建 stmt 对象
            stmt=conn.createStatement();
            // 创建sql语句
            String sql = "select id,name,url from websites";
            // 执行sql
           rs = stmt.executeQuery(sql);

            // 处理结果
            while(rs.next()){
                // 通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                System.out.println("id: "+id+"  name: "+name+"  url: "+url);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 关闭连接
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
