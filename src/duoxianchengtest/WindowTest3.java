package duoxianchengtest;

/*
使用同步方法解决线程安全问题

 */

class Window3 implements Runnable{

    private int ticket =100;//没有加static
    Object obj = new Object();
    @Override
    public  void run() {//不能把run改成synchronized，因为它会把while包含了进去
        while (ticket > 0){
                show();
            }
    }

    public synchronized void show(){//在同步方法中，它的监视器就是this
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+
                    "：买票，票号为"+ticket);
            ticket--;
        }
    }
}



public class WindowTest3 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        //此时，因为只创建了一个Window1对象，因而ticket不用加static
        //三个线程自然地共享一个ticket变量
        //如果又造了一个Window1 ww，则另说
        Thread t = new Thread(w);//一个线程
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        t.setName("win1");
        t1.setName("win2");
        t2.setName("win3");
        t.start();
        t1.start();
        t2.start();
    }
}
