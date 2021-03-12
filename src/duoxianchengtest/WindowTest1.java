package duoxianchengtest;

/*
创建三个窗口卖票，总票数为100张,使用继承Thread类的方式

 */

class Window1 implements Runnable{

    private int ticket =100;//没有加static
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized(this){//线程安全，同步，可以用obj，也可以用this
                // (this是唯一的Window1的对象)，也可以用别的如obj什么的，只要保持唯一
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+
                            "：买票，票号为"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }

        }
    }
}



public class WindowTest1 {
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
