package lin.pattern.Creational.factorymethod;

import java.util.logging.Logger;

// 日志记录器 工厂
public class LoggerFactory {
    // 静态工厂方法
    public static Logger createLogger(String args){
        if (args.equalsIgnoreCase("db")){
            // 省略
            Logger logger = null;// new DatabaseLogger();
            return logger;
        }else if (args.equalsIgnoreCase("file")){
            Logger logger = null; // new FileLogger();
            return logger;
        }else{
            return null;
        }
    }
    /**
     * ，我们对上述代码进行了简化，省略了具体日志记录器类的初始化代码。
     * 在LoggerFactory类中提供了静态工厂方法createLogger()，用于根据所传入的参数创建各种不同类型的日志记录器。
     * 通过使用简单工厂模式，我们将日志记录器对象的创建和使用分离，客户端只需使用由工厂类创建的日志记录器对象即可，
     * 无须关心对象的创建过程，但是我们发现，虽然简单工厂模式实现了对象的创建和使用分离，但是仍然存在如下两个问题：
     *
     * 1.工厂类过于庞大，包含了大量的if else 语句，导致测试和维护困难。
     * 2.系统扩展不灵活，如果增加新类型的日志记录，必须要修改工厂代码。
     */
    /**
     * 引入工厂方法：不在提供一个统一的工厂类来创建所有的产品对象，
     * 而是针对不同的产品提供不同的工厂，系统提供一个与产品等级结构对应的工厂等级结构。
     */
}
