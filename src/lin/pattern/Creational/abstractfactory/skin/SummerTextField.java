package lin.pattern.Creational.abstractfactory.skin;

public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅蓝色文本框");
    }
}
