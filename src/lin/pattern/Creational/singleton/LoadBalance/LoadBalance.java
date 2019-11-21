package lin.pattern.Creational.singleton.LoadBalance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 负载均衡器LoadBalance：单例类，真实环境下该类将非常复杂，包括大量初始化的工作和业务方法，
 */
public class LoadBalance {
    // 私有静态成员变量，存储唯一实例
    private static LoadBalance instance = null;
    private List serverList = null;

    // 私有构造函数
    private LoadBalance() {
        serverList = new ArrayList();
    }

    // 公有静态成员方法，返回唯一实例
    public static LoadBalance getLoadBalance() {
        if (instance == null) {
            instance = new LoadBalance();
        }
        return instance;
    }

    // 增加 服务器
    public void addServer(String server) {
        serverList.add(server);
    }

    // 删除服务器
    public void deleteServer(String server) {
        serverList.remove(server);
    }

    // 使用random类随机获取服务器
    public String getServer() {
        Random random=new Random();
        int i =random.nextInt(serverList.size());
        System.out.println();
        return (String) serverList.get(i);
    }
}
