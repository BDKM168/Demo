package lin.pattern.Creational.abstractfactory.skin;

import javax.xml.bind.annotation.XmlAccessOrder;

public class client {
    public static void main(String[] args) {
        // 使用抽象层定义
        SkinFactory factory= (SkinFactory) XMLUtil.getBean();
        Button bt = factory.createButton();
        TextField tf = factory.createTextField();
        ComboBox cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
