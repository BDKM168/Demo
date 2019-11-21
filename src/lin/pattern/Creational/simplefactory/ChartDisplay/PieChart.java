package lin.pattern.Creational.simplefactory.ChartDisplay;

public class PieChart implements Chart {
    public PieChart() {
        System.out.println("Create the Pie Chart!");
    }

    @Override
    public void display() {
        System.out.println("Display the Pie Chart!");
    }
}
