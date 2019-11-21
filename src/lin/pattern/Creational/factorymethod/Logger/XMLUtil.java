package lin.pattern.Creational.factorymethod.Logger;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtil {
    // 该方法用于从XML文件中提取具体类类型，并返回一个实例对象
    public static Object getBean(){
        try {
            // 创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("C:\\IdeaWorkspace\\Dome\\src\\lin\\pattern\\Creational\\factorymethod\\Logger\\config.xml"));

            // 获取包含类型的文本节点
            NodeList nl =doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String name = classNode.getNodeValue();
//            name="Logger."+name;
            // 通过具体类 类名 生成实例对象并将其返回
//            Class c=Class.forName(name);
            Class c=Class.forName(name);
            Object obj= c.newInstance();

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
