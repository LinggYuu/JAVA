package duoxianchengtest;

/*

创建三个窗口卖票，总票数为100张,使用继承Thread类的方式

 */

//下列程序未解决线程安全问题
class Window extends Thread{

     private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println(getName()+":票号为"+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}






public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();
        t1.start();
        t2.start();
        t3.start();

    }
}
