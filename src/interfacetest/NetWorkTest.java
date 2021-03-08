package interfacetest;


/*
接口的应用:代理模式

代理模式的作用就是在不改变源代码的基础上，增强功能
 */

public class NetWorkTest {

    public static void main(String[] args) {
        Server server = new Server();//用于下面的调用，因为接口不能自己造对象
        //server 是一个NetWork的实现类的对象
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();

    }

}

interface NetWork{
    public void browse();
}

//被代理类
class  Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}


//代理类 ,通过代理类调用被代理类的同时可以执行一些别的方法
class ProxyServer implements NetWork{

    private NetWork anet;
    public ProxyServer(NetWork anet){
        this.anet = anet;
    }
    public void check(){
        System.out.println("联网前的检查");
    }
    @Override
    public void browse() {
        check();
        anet.browse();
    }
}