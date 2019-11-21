package com.String;

public class StringBufferTest {
    /**
     * StringBuffer 类是可变字符串类，创建StringBuffer 类的对象后可以随意修改字符创内容
     *
     * 每个StringBuffer 类的对象都能够存储指定容量的字符创，如果字符串长度超过了对象的容量，则该对象会自动扩大。
     *
     */
    /*
    wechat
    qq
    weibo
    douyin
    toutiao
    git
    csdn
    timepill
    jianshu

    gotohell
     */
    /*
        StringBuffer 类 提供了3个构造方法 来创建一个字符串
        StringBuffer（） 构造一个空的字符缓冲区，并初始化为16个字符的容量
        StringBuffer（int length）创建一个空的缓冲区，并且初始化为指定长度length的容量
        StringBuffer（String str）创建一个字符串缓冲区，并将其内容初始化为指定的字符串内容，str，
        字符串缓冲区的初始容量为16加上字符串str的长度
     */
    public static void main(String[] args) {
        // 空构造函数，初始长度为16
        StringBuffer str1=new StringBuffer();

        // 指定长度，指定长度10
        StringBuffer str2 = new StringBuffer(10);

        // 指定字符串内容，初始长度16+字符串长度8
        StringBuffer str3 = new StringBuffer("ChengLin");


        System.out.println(str1.capacity());
        System.out.println(str2.capacity());
        System.out.println(str3.capacity());

        String str = " So Cold ！";

        str3.append(str);

        System.out.println(str3);

    }

}
