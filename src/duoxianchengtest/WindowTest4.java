package duoxianchengtest;

/*
使用同步方法解决继承Thread类方式中的线程安全问题

 */

//下列程序未解决线程安全问题
class Window4 extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            show();
        }
    }

    private static synchronized  void show(){
        /*
        如果只有synchronized的话就是有t1,t2,t3,是不安全的，当前点同步监视器是this
         要将其 变为static的，当前的同步监视器是 Window4.class
         */

        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":票号为"+ticket);
            ticket--;
        }
    }
}


public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();
        t1.start();
        t2.start();
        t3.start();

    }
}
