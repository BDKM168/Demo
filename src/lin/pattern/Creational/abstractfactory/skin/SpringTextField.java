package lin.pattern.Creational.abstractfactory.skin;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色文本框");
    }
}
