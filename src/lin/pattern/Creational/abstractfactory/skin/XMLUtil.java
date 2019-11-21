package lin.pattern.Creational.abstractfactory.skin;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    // 该方法用于从xml配置文件中提取具体类 类名，并返回一个实例对象
    public static Object getBean() {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("C:\\IdeaWorkspace\\Dome\\src\\lin\\pattern\\Creational\\abstractfactory\\skin\\config.xml"));

            // 获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String url = classNode.getNodeValue();

            //通过类名生成实例对象 并将其返回
            Class c = Class.forName(url);
            Object obj = c.newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
