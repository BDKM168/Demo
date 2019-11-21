package lin.pattern.Creational.factorymethod.Logger;

abstract class LoggerFactory {
    public void writeLog(){
        Logger logger=this.createLogger();
        logger.writeLog();
    }
    // 抽象工厂类
    public abstract Logger createLogger();

    // 引入重载方法提供不同类型
    public abstract Logger createLogger(String arg);
    public abstract Logger createLogger(Object obj);
}
