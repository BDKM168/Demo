package com.String;


import java.util.Scanner;


/**
 *
 * buffer.append(str)
 *
 * 替换字符
 *buffer.setCharAt(int index,char ch);
 * 用于在字符串的指定索引位置替换一个字符
 *
 * 反转字符串
 *buffer.reverse()
 * 将字符串原地反转
 *
 * 删除字符
 * deleteCharAt(int index);
 *
 *delete(int start, int end);
 * 删除字符串中的子字符串。
 *
 */


public class Test19 {
    public static void main(String[] args) {
        StringBuffer sys=new StringBuffer("校内课程管理");
        System.out.println("欢迎进入《"+sys+"》系统");
        // 声明课程名称字符串
        StringBuffer courseName=new StringBuffer();
        System.out.println("请录入本学期的五门必须课程: ");

        Scanner input=new Scanner(System.in);

        // 循环接收控制台输入的字符串
        String name="";
        for (int i = 0; i < 5; i++) {
            name=input.next();
            courseName.append(name+"\t");
            if(i==4){
                System.out.println("录入完毕");
            }
        }

        System.out.println("本学期的必修课程有：\n"+courseName);


    }
}
