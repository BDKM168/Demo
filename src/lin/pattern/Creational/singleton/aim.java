package lin.pattern.Creational.singleton;

public class aim {
    /**
     * 在系统开发中，因需求或为了节省资源，需要确保系统中某个类只有唯一一个实例。
     * 当这个唯一实例创建成功之后，我们无法再创建这个类的其他对象，所有关于这个类的操作只能基于这个唯一的实例。
     *
     * 单例模式 Singleton Pattern ： 确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单利类，
     * 它提供全局访问的方法。
     * 是一种对象创建型模式。
     *
     * 要点：1、一个类只能有一个实例。
     *       2、必须自行创建这个实例。
     *       3、必须自行向外界提供这个实例。
     *  角色：
     *  Singleton 单例：在单例类的内部实现只生成一个实例，同时它提供一个静态的getInstance() 工厂方法，
     *  让客户可以访问它的唯一实例；为了防止在外部对其实例化，将其构造函数设计为私有；
     *  在单例内部定义一个Singleton类型的静态对象，作为外部共享的唯一实例。
     */


}