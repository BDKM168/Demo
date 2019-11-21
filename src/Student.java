/*
public class Student {
    public String Name;
    public int Age;
    private boolean Sex;

    public boolean isSex() {
        return Sex;
    }


   // 突然想与世界为仇
   // 这样我才不值得这个世界惋惜



    public void setSex(boolean sex) {
        Sex = sex;
    }

    public static StringBuffer printInfo(Student st) {
        StringBuffer sb = new StringBuffer();
        sb.append("name : " + st.Name + "\n age : " + st.Age + "\n sex : " + st.Sex);
        return sb;
    }

    // 创建第一个实例
    public static void main(String[] args) {
        Student zhang = new Student();
        zhang.Name = "张子彤";
        String sex = zhang.isSex() ? "女" : "男";
//        System.out.println("name: " + zhang.Name + "sex: " + sex + " age : " + zhang.Age);

//        StringBuffer zz = printInfo(zhang);
//        System.out.println(zz);

        System.out.println(printInfo(zhang));

        // 创建第二个实例
        Student li = new Student();
        li.Name = "liziwen";
        li.Sex = true;
        String lisex = li.isSex() ? "女" : "男";
        li.Age = 15;
//        System.out.println("name: " + li.Name + "sex: " + lisex + " age : " + li.Age);

        System.out.println(printInfo(li));

    }

}
*/

public class Student implements Cloneable{
    private String Name;
    private int age;

    // 构造方法
    public Student(String name, int age){
        this.Name=name;
        this.age=age;
    }

    public Student(){
        this.Name="name";
        this.age=0;
    }

    public String toString(){
        return "学生姓名： "+Name+" 年龄："+age;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("-----------------new---------------------");
        Student st1 =  new Student("程琳",24);
        System.out.println(st1);

        System.out.println("----------------newInstance()----------------");
        Class c1 = Class.forName("Student");
        Student st2 = (Student)c1.newInstance();
        System.out.println(st2);

        System.out.println("----------------clone()-----------------");
        Student st3 = (Student) st2.clone();
        System.out.println(st3);

    }

}

