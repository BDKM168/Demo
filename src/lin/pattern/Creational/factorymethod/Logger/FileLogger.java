package lin.pattern.Creational.factorymethod.Logger;

public class FileLogger implements Logger {
    // 具体产品类
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
