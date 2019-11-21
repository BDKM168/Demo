package com.ObjectTe;

public class ObjectTest implements Cloneable {
    /**
     * Java 对象的创建
     * 显示创建对象：
     * 1.使用new关键字创建对象
     * 2.调用java.lang.Class or java.lang.reflect.Constuctor 类 的 newInstance() 实例方法。
     * java.lang.Class Class ClassName =  java.lang.Class.forName()
     * ClassName objectName = （ClassName）
     * 3.调用对象的clone() 方法
     * 4.调用java.io.ObjectInputStream 对象的readObject() 方法
     */

    /**
     * 隐含创建对象
     */

    /**
     * 无论哪种方式创建对象，Java虚拟机在创建一个对象时都包含以下步骤：
     * 1.给对象分配内存
     * 2.将对象的实例变量自动初始化为其变量类型的默认值
     * 3.初始化对象，给实例变量赋予正确的初始值。
     */

    /**
     * 注：每个对象都是相互独立的，在内存中占有独立的内存地址，并且每个对象都具有自己的生命周期，
     * 当一个对象的生命周期结束时，对象就变成了垃圾，有java虚拟机自带的垃圾回收机制处理。
     */

    private String Name;
    private int age;

    public ObjectTest(String name, int age) {
        this.Name = name;
        this.age = age;
    }

    public ObjectTest(){
        this.Name="name";
        this.age=0;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        System.out.println("-------------使用new关键字创建对象-------------");
        ObjectTest ot =new ObjectTest("lin yucheng",23);
        System.out.println("new object: "+ot);

        System.out.println("-------------调用 java.long.Class 的 newInstance() 方法创建对象----------------- ");
        Class st2 = Class.forName("ObjectTest");
        System.out.println(st2);

    }

}
