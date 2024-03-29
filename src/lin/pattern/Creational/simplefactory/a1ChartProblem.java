package lin.pattern.Creational.simplefactory;

/**
 * 存在问题：
 * 1.
 * 2.
 * 3.
 *
 */

/**
 * 根据问题引入相应的设计模式：简单工厂模式
 */
class Chart {

    private String type;
    // 图表类型
    public Chart(Object[][] data, String type) {
        this.type = type;
        if (type.equalsIgnoreCase("histogram")) {
            //初始化柱状图

        }
        else if (type.equalsIgnoreCase("pie")) {
            //初始化饼状图

        }
        else if (type.equalsIgnoreCase("line")) {
            //初始化折线图

        }

    }

    public void display() {
        if (this.type.equalsIgnoreCase("histogram")) {
            //显示柱状图
        }
        else if (this.type.equalsIgnoreCase("pie")) {
            //显示饼状图
        }
        else if (this.type.equalsIgnoreCase("line")) {
            //显示折线图
        }
    }

}
