package jingtaidailitest;

public class StaticProxyTest {
    public static void main(String[] args) {
        RealStar rs = new RealStar();
        Proxy s = new Proxy(rs);
        s.confer();
        s.signContract();
        s.bookTicket();
        s.sing();
        s.collectMoney();
    }

}

interface Star{
    void confer();//面谈
    void signContract();//签合同
    void bookTicket();//订票
    void sing();//唱歌
}

class RealStar implements Star{

    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {
        System.out.println("明星唱歌 ");
    }
}

class Proxy implements Star{

    private Star as;
    public Proxy(Star as){
        this.as = as;//构造方法，构造时带Star对象
    }//是Star而非RealStar，但是在真实使用时使用 RealStar对象体现了多态

    @Override
    public void confer() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {
        as.sing();
    }

    public void collectMoney(){
        System.out.println("经纪人收钱");
    }
}