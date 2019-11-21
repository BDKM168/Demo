package lin.pattern.Creational.factorymethod.Logger;


public class client {
    public static void main(String[] args) {
//        LoggerFactory factory;
//        Logger logger;
//        factory = new FileLoggerFactory();
//        logger=factory.createLogger();
//        logger.writeLog();
        /**
         * 引入XmlUtil类和配置文件之后，如果要增加新的日志记录方式，只需要执行如下步骤
         * 1、新的日志记录器需要 实现 Logger接口
         * 2、对应增加一个新的具体日志记录工厂，实现 抽象日志工厂LoggerFactory，并实现其中的工厂方法，
         *      设置好初始化参数和环境变量，返回具体日志记录对象
         * 3、修改config.xml 将新增的具体日志记录器工厂类的类名字符串替换原有的工厂类类名字符串
         * 4、编译新增的 具体日志记录器类 和 具体日志记录器工厂类，运行客户端测试类，即可使用新的日志记录方式，
         *      而原有的类库代码无须做任何修改，完全符合“开闭原则”
         *
         *
         *
         */
//        // 通过配置文件和反射实现具体产品的创建
//        LoggerFactory factory;
//        Logger logger;
//        // getBean 返回类型为Object，需要进行强制类型转换
//        factory = (LoggerFactory) XMLUtil.getBean();
//        logger=factory.createLogger();
//        logger.writeLog();

        // 隐藏客户端功能
        LoggerFactory factory;
//        Logger logger;
        // getBean 返回类型为Object，需要进行强制类型转换
        factory = (LoggerFactory) XMLUtil.getBean();
//        logger=factory.createLogger();
        factory.writeLog();

    }
}
