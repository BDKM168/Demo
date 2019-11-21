package lin.pattern.Creational.simplefactory.ChartDisplay;

public class LineChart implements Chart {
    public LineChart() {
        System.out.println("Create the Line Chart!");
    }

    @Override
    public void display() {
        System.out.println("Display the Line Chart!");
    }
}
