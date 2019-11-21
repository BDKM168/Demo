package lin.pattern.Creational.factorymethod.Logger;

public class DatabaseLoggerFactory extends LoggerFactory {
    // 具体工厂类

    /**
     * 具体工厂类实现抽象工厂方法，来创建具体产品
     * @return
     */
    @Override
    public Logger createLogger() {
        Logger logger =new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String arg) {
        Logger logger =new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        Logger logger =new DatabaseLogger();
        return logger;
    }
}
