package lin.pattern.Creational.simplefactory.Pattern;

public class ConcreateProductB extends  Product {
    @Override
    public String methodDiff() {
        System.out.println("realize the method of ProductB");
        String arg = "Product B";
        return arg;
    }
}
