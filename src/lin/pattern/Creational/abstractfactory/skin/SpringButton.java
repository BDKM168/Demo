package lin.pattern.Creational.abstractfactory.skin;

public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
