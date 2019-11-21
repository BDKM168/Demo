package lin.pattern.Creational.simplefactory.Pattern;

public class ConcreateProductA extends Product {
    @Override
    public String methodDiff() {
        System.out.println("realize the method of Product A");
        String arg = "Product A";
        return arg;
    }
}
