package lin.pattern.Creational.factorymethod.Logger;

public class DatabaseLogger implements Logger {
    // 具体产品类
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
