package com.ObjectTe;

public class Teacher {
    private String name;
    private double salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.ObjectTe.Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    // 创建构造方法。
    public Teacher(String name, double salary, int age) {
        /**
         * 使用this 关键字，对属性name . salary 和 age 赋值，this表示当前对象。
         * this.name = name 语句表示一个赋值语句，
         * 等号左边的this.name 是指当前对象具有的变量name 等号右边的name 表示参数传递过来的数值。
         */
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Teacher th=new Teacher("zhang",8000,35);
        System.out.println("教师信息如下： \n"+"name: "+ th.name+"  salary: "+ th.salary+ " age : "+th.age);
    }

}
