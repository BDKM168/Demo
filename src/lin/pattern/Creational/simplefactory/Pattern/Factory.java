package lin.pattern.Creational.simplefactory.Pattern;

/**
 * 简单工厂模式 Simple a2Factory Pattern： 定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常
 * 都具有共同的父类。
 *
 * 要点：当你需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，而无须知道其创建细节。
 *
 * 角色：
 *  Factory 工厂角色 ： 工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；
 *   工厂类可以被外界直接调用，创建所需的产品对象，在工厂类中提供了静态的工厂方法 factoryMethod(),
 *   它的返回类型为抽象产品类型Product。
 *
 *  Product 抽象产品角色  ： 它是工厂类所创建的所有对象的父类，封装了各种产品对象的公有方法，
 *
 *  ConcreateProduct 具体产品角色：它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。
 *
 *
 *
 */
public class Factory {
//    //static Factory Method
//    public static Product getProduct(String arg) {
//        Product product = null;
//        if (arg.equalsIgnoreCase("A")) {
//            //set up environment
//            product = new ConcreateProductA();
//            //initialize product
//        }
//        else if (arg.equalsIgnoreCase("B")) {
//            //set up environment
//            product = new ConcreateProductB();
//            //initialize product
//        }
//        return product;
//    }
    // 对外提供一个静态工厂方法
    public static Product getProduct(String arg){
        Product product =null;
        if (arg.equalsIgnoreCase("A")){
            product = new ConcreateProductA();
        }else if (arg.equalsIgnoreCase("B")){
            product = new ConcreateProductB();
        }
        return product;
    }
}







