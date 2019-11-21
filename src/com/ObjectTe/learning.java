package com.ObjectTe;
// 访问控制

/**
 * 类的访问控制只能是空或者public
 * 方法和属性的访问控制符，public private protected friendly(默认)
 */

// 类的成员变量分类
/**
 * 类的成员变量分为两种，静态变量 或 类变量 指被static修饰的成员变量；实例变量，没有被static修饰的成员变量
 *
 * 区别：
 *  运行时，java虚拟机只为静态变量分配一次内存，在加载类的过程中完成静态变量的内存分配。
 *  在类的内部，可以在任何方法内直接访问静态变量，在其他类中，可以通过类名访问该类中的静态变量。
 *
 *  对于实例变量，每创建一个实例，java虚拟机就会为实例变量分配一次内存。在类的内部，可以在非静态方法中直接访问实例变量；
 *  在本类的静态方法中或其他类中则需要通过类的实例对象进行访问。
 *
 *  静态变量在类中的作用：
 *  1.静态变量可以被类的所有实例共享，因此静态变量可以作为实例间的共享数据，增加实例之间的交互性。
 *  2.如果所有的实例都包含一个相同的常量属性，则可以把这个属性定义为静态常量类型，从而节省内存空间。
 *
 */

// pretend busy in company

/**
 *
 * 成员方法 ： 静态方法 ， 实例方法
 *
 * 区别：
 *  静态方法不需要通过它所属类的任何实例就可以调用，因此在静态方法中不能使用this关键字，
 *  也不能直接访问所属类的实例变量和实例方法，但是可以直接访问 静态方法和静态变量、
 *
 *  在实例方法中可以直接访问所属类的静态变量 静态方法 实例变量 实例方法。
 *
 *  在访问非静态方法时，需要通过实例对象来访问，如果访问静态方法，可以直接方法，也可以通过类名方法，也可以通过实例对象访问。
 *
 */

/**
 * 静态代码块 java类中 的 static{} 主要用于初始化代码块，为类的静态变量赋初始值。
 * 静态代码块类似于一个方法，但是不可以存在于任何方体中。
 * Java虚拟机 在加载类时 会执行静态代码块。如果包含多个，按出现的顺序执行，每个静态代码块只会执行一次。
 *
 */


public class learning {

    //用户类
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 创建构造函数
    public learning(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return
                "用户名：" + username + "\n"+
                        "密  码：" + password ;
    }


}
