package com.ObjectTe;

import java.util.Scanner;

public class Mtest {
    public static void main(String[] args) {
        // 创建用户对象
        Member admin = new Member("admin","123456");
        Scanner input = new Scanner(System.in);
        System.out.println("请输出原密码： ");
        String pwd = input.next();
        // 判断密码
        if (pwd.equals(admin.getPassword()))
        {
            // 修改用户密码
            System.out.println("请输入新密码：");
            admin.setPassword(input.next());
        }
        else
        {
            System.out.println("输入密码错误，无法进行修改");
        }
        System.out.println("---------------------------"+"\n"+admin);
    }
}
