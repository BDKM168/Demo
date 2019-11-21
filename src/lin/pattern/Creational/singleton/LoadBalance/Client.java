package lin.pattern.Creational.singleton.LoadBalance;

public class Client {
    public static void main(String[] args) {
        // 创建四个LoadBalance 对象
        LoadBalance balance1, balance2, balance3, balance4;
        balance1 = LoadBalance.getLoadBalance();
        balance2 = LoadBalance.getLoadBalance();
        balance3 = LoadBalance.getLoadBalance();
        balance4 = LoadBalance.getLoadBalance();

        // 判断 服务器负载均衡器是否相同，
        if (balance1 == balance2 && balance2 == balance3 && balance3 == balance4) {
            System.out.println("服务器负载均衡器具有唯一性。");
        }

        // 添加服务器
        balance1.addServer("Server 1");
        balance2.addServer("Server 2");
        balance3.addServer("Server 3");
        balance4.addServer("Server 4");

        // 模拟客户端请求的分发
        for (int i = 0; i < 10; i++) {
            String server=balance1.getServer();
            System.out.println("分发请求值服务器："+server);
        }
    }
}
