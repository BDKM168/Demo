package cn.jdbc;

/**
 *JDBC Java Database Connectivity 提供了一种与平台无关的用于执行sql语句的标准JAVA API，
 * 可以方便地实现多种关系型数据库的统一操作。
 * JDBC 本身提供的是一套数据库操作标准，而这些标准有需要数据库厂商实现，
 * 所以针对每一个数据库厂商都会提供一个JDBC驱动程序，
 */

/**
 * mysql 数据库常用命令
 * 连接数据库   mysql -u root -p
 * 创建数据库 create database dataname;
 * 删除数据库 drop database dataname;
 * 使用数据库 use dataname;
 * 创建数据库表 create table tablename(字段名称 字段类型 默认值 约束 ...);
 * 删除数据库表 drop table 表名称；
 * 查看表名称 desc 表名称；
 * 查看全部数据库 show databases;
 * 查看一个数据库的全部表 show tables;
 */

/**
 * SQL 语法
 * DML Data Manipulation Language 数据操作语言，用于检索或修改数据。
 * DDL Data Definition Language 数据定义语言，用于定义数据的结构，如创建、修改或者删除数据库对象
 * DCL Data Control Language, 数据控制语言，用于定义数据库用户的权限
 *
 * 基本的增删改查
 * 增 insert into tablename （字段1，字段2，。。。，字段n）values（值1，值2，。。。，值n）;
 * 删 delete from tablename 删除条件;
 * 改 update tablename set key1=value1,...,keyn=valuen 修改条件;
 * 查 select key1,key2,...keyn, from tablename where 条件;
 *
 * 注： 在删除数据时，最好指定删除的条件，如果没有指定，则表示删除一章表中全部数据。
 * 修改时也需要指定的修改条件，否则将会修改表中的全部数据。
 */

/**
 * 连接数据库
 * 1.jdbc所需要的四个参数 user password url driverClass 连接数据库所需的驱动
 * 2.加载JDBC驱动: 在连接数据库之前，首先要加载想要连接的数据库的驱动到java虚拟机
 * 3.创建数据库连接
 * 4.创建prepareStatement，要执行sql语句，必须获得java.sql.Statement实例
 * 5.执行sql语句，
 * 6.处理结果。
 * 7.关闭连接。
 *
 */

public class mysqlLearn {
    public static void main(String[] args) {
        System.out.println();
    }
}
