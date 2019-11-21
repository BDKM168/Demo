package lin.pattern.Creational.simplefactory.ChartDisplay;

public class Client {
    public static void main(String[] args) {
        Chart chart;
//        chart=ChartFactory.getChart("histogram");
        // 使用xmlUtil 读取配置文件中的参数
        String type= XMLUtil.getChartType();
        // 创建产品对象
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}

