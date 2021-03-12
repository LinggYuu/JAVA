package duoxianchengtest;


/*

使用同步代码块解决继承Thread类的方式的线程安全问题

 */

//下列程序未解决线程安全问题
class Windoww extends Thread{

    private static int ticket = 100;
    private static Object obj = new Object();//需要是一个类变量才行
    @Override
    public void run() {
        while(true){
            synchronized (Windoww.class){
                /*
                这里与WindowTest1中的不同，不能用this，因为这里的this代表着
                t1,t2,t3三个对象
                这里可以写Windoww.class,一个运行时类对象，是唯一的，
                因为只会加载一次就等于只有一个
                在继承Thread类创建多线程得到方式中，慎用this充当同步监视器，
                考虑使用当前类充当同步监视器
                 */
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+":票号为"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}






public class WindowTest2 {
    public static void main(String[] args) {
        Windoww t1 = new Windoww();
        Windoww t2 = new Windoww();
        Windoww t3 = new Windoww();
        t1.start();
        t2.start();
        t3.start();

    }
}
