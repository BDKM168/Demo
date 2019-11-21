package lin.pattern.Creational.factorymethod.Logger;

import java.io.File;

public class FileLoggerFactory extends LoggerFactory {
    // 具体工厂类

    /**
     * 具体类实现抽象工厂的方法，来创建具体产品
     * @return
     */
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String arg) {
        Logger logger = new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        return null;
    }


}
