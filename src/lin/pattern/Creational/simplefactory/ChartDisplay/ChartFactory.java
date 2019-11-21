package lin.pattern.Creational.simplefactory.ChartDisplay;

public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;

        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("Initialize the Histogram Chart");

        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("Initialize the Pie Chart");

        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("Initialize the Line Chart");
        }
        return chart;
    }
}
