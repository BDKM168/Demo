package lin.pattern.Creational.simplefactory.ChartDisplay;

public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("Create the Histogram Chart!");
    }

    @Override
    public void display() {
        System.out.println("Display the Histogram Chart!");
    }
}
